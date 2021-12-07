package com.ifeegoo.app.backgitlabup.tools;

import com.alibaba.fastjson.JSON;
import com.ifeegoo.app.backgitlabup.beans.all.Project;

import com.ifeegoo.app.backgitlabup.beans.group.ProjectsItem;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BackGitLabUp {

    private static BackGitLabUp sBackGitLabUp;
    private static final int MAX_ACCOUNT_PER_PAGE = 100;
    private static final int MIN_ACCOUNT_PER_PAGE = 20;


    private String mGitLabURL = "";
    private String mGitLabAPIVersion = "";
    private String mGitLabGroupID = "";
    private String mGitLabPrivateToken = "";
    private String mGitLabRepositoryAccessType = "";

    private List<String> mTotalRepositoriesURLs = new ArrayList<String>();
    private List<String> mTotalRepositoriesDirectories = new ArrayList<String>();

    private List<ProjectsItem> mTotalRepositoriesTempByGroupID = new ArrayList<ProjectsItem>();

    private BackGitLabUp()
    {
    }

    public static synchronized BackGitLabUp getInstance()
    {
        if (sBackGitLabUp == null)
        {
            sBackGitLabUp = new BackGitLabUp();
        }

        return sBackGitLabUp;
    }

    /**
     * This is a helper class for users to get the version of BackGitLabUp.
     *
     * @since 0.1.0
     */
    public static final class VERSION {

        /**
         * The build number of BackGitLabUp.
         *
         * @since 0.1.0
         */
        public static final int BUILD = 1;

        /**
         * The major number of the version name of BackGitLabUp.
         *
         * @since 0.1.0
         */
        public static final int MAJOR = 0;

        /**
         * The minor number of the version name of BackGitLabUp.
         *
         * @since 0.1.0
         */
        public static final int MINOR = 1;

        /**
         * The patch number of the version name of BackGitLabUp.
         *
         * @since 0.1.0
         */
        public static final int PATCH = 0;

        /**
         * The status of the version name of BackGitLabUp.
         *
         * @since 0.1.0
         */
        public static final String STATUS = "";

        /**
         * The version name of BackGitLabUp.
         *
         * @since 0.1.0
         */
        public static final String NAME = MAJOR + "." + MINOR + "." + PATCH + "-" + STATUS;
    }

    public BackGitLabUp setGitLabURL(String gitLabURL)
    {
        this.mGitLabURL = gitLabURL;

        return sBackGitLabUp;
    }

    public BackGitLabUp setGitLabAPIVersion(String gitLabAPIVersion)
    {
        this.mGitLabAPIVersion = gitLabAPIVersion;

        return sBackGitLabUp;
    }

    public BackGitLabUp setGitLabGroupID(String gitLabGroupID)
    {
        this.mGitLabGroupID = gitLabGroupID;

        return sBackGitLabUp;
    }

    public BackGitLabUp setGitLabPrivateToken(String gitLabPrivateToken)
    {
        this.mGitLabPrivateToken = gitLabPrivateToken;

        return sBackGitLabUp;
    }

    public BackGitLabUp setGitLabRepositoryAccessType(String gitLabRepositoryAccessType)
    {
        this.mGitLabRepositoryAccessType = gitLabRepositoryAccessType;

        return sBackGitLabUp;
    }

    public void start()
    {
        this.getTotalRepositoriesURLs();
        this.generateBashFile();
    }

    private void getTotalRepositoriesURLs()
    {
        int page = 0;
        String apiURL = "";
        while (true)
        {
            page++;
            if ((this.mGitLabGroupID != null) && (this.mGitLabGroupID != ""))
            {
                apiURL = this.mGitLabURL + "/api/" + this.mGitLabAPIVersion + "/groups/" + this.mGitLabGroupID + "?private_token=" + this.mGitLabPrivateToken  + "&per_page=" + MAX_ACCOUNT_PER_PAGE + "&page=" + page;

                try
                {
                    List<ProjectsItem> projectItems = JSON.parseObject(run(apiURL), com.ifeegoo.app.backgitlabup.beans.group.Response.class).getProjects();

                    if ((projectItems == null) || (projectItems.size() == 0) || (projectItems.equals(this.mTotalRepositoriesTempByGroupID)))
                    {
                        return;
                    }

                    for (int i = 0; i < projectItems.size(); i++)
                    {
                        switch (this.mGitLabRepositoryAccessType)
                        {
                            case "SSH":
                                this.mTotalRepositoriesURLs.add(projectItems.get(i).getSshUrlToRepo());
                                break;
                            case "HTTP":
                                this.mTotalRepositoriesURLs.add(projectItems.get(i).getHttpUrlToRepo());
                                break;
                        }

                        this.mTotalRepositoriesDirectories.add(projectItems.get(i).getPathWithNamespace());
                    }

                    projectItems = this.mTotalRepositoriesTempByGroupID;

                    if (projectItems.size() < MAX_ACCOUNT_PER_PAGE)
                    {
                        return;
                    }

                } catch (Exception e)
                {

                }
            }
            else
            {
                apiURL = this.mGitLabURL + "/api/" + this.mGitLabAPIVersion + "/projects?private_token=" + this.mGitLabPrivateToken + "&per_page=" + MAX_ACCOUNT_PER_PAGE + "&page=" + page;

                try
                {
                    List<Project> projects = JSON.parseArray(run(apiURL), Project.class);

                    if ((projects == null) || (projects.size() == 0) || (projects.equals(this.mTotalRepositoriesTempByGroupID)))
                    {
                        return;
                    }

                    for (int i = 0; i < projects.size(); i++)
                    {
                        switch (this.mGitLabRepositoryAccessType)
                        {
                            case "SSH":
                                this.mTotalRepositoriesURLs.add(projects.get(i).getSshUrlToRepo());
                                break;
                            case "HTTP":
                                this.mTotalRepositoriesURLs.add(projects.get(i).getHttpUrlToRepo());
                                break;
                        }

                        this.mTotalRepositoriesDirectories.add(projects.get(i).getPathWithNamespace());
                    }

                    if (projects.size() < MAX_ACCOUNT_PER_PAGE)
                    {
                        return;
                    }
                }catch (Exception e)
                {
                }
            }

            if (this.mTotalRepositoriesDirectories.size() >= 10000)
            {
                return;
            }

        }
    }

    private void resetData()
    {
        this.mGitLabURL = "";
        this.mGitLabAPIVersion = "";
        this.mGitLabGroupID = "";
        this.mGitLabPrivateToken = "";
        this.mGitLabRepositoryAccessType = "";

        this.mTotalRepositoriesURLs = new ArrayList<String>();
        this.mTotalRepositoriesDirectories = new ArrayList<String>();

        this.mTotalRepositoriesTempByGroupID = new ArrayList<ProjectsItem>();
    }

    static OkHttpClient client = new OkHttpClient();

    private String run(String url) throws Exception
    {
        Request request;
        Response response = null;

        try
        {
            request = new Request.Builder()
                    .url(url)
                    .build();

            response = client.newCall(request).execute();
        } catch (Exception e)
        {

        }

        return response.body().string();
    }

    private void generateBashFile()
    {
        BufferedOutputStream bufferedOutput = null;

        try
        {

            bufferedOutput = new BufferedOutputStream(new FileOutputStream("BackGitLabUp.sh"));

            bufferedOutput.write("GITLAB_REPOSITORIES_URLS=(".getBytes());
            for (int i = 0; i < this.mTotalRepositoriesURLs.size(); i++)
            {
                bufferedOutput.write(("\n" + this.mTotalRepositoriesURLs.get(i)).getBytes());
            }
            bufferedOutput.write(")\n\n".getBytes());

            bufferedOutput.write("GITLAB_REPOSITORIES_DIRS=(".getBytes());
            for (int i = 0; i < this.mTotalRepositoriesDirectories.size(); i++)
            {
                bufferedOutput.write(("\n" + this.mTotalRepositoriesDirectories.get(i)).getBytes());
            }
            bufferedOutput.write(")\n\n".getBytes());

            bufferedOutput.write("if [ ! -d \"BackGitLabUp\" ]; then\n".getBytes());
            bufferedOutput.write("  echo \"Creating folder BackGitLabUp\"\n".getBytes());
            bufferedOutput.write("  mkdir \"BackGitLabUp\"\n".getBytes());
            bufferedOutput.write("  cd \"BackGitLabUp\"\n".getBytes());
            bufferedOutput.write("else\n".getBytes());
            bufferedOutput.write("  echo \"BackGitLabUp directory is exist\"\n".getBytes());
            bufferedOutput.write("  if [ \"$(ls -A BackGitLabUp)\" ]; then\n".getBytes());
            bufferedOutput.write(
                    "     echo \"\\033[1;31mBackGitLabUp directory is not empty, BackGitLabUp default directory is BackGitLabUp, make sure that you are not using BackGitLabUp under the directory now.\\033[0m\"\n".getBytes());
            bufferedOutput.write("     exit\n".getBytes());
            bufferedOutput.write("  fi\n".getBytes());
            bufferedOutput.write("fi\n\n".getBytes());

            bufferedOutput.write(
                    ("for index in {0.." + (this.mTotalRepositoriesDirectories.size() - 1) + "}\n").getBytes());
            bufferedOutput.write(("do\n").getBytes());
            bufferedOutput.write(
                    ("echo \"\\033[32mStart cloning \"$index\"/" + (this.mTotalRepositoriesDirectories.size() - 1) + "\\033[0m\"\n\n").getBytes());
            bufferedOutput.write(("  if [ ! -d ${GITLAB_REPOSITORIES_DIRS[${index}]} ]; then\n").getBytes());
            bufferedOutput.write(("    echo \"Creating folder \"${GITLAB_REPOSITORIES_DIRS[${index}]}\n").getBytes());
            bufferedOutput.write(("    mkdir -p ${GITLAB_REPOSITORIES_DIRS[${index}]}\n").getBytes());
            bufferedOutput.write(
                    ("    git clone ${GITLAB_REPOSITORIES_URLS[${index}]} ${GITLAB_REPOSITORIES_DIRS[${index}]}\n").getBytes());
            bufferedOutput.write(("  fi\n\n").getBytes());
            bufferedOutput.write(
                    ("echo \"\\033[32mFinished cloning \"$index\"/" + (this.mTotalRepositoriesDirectories.size() - 1) + "\\033[0m\"\n\n").getBytes());
            bufferedOutput.write(("done").getBytes());
        } catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        } catch (IOException ex)
        {
            ex.printStackTrace();
        } finally
        {
            try
            {
                if (bufferedOutput != null)
                {
                    bufferedOutput.flush();
                    bufferedOutput.close();


                }

                this.resetData();
            } catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }
}
