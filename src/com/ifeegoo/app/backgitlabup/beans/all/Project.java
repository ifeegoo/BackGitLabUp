package com.ifeegoo.app.backgitlabup.beans.all;

import java.util.Date;
import java.util.List;

public class Project
{

    private int id;
    private String description;
    private String defaultBranch;
    private List<String> tagList;
    private boolean archived;
    private int visibilityLevel;
    private String sshUrlToRepo;
    private String httpUrlToRepo;
    private String webUrl;
    private String name;
    private String nameWithNamespace;
    private String path;
    private String pathWithNamespace;
    private boolean issuesEnabled;
    private boolean mergeRequestsEnabled;
    private boolean wikiEnabled;
    private boolean buildsEnabled;
    private boolean snippetsEnabled;
    private Date createdAt;
    private Date lastActivityAt;
    private boolean sharedRunnersEnabled;
    private int creatorId;
    private Namespace namespace;
    private String avatarUrl;
    private int starCount;
    private int forksCount;
    private int openIssuesCount;
    private boolean publicBuilds;
    private Permissions permissions;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setDescription(String description) {
         this.description = description;
     }
     public String getDescription() {
         return description;
     }

    public void setDefaultBranch(String defaultBranch) {
         this.defaultBranch = defaultBranch;
     }
     public String getDefaultBranch() {
         return defaultBranch;
     }

    public void setTagList(List<String> tagList) {
         this.tagList = tagList;
     }
     public List<String> getTagList() {
         return tagList;
     }

    public void setArchived(boolean archived) {
         this.archived = archived;
     }
     public boolean getArchived() {
         return archived;
     }

    public void setVisibilityLevel(int visibilityLevel) {
         this.visibilityLevel = visibilityLevel;
     }
     public int getVisibilityLevel() {
         return visibilityLevel;
     }

    public void setSshUrlToRepo(String sshUrlToRepo) {
         this.sshUrlToRepo = sshUrlToRepo;
     }
     public String getSshUrlToRepo() {
         return sshUrlToRepo;
     }

    public void setHttpUrlToRepo(String httpUrlToRepo) {
         this.httpUrlToRepo = httpUrlToRepo;
     }
     public String getHttpUrlToRepo() {
         return httpUrlToRepo;
     }

    public void setWebUrl(String webUrl) {
         this.webUrl = webUrl;
     }
     public String getWebUrl() {
         return webUrl;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setNameWithNamespace(String nameWithNamespace) {
         this.nameWithNamespace = nameWithNamespace;
     }
     public String getNameWithNamespace() {
         return nameWithNamespace;
     }

    public void setPath(String path) {
         this.path = path;
     }
     public String getPath() {
         return path;
     }

    public void setPathWithNamespace(String pathWithNamespace) {
         this.pathWithNamespace = pathWithNamespace;
     }
     public String getPathWithNamespace() {
         return pathWithNamespace;
     }

    public void setIssuesEnabled(boolean issuesEnabled) {
         this.issuesEnabled = issuesEnabled;
     }
     public boolean getIssuesEnabled() {
         return issuesEnabled;
     }

    public void setMergeRequestsEnabled(boolean mergeRequestsEnabled) {
         this.mergeRequestsEnabled = mergeRequestsEnabled;
     }
     public boolean getMergeRequestsEnabled() {
         return mergeRequestsEnabled;
     }

    public void setWikiEnabled(boolean wikiEnabled) {
         this.wikiEnabled = wikiEnabled;
     }
     public boolean getWikiEnabled() {
         return wikiEnabled;
     }

    public void setBuildsEnabled(boolean buildsEnabled) {
         this.buildsEnabled = buildsEnabled;
     }
     public boolean getBuildsEnabled() {
         return buildsEnabled;
     }

    public void setSnippetsEnabled(boolean snippetsEnabled) {
         this.snippetsEnabled = snippetsEnabled;
     }
     public boolean getSnippetsEnabled() {
         return snippetsEnabled;
     }

    public void setCreatedAt(Date createdAt) {
         this.createdAt = createdAt;
     }
     public Date getCreatedAt() {
         return createdAt;
     }

    public void setLastActivityAt(Date lastActivityAt) {
         this.lastActivityAt = lastActivityAt;
     }
     public Date getLastActivityAt() {
         return lastActivityAt;
     }

    public void setSharedRunnersEnabled(boolean sharedRunnersEnabled) {
         this.sharedRunnersEnabled = sharedRunnersEnabled;
     }
     public boolean getSharedRunnersEnabled() {
         return sharedRunnersEnabled;
     }

    public void setCreatorId(int creatorId) {
         this.creatorId = creatorId;
     }
     public int getCreatorId() {
         return creatorId;
     }

    public void setNamespace(Namespace namespace) {
         this.namespace = namespace;
     }
     public Namespace getNamespace() {
         return namespace;
     }

    public void setAvatarUrl(String avatarUrl) {
         this.avatarUrl = avatarUrl;
     }
     public String getAvatarUrl() {
         return avatarUrl;
     }

    public void setStarCount(int starCount) {
         this.starCount = starCount;
     }
     public int getStarCount() {
         return starCount;
     }

    public void setForksCount(int forksCount) {
         this.forksCount = forksCount;
     }
     public int getForksCount() {
         return forksCount;
     }

    public void setOpenIssuesCount(int openIssuesCount) {
         this.openIssuesCount = openIssuesCount;
     }
     public int getOpenIssuesCount() {
         return openIssuesCount;
     }

    public void setPublicBuilds(boolean publicBuilds) {
         this.publicBuilds = publicBuilds;
     }
     public boolean getPublicBuilds() {
         return publicBuilds;
     }

    public void setPermissions(Permissions permissions) {
         this.permissions = permissions;
     }
     public Permissions getPermissions() {
         return permissions;
     }

}