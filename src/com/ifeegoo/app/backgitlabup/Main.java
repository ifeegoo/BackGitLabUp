package com.ifeegoo.app.backgitlabup;

import com.ifeegoo.app.backgitlabup.tools.BackGitLabUp;

public class Main {

    public static void main(String[] args) {
        if ((args != null) && (args.length >= 1))
        {
            switch (args.length)
            {
                case 1:
                {
                    switch (args[0])
                    {
                        case "-help":
                        {
                            System.out.println("****************************************************************");
                            System.out.println(BackGitLabUp.class.getSimpleName() + ": " + BackGitLabUp.VERSION.NAME + "(" + BackGitLabUp.VERSION.BUILD +")");
                            System.out.println(BackGitLabUp.class.getSimpleName() + " is a simple & useful GitLab backup tool.");
                            System.out.println();
                            System.out.println("Usage:");
                            System.out.println();
                            System.out.println("1. Use [-help] to get how to use BackGitLabUp.");
                            System.out.println("java -jar BackGitLabUp.jar -help");
                            System.out.println();
                            System.out.print("2. Use [-v] or [-ver] or [-version] to get the Version of BackGitLabUp.");
                            System.out.println();
                            System.out.println("java -jar BackGitLabUp.jar -v");
                            System.out.println("java -jar BackGitLabUp.jar -ver");
                            System.out.println("java -jar BackGitLabUp.jar -version");
                            System.out.println();
                            System.out.println(
                                    "3.1 Use [-backup] [GitLabURL] [GitLabAPIVersion] [GitLabPrivateToken] [GitLabRepositoryAccessType] to fetch data of all GitLab Git repositories, and then we can get the BackGitLabUp.sh file.");
                            System.out.println(
                                    "java -jar BackGitLabUp.jar -backup http://192.168.11.11/gitlab v3 aC4xVWx13wfhSa9xeyfA HTTP");
                            System.out.println(
                                    "java -jar BackGitLabUp.jar -backup http://gitlab.ifeegoo.com v4 3A2xw68rjjf5kSevnwsx SSH");
                            System.out.println(
                                    "java -jar BackGitLabUp.jar -backup http://gitlab.com v4 3A2xw68rjjf5kSevnwsx SSH");
                            System.out.println(
                                    "3.2 Just check the BackGitLabUp.sh file, make sure that you can see the data of all GitLab Git repositories and check whether they are right, and then you can just do the following shell command in your terminal to download all the Git repositories, and remember don't close the terminal!!");
                            System.out.println(
                                    "sh BackGitLabUp.sh");
                            System.out.println();
                            System.out.println(
                                    "4.1 Use [-backup] [GitLabURL] [GitLabAPIVersion] [GitLabGroupID] [GitLabPrivateToken] [GitLabRepositoryAccessType] to fetch data of all GitLab Git repositories of specific group, and then we can get the BackGitLabUp.sh file.");
                            System.out.println(
                                    "java -jar BackGitLabUp.jar -backup http://192.168.11.11/gitlab v3 13135 aC4xVWx13wfhSa9xeyfA HTTP");
                            System.out.println(
                                    "java -jar BackGitLabUp.jar -backup http://gitlab.ifeegoo.com v4 24136 3A2xw68rjjf5kSevnwsx SSH");
                            System.out.println(
                                    "java -jar BackGitLabUp.jar -backup http://gitlab.com v4 17888 3A2xw68rjjf5kSevnwsx SSH");
                            System.out.println(
                                    "4.2 Just check the BackGitLabUp.sh file, make sure that you can see the data of all GitLab Git repositories and check whether they are right, and then you can just do the following shell command in your terminal to download all the Git repositories, and remember don't close the terminal!!");
                            System.out.println(
                                    "sh BackGitLabUp.sh");
                            System.out.println("****************************************************************");
                        }
                        break;
                        case "-v":
                        case "-ver":
                        case "-version":
                        {
                            System.out.println(BackGitLabUp.class.getSimpleName() + ": " + BackGitLabUp.VERSION.NAME + "(" + BackGitLabUp.VERSION.BUILD +")");
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
                    switch (args[0])
                    {
                        case "-backup":
                        {
                            BackGitLabUp.getInstance().setGitLabURL(args[1]).setGitLabAPIVersion(args[2]).setGitLabPrivateToken(args[3]).setGitLabRepositoryAccessType(args[4]).start();
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
                case 6:
                {
                    switch (args[0])
                    {
                        case "-backup":
                        {
                            BackGitLabUp.getInstance().setGitLabURL(args[1]).setGitLabAPIVersion(args[2]).setGitLabGroupID(args[3]).setGitLabPrivateToken(args[4]).setGitLabRepositoryAccessType(args[5]).start();
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
