package com.ifeegoo.app.backgitlabup;

import com.ifeegoo.app.backgitlabup.tools.BackGitLabUp;

public class Main {

    private static String sParameter;
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
                        }
                        break;
                        case "-v":
                        case "-ver":
                        case "-version":
                        {
                            System.out.println(NAME_TOOL + ": " + BackGitLabUp.VERSION.NAME + "(" + BackGitLabUp.VERSION.BUILD +")");
                        }
                        break;
                    }
                }
            }
        }
    }
}
