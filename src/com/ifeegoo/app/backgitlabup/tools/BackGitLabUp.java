package com.ifeegoo.app.backgitlabup.tools;

public class BackGitLabUp {

    private static BackGitLabUp sBackGitLabUp;
    private String mGitLabURL = "";
    private String mGitLabAPIVersion = "";
    private String mGitLabGroupID = "";
    private String mGitLabPrivateToken = "";
    private String mGitLabRepositoryAccessType = "";

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

    public BackGitLabUp start()
    {
        String apiURL = this.mGitLabURL + "/api/" + this.mGitLabAPIVersion + "/groups/" + this.mGitLabGroupID + "?private_token=" + this.mGitLabPrivateToken;


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
}
