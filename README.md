# BackGitLabUp

## Introduction

BackGitLabUp is a simple & useful GitLab backup tool on macOS which helps you to download all the git repositories that you can access to your local macOS.

## How to use it?

> Step 1: Java & Git Environment

**Make sure Java environment is on your macOS and you can do global Java commands in your terminal, and then install Git on your macOS and make sure you can do global Git commands in your terminal.**

For example:

> Step 2: BackGitLabUp.jar.

Download BackGitLabUp.jar from this GitHub repository release:

> Step 3: Parameters checking `GitLabURL` `GitLabAPIVersion` `GitLabPrivateToken` `GitLabRepositoryAccessType`

`GitLabURL` Your GitLab URL address.

Just like：  
`http://192.168.11.11/gitlab`  
`https://gitlab.ifeegoo.com`  
`https://gitlab.com`

`GitLabAPIVersion` Your GitLab API version, base on GitLab version.  
`v3` Under GitLab v11.0  
`v4` GitLab v11.0 or above


`GitLabPrivateToken` Your personal ***User Settings*** -> ***Access Tokens***.


`GitLabRepositoryAccessType` The access type that you want to clone your Git repositories.  
`HTTP` You want to clone your Git repositories by HTTP, and then you will need to input your username and password before repositories cloning.  
`SSH` You want to clone your Git repositories by SSH, and then you will need to configure SSH between your computer and GitLab first, and then start step 1.

> Step 4: Execute 1st shell command in your Terminal on macOS to fetch the data of all Git repositories.

Use `java -jar BackGitLabUp.jar` `[-backup]` `[GitLabURL]` `[GitLabAPIVersion]` `[GitLabPrivateToken]` `[GitLabRepositoryAccessType]` to fetch data of all GitLab git repositories, and then we can get the BackGitLabUp.sh file.

`java -jar BackGitLabUp.jar -backup http://192.168.11.11/gitlab v3 aC4xVWx13wfs5a9xeyfA HTTP`  
`java -jar BackGitLabUp.jar -backup http://gitlab.ifeegoo.com v4 3A2xw68rjjf37Sevnwsx SSH`  
`java -jar BackGitLabUp.jar -backup http://gitlab.com v4 3A2xw68rjjf5k26vnwsx SSH`

> Step 5: Execute 2nd shell command in your Terminal on macOS to clone all Git repositories THAT YOU CAN ACCESS.  

Before you do this step, please check the `BackGitLabUp.sh` file carefully to make sure the data of Git repositories exactly right, the URLs and total account, and then you can execute the following command.

`sh BackGitLabUp.sh`

And then you can see this:  






