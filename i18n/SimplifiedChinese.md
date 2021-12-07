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


**注意：如果你指定的 Group 底下没有任何仓库，但是有一些子仓库，你也不能直接获取这些子 Group 里面的仓库信息，因此你需要指定一个有仓库的 Group。**



`GitLabPrivateToken` 你的个人私有访问令牌。在此路径可以找到 ***User Settings*** -> ***Access Tokens***。


`GitLabRepositoryAccessType` 你希望通过什么样的访问类型来克隆你的 Git 仓库。  
`HTTP` 你希望通过 HTTP 方式来克隆你的 Git 仓库，在克隆开始之前，需要输入你 GitLab 的用户名和密码。  
`SSH` 你希望通过 SSH 方式来克隆你的 Git 仓库，在开始第一步之前，你就需要配置好你电脑和 GitLab 之间的 SSH。

### 第 5 步：执行 Shell 命令


**情形 A: GitLab 中所有你可见的 Git 仓库**

> 在你的 macOS 终端里面执行第一条 Shell 命令来获取所有 Git 仓库的数据。

使用 `java -jar BackGitLabUp.jar` `[-backup]` `[GitLabURL]` `[GitLabAPIVersion]` `[GitLabPrivateToken]` `[GitLabRepositoryAccessType]` 来获取所有 GitLab Git 仓库的数据，然后我们能够得到 BackGitLabUp.sh 文件。

`java -jar BackGitLabUp.jar -backup http://192.168.11.11/gitlab v3 aC4xVWx13wfs5a9xeyfA HTTP`  
`java -jar BackGitLabUp.jar -backup http://gitlab.ifeegoo.com v4 3A2xw68rjjf37Sevnwsx SSH`  
`java -jar BackGitLabUp.jar -backup http://gitlab.com v4 3A2xw68rjjf5k26vnwsx SSH`

> 在你的 macOS 终端里面执行第二条 Shell 命令来克隆所有 Git 仓库。

**在做这一步之前，请详细检查 `BackGitLabUp.sh` 文件，确保所有 Git 仓库的数据完全正确，尤其是 URL、目录以及总数量。** 然后你就可以执行以下命令：

`sh BackGitLabUp.sh`

**情形 B: 通过指定的 Group 来备份 Git 仓库**

> 在你的 macOS 终端里面执行第一条 Shell 命令来获取指定 Group 下所有 Git 仓库的数据。

使用 `java -jar BackGitLabUp.jar` `[-backup]` `[GitLabURL]` `[GitLabAPIVersion]` `[GitLabGroupID]` `[GitLabPrivateToken]` `[GitLabRepositoryAccessType]` 来获取指定 Group 下所有 GitLab Git 仓库的数据，然后我们能够得到 BackGitLabUp.sh 文件。

`java -jar BackGitLabUp.jar -backup http://192.168.11.11/gitlab v3 13135 aC4xVWx13wfs5a9xeyfA HTTP`  
`java -jar BackGitLabUp.jar -backup http://gitlab.ifeegoo.com v4 24136 3A2xw68rjjf37Sevnwsx SSH`  
`java -jar BackGitLabUp.jar -backup http://gitlab.com v4 17888 3A2xw68rjjf5k26vnwsx SSH`

> 在你的 macOS 终端里面执行第二条 Shell 命令来克隆所有 Git 仓库。

**在做这一步之前，请详细检查 `BackGitLabUp.sh` 文件，确保所有 Git 仓库的数据完全正确，尤其是 URL、目录以及总数量。** 然后你就可以执行以下命令：

`sh BackGitLabUp.sh`

### 参考


### 备注

我推荐你使用第三方命令行工具，例如 iTerm 2，已经在 macOS 上通过了 12 小时左右的超过 800 个仓库多达 100GB 的数据测试。

**在备份期间，确保你 GitLab 和 macOS 的网络稳定在线。**

**确保你 macOS 在线并且长时间处于网络连接中，切勿让其休眠。**

这个命令行工具处于低级水平，如果你遵循相关条件，其实也是比较实用。
