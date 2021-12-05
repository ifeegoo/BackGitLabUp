package com.ifeegoo.app.backgitlabup.tools;

import com.alibaba.fastjson.JSON;
import com.ifeegoo.app.backgitlabup.beans.ProjectsItem;
import com.ifeegoo.app.backgitlabup.beans.Response;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.util.ArrayList;
import java.util.List;

public class BackGitLabUp {

    private static BackGitLabUp sBackGitLabUp;
    private String mGitLabURL = "";
    private String mGitLabAPIVersion = "";
    private String mGitLabGroupID = "";
    private String mGitLabPrivateToken = "";
    private String mGitLabRepositoryAccessType = "";

    private List<String> mTotalRepositoriesURLs = new ArrayList<String>();
    private List<String> mTotalRepositoriesDirectories = new ArrayList<String>();

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
        String apiURL = this.mGitLabURL + "/api/" + this.mGitLabAPIVersion + "/groups/" + this.mGitLabGroupID + "?private_token=" + this.mGitLabPrivateToken;

        try
        {
            run(apiURL);

            Response response = JSON.parseObject(run(apiURL), Response.class);


            List<ProjectsItem> projects = response.getProjects();

            if ((projects == null) || (projects.size() == 0))
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


        } catch (Exception e)
        {

        }
    }

    static OkHttpClient client = new OkHttpClient();

    private String run(String url) throws Exception
    {
        Request request;
        okhttp3.Response response = null;

        try
        {
            request = new Request.Builder()
                    .url(url)
                    .build();

            response = client.newCall(request).execute();
        } catch (Exception e)
        {

        }

        String result = response.body().string();

        System.out.println(result);

        return result;
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
}
