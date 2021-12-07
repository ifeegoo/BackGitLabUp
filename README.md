# BackGitLabUp

[简体中文](/SimplifiedChinese.md)

## Introduction

BackGitLabUp is a simple & useful GitLab backup tool on macOS which helps you to download all the git repositories that you can access to your local macOS.

## For who and the situation？

This simple tool is for everyone that needs to download your Git repositories for GitLab to your macOS computer, just for backup.You must know some technical tips just as the following steps mentioned.

## How to use it?

### Step 1: Java & Git Environment

Make sure Java environment is on your macOS and you can do global Java commands in your terminal, and then install Git on your macOS and make sure you can do global Git commands in your terminal.

For example:

![](/img/java-and-git-command-in-terminal.png)

### Step 2: BackGitLabUp.jar.

Download BackGitLabUp.jar from this GitHub repository release:

### Step 3: Check the scope of Git repositories that you want to back up.

**Situation A: All the Git repositories you can see in your GitLab**

You must pay attention that don't use this especially your GitLab has huge amount users, such as `https://gitlab.com`, or you have huge amount GitLab users in your company, you will see lots of repositories which are not related with you. If you are not in this situation, just try this to back up all your related Git repositories.

**Situation B: Just to back up the Git repositories with specific Group**

Just check the GitLab group ID, and then, just do it!

### Step 4: Parameters checking: GitLabURL GitLabAPIVersion GitLabGroupID GitLabPrivateToken GitLabRepositoryAccessType

`GitLabURL` Your GitLab URL address.

Just like：  
`http://192.168.11.11/gitlab`  
`https://gitlab.ifeegoo.com`  
`https://gitlab.com`

`GitLabAPIVersion` Your GitLab API version, base on GitLab version.  
`v3` Under GitLab v11.0  
`v4` GitLab v11.0 or above

`GitLabGroupID` **Only for Situation B** Your GitLab group ID, for example. 

![](/img/gitlab-group-id.png)

**Note:if there are no repositories under your specific group, but there are some subgroups, you cannot fetch the git repositories data, you must have git repositories under your group, not subgroup.**


`GitLabPrivateToken` Your personal ***User Settings*** -> ***Access Tokens***.

![](/img/gitlab-private-access-token.png)
![](/img/gitlab-private-access-token-value.png)

`GitLabRepositoryAccessType` The access type that you want to clone your Git repositories.  
`HTTP` You want to clone your Git repositories by HTTP, and then you will need to input your username and password before repositories cloning.  
`SSH` You want to clone your Git repositories by SSH, and then you will need to configure SSH between your computer and GitLab first, and then start step 1.

### Step 5: Shell commands executing.

**Situation A: All the Git repositories you can see in your GitLab**

> Execute 1st shell command in your Terminal on macOS to fetch the data of all Git repositories.

Use `java -jar BackGitLabUp.jar` `[-backup]` `[GitLabURL]` `[GitLabAPIVersion]` `[GitLabPrivateToken]` `[GitLabRepositoryAccessType]` to fetch data of all GitLab git repositories, and then we can get the BackGitLabUp.sh file.

`java -jar BackGitLabUp.jar -backup http://192.168.11.11/gitlab v3 aC4xVWx13wfs5a9xeyfA HTTP`  
`java -jar BackGitLabUp.jar -backup http://gitlab.ifeegoo.com v4 3A2xw68rjjf37Sevnwsx SSH`  
`java -jar BackGitLabUp.jar -backup http://gitlab.com v4 3A2xw68rjjf5k26vnwsx SSH`

> Execute 2nd shell command in your Terminal on macOS to clone all Git repositories.  

Before you do this step, please check the `BackGitLabUp.sh` file carefully to make sure the data of Git repositories exactly right, the URLs and total account, and then you can execute the following command.

`sh BackGitLabUp.sh`

**Situation B: Just to back up the Git repositories with specific Group**

> Execute 1st shell command in your Terminal on macOS to fetch the data of all Git repositories under the specific.

Use `java -jar BackGitLabUp.jar` `[-backup]` `[GitLabURL]` `[GitLabAPIVersion]` `[GitLabGroupID]` `[GitLabPrivateToken]` `[GitLabRepositoryAccessType]` to fetch data of all GitLab git repositories, and then we can get the BackGitLabUp.sh file.

`java -jar BackGitLabUp.jar -backup http://192.168.11.11/gitlab v3 13135 aC4xVWx13wfs5a9xeyfA HTTP`  
`java -jar BackGitLabUp.jar -backup http://gitlab.ifeegoo.com v4 24136 3A2xw68rjjf37Sevnwsx SSH`  
`java -jar BackGitLabUp.jar -backup http://gitlab.com v4 17888 3A2xw68rjjf5k26vnwsx SSH`

> Execute 2nd shell command in your Terminal on macOS to clone all Git repositories.  

Before you do this step, please check the `BackGitLabUp.sh` file carefully to make sure the data of Git repositories exactly right, especially the URLs, the directories and total account, and then you can execute the following command.

`sh BackGitLabUp.sh`

### References


### NOTE

I recommand you using the third party shell command tool, such as iTerm 2, which has been test for more than 800 repositories with more than 100GB data about in 12 hours on macOS.

**Make sure the network of GitLab server and your macOS are both stable and online during backup.**

**Make sure your macOS are online for network connection, don't let it sleep.**

This command tool is really low level, but it's useful if you have good condition.
