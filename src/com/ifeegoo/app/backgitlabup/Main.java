package com.ifeegoo.app.backgitlabup;

import com.ifeegoo.app.backgitlabup.tools.BackGitLabUp;

public class Main {

    private static String sParameter;
    private static String sGitLabUrl;
    private static String sGitLabGroupID;
    private static String sGitLabPrivateToken;
    private static String sGitLabRepositoryAccessType;

    private static final String NAME_TOOL = BackGitLabUp.class.getSimpleName();

    public static void main(String[] args) {
        if ((args != null) && (args.length >= 1))
        {
            sParameter = args[0];

            switch (args.length)
            {
                case 1:
                {
                    switch (sParameter)
                    {
                        case "-help":
                        {
                            System.out.println(NAME_TOOL + ": " + BackGitLabUp.VERSION.NAME + "(" + BackGitLabUp.VERSION.BUILD +")");
                            System.out.println(NAME_TOOL + " is a simple & useful GitLab backup tool.");
                            System.out.println();
                            System.out.println("Usage:");
                            System.out.println();
                            System.out.println("1. Use [-help] to get how to use BackGitLabUp.");
                            System.out.println("java -jar BackGitLabUp.jar -help");
                            System.out.println();
                            System.out.print("2. Use [-v] or [-ver] or [-version] to get the Version of BackGitLabUp.");
                            System.out.println("java -jar BackGitLabUp.jar -v");
                            System.out.println("java -jar BackGitLabUp.jar -ver");
                            System.out.println("java -jar BackGitLabUp.jar -version");
                            System.out.println();
                            System.out.println(
                                    "3.Use [-backup] [GitLabURL] [GitLabGroupID] [GitLabPrivateToken] [GitLabRepositoryAccessType] to backup GitLab git repositories.");
                            System.out.println(
                                    "java -jar BackGitLabUp.jar -backup http://192.168.11.11/gitlab 171752 aC4xVWx13wfhSa9xeyfA HTTP");
                            System.out.println(
                                    "java -jar BackGitLabUp.jar -backup http://gitlab.chipsguide.com 31313 3A2xw68rjjf5kSevnwsx SSH");
                            System.out.println(
                                    "java -jar BackGitLabUp.jar -backup http://gitlab.com 1373030 3A2xw68rjjf5kSevnwsx SSH");
                        }
                        break;
                        case "-v":
                        case "-ver":
                        case "-version":
                        {
                            System.out.println(NAME_TOOL + ": " + BackGitLabUp.VERSION.NAME + "(" + BackGitLabUp.VERSION.BUILD +")");
                        }
                        break;
                        default:
                        System.out.println(
                                "The parameters may be wrong.You can use [-help] to get the information of using BackGitLabUp.");
                        System.out.println("java -jar BackGitLabUp.jar -help");
                        break;
                    }
                }
                break;
                case 5:
                {
                    switch (sParameter)
                    {
                        case "-backup":
                        {
                            sGitLabUrl = args[1];
                            sGitLabGroupID = args[2];
                            sGitLabPrivateToken = args[3];
                            sGitLabRepositoryAccessType = args[4];
                            //TODO
                        }
                        break;
                        default:
                            System.out.println(
                                    "The parameters may be wrong.You can use [-help] to get the information of using BackGitLabUp.");
                            System.out.println("java -jar BackGitLabUp.jar -help");
                            break;
                    }
                }
                break;
                default:
                System.out.println(
                        "The parameters may be wrong.You can use [-help] to get the information of using BackGitLabUp.");
                System.out.println("java -jar BackGitLabUp.jar -help");
                break;
            }
        }
    }
}
