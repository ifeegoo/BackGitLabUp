# BackGitLabUp

## 简介

BackGitLabUp 是一个简单且有用的 GitLab 备份工具，能够帮助你下载所有能访问到的 Git 仓库到你本地的 macOS 上。

## 谁以及什么情况下可用？

每个人都能够通过这个简单的工具来将你 GitLab 上的 Git 仓库下载到 macOS 电脑上备份。你需要了解一些以下步骤里面提到的技术细节。

## 如何使用？

### 第 1 步： Java 和 Git 环境

确保你的 macOS 上已经有 Java 环境，并且能够在终端里面执行全局 Java 命令，然后需要在你的 macOS 上安装 Git，并且确保能够在终端里面执行全局 Git 命令。

例如:

### 第 2 步： BackGitLabUp.jar

从这个 GitHub 仓库的 release 里面下载 BackGitLabUp.jar 文件：

### 第 3 步：核对你想要备份的 Git 仓库的范围

**情形 A: GitLab 中所有你可见的 Git 仓库**

你需要特别注意在你的 GitLab 有大量用户的情况下，不要这样做。例如 `https://gitlab.com`，或者是你公司有大量的 GitLab 用户，你将会看到很多和你不相关的仓库。如果你不是这种情况，那么是可以直接备份所有和你相关的 Git 仓库。

**情形 B: 通过指定的 Group 来备份 Git 仓库**

核对好 GitLab Group ID，就可以进一步往前走！

### 第 4 步：核对参数: GitLabURL GitLabAPIVersion GitLabGroupID GitLabPrivateToken GitLabRepositoryAccessType

`GitLabURL` 你的 GitLab URL 地址.

例如：  
`http://192.168.11.11/gitlab`  
`https://gitlab.ifeegoo.com`  
`https://gitlab.com`

`GitLabAPIVersion` 你 GitLab API 版本，基于 GitLab 的版本。
`v3` GitLab v11.0 以下 
`v4` GitLab v11.0 或者以上

`GitLabGroupID` **仅针对于情形 B** 你的 GitLab Group ID，例如：

**Note:if there are no repositories under your specific group, but there are some subgroups, you cannot fetch the git repositories data, you must have git repositories under your group, not subgroup.**


`GitLabPrivateToken` Your personal ***User Settings*** -> ***Access Tokens***.


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

Before you do this step, please check the `BackGitLabUp.sh` file carefully to make sure the data of Git repositories exactly right, the URLs and total account, and then you can execute the following command.

`sh BackGitLabUp.sh`

### References


### NOTE

I recommand you using the third party shell command tool, such as iTerm 2, which has been test for more than 800 repositories with more than 100GB data about in 12 hours on macOS.

**Make sure the network of GitLab server and your macOS are both stable and online during backup.**

**Make sure your macOS are online for network connection, don't let it sleep.**

This command tool is really low level, but it's useful if you have good condition.
