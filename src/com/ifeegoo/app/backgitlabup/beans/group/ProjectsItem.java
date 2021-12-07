package com.ifeegoo.app.backgitlabup.beans.group;

import com.alibaba.fastjson.annotation.JSONField;

import javax.annotation.processing.Generated;

import com.ifeegoo.app.backgitlabup.beans.group.Links;
import com.ifeegoo.app.backgitlabup.beans.group.Namespace;

import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class ProjectsItem{

	@JSONField(name="ssh_url_to_repo")
	private String sshUrlToRepo;

	@JSONField(name="only_allow_merge_if_all_discussions_are_resolved")
	private boolean onlyAllowMergeIfAllDiscussionsAreResolved;

	@JSONField(name="_links")
	private Links links;

	@JSONField(name="request_access_enabled")
	private boolean requestAccessEnabled;

	@JSONField(name="build_timeout")
	private int buildTimeout;

	@JSONField(name="path")
	private String path;

	@JSONField(name="repository_access_level")
	private String repositoryAccessLevel;

	@JSONField(name="wiki_access_level")
	private String wikiAccessLevel;

	@JSONField(name="shared_runners_enabled")
	private boolean sharedRunnersEnabled;

	@JSONField(name="id")
	private int id;

	@JSONField(name="merge_requests_access_level")
	private String mergeRequestsAccessLevel;

	@JSONField(name="lfs_enabled")
	private boolean lfsEnabled;

	@JSONField(name="visibility")
	private String visibility;

	@JSONField(name="resolve_outdated_diff_discussions")
	private boolean resolveOutdatedDiffDiscussions;

	@JSONField(name="builds_access_level")
	private String buildsAccessLevel;

	@JSONField(name="merge_requests_enabled")
	private boolean mergeRequestsEnabled;

	@JSONField(name="shared_with_groups")
	private List<Object> sharedWithGroups;

	@JSONField(name="build_coverage_regex")
	private Object buildCoverageRegex;

	@JSONField(name="auto_devops_enabled")
	private boolean autoDevopsEnabled;

	@JSONField(name="name")
	private String name;

	@JSONField(name="creator_id")
	private int creatorId;

	@JSONField(name="external_authorization_classification_label")
	private String externalAuthorizationClassificationLabel;

	@JSONField(name="default_branch")
	private String defaultBranch;

	@JSONField(name="auto_devops_deploy_strategy")
	private String autoDevopsDeployStrategy;

	@JSONField(name="name_with_namespace")
	private String nameWithNamespace;

	@JSONField(name="issues_enabled")
	private boolean issuesEnabled;

	@JSONField(name="mirror")
	private boolean mirror;

	@JSONField(name="open_issues_count")
	private int openIssuesCount;

	@JSONField(name="auto_cancel_pending_pipelines")
	private String autoCancelPendingPipelines;

	@JSONField(name="snippets_enabled")
	private boolean snippetsEnabled;

	@JSONField(name="description")
	private String description;

	@JSONField(name="created_at")
	private String createdAt;

	@JSONField(name="import_status")
	private String importStatus;

	@JSONField(name="ci_default_git_depth")
	private int ciDefaultGitDepth;

	@JSONField(name="archived")
	private boolean archived;

	@JSONField(name="ci_config_path")
	private Object ciConfigPath;

	@JSONField(name="tag_list")
	private List<Object> tagList;

	@JSONField(name="last_activity_at")
	private String lastActivityAt;

	@JSONField(name="container_registry_enabled")
	private boolean containerRegistryEnabled;

	@JSONField(name="issues_access_level")
	private String issuesAccessLevel;

	@JSONField(name="printing_merge_request_link_enabled")
	private boolean printingMergeRequestLinkEnabled;

	@JSONField(name="path_with_namespace")
	private String pathWithNamespace;

	@JSONField(name="jobs_enabled")
	private boolean jobsEnabled;

	@JSONField(name="snippets_access_level")
	private String snippetsAccessLevel;

	@JSONField(name="http_url_to_repo")
	private String httpUrlToRepo;

	@JSONField(name="only_allow_merge_if_pipeline_succeeds")
	private boolean onlyAllowMergeIfPipelineSucceeds;

	@JSONField(name="readme_url")
	private Object readmeUrl;

	@JSONField(name="merge_method")
	private String mergeMethod;

	@JSONField(name="web_url")
	private String webUrl;

	@JSONField(name="avatar_url")
	private Object avatarUrl;

	@JSONField(name="wiki_enabled")
	private boolean wikiEnabled;

	@JSONField(name="public_jobs")
	private boolean publicJobs;

	@JSONField(name="namespace")
	private Namespace namespace;

	@JSONField(name="empty_repo")
	private boolean emptyRepo;

	@JSONField(name="star_count")
	private int starCount;

	@JSONField(name="forks_count")
	private int forksCount;

	public void setSshUrlToRepo(String sshUrlToRepo){
		this.sshUrlToRepo = sshUrlToRepo;
	}

	public String getSshUrlToRepo(){
		return sshUrlToRepo;
	}

	public void setOnlyAllowMergeIfAllDiscussionsAreResolved(boolean onlyAllowMergeIfAllDiscussionsAreResolved){
		this.onlyAllowMergeIfAllDiscussionsAreResolved = onlyAllowMergeIfAllDiscussionsAreResolved;
	}

	public boolean isOnlyAllowMergeIfAllDiscussionsAreResolved(){
		return onlyAllowMergeIfAllDiscussionsAreResolved;
	}

	public void setLinks(Links links){
		this.links = links;
	}

	public Links getLinks(){
		return links;
	}

	public void setRequestAccessEnabled(boolean requestAccessEnabled){
		this.requestAccessEnabled = requestAccessEnabled;
	}

	public boolean isRequestAccessEnabled(){
		return requestAccessEnabled;
	}

	public void setBuildTimeout(int buildTimeout){
		this.buildTimeout = buildTimeout;
	}

	public int getBuildTimeout(){
		return buildTimeout;
	}

	public void setPath(String path){
		this.path = path;
	}

	public String getPath(){
		return path;
	}

	public void setRepositoryAccessLevel(String repositoryAccessLevel){
		this.repositoryAccessLevel = repositoryAccessLevel;
	}

	public String getRepositoryAccessLevel(){
		return repositoryAccessLevel;
	}

	public void setWikiAccessLevel(String wikiAccessLevel){
		this.wikiAccessLevel = wikiAccessLevel;
	}

	public String getWikiAccessLevel(){
		return wikiAccessLevel;
	}

	public void setSharedRunnersEnabled(boolean sharedRunnersEnabled){
		this.sharedRunnersEnabled = sharedRunnersEnabled;
	}

	public boolean isSharedRunnersEnabled(){
		return sharedRunnersEnabled;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setMergeRequestsAccessLevel(String mergeRequestsAccessLevel){
		this.mergeRequestsAccessLevel = mergeRequestsAccessLevel;
	}

	public String getMergeRequestsAccessLevel(){
		return mergeRequestsAccessLevel;
	}

	public void setLfsEnabled(boolean lfsEnabled){
		this.lfsEnabled = lfsEnabled;
	}

	public boolean isLfsEnabled(){
		return lfsEnabled;
	}

	public void setVisibility(String visibility){
		this.visibility = visibility;
	}

	public String getVisibility(){
		return visibility;
	}

	public void setResolveOutdatedDiffDiscussions(boolean resolveOutdatedDiffDiscussions){
		this.resolveOutdatedDiffDiscussions = resolveOutdatedDiffDiscussions;
	}

	public boolean isResolveOutdatedDiffDiscussions(){
		return resolveOutdatedDiffDiscussions;
	}

	public void setBuildsAccessLevel(String buildsAccessLevel){
		this.buildsAccessLevel = buildsAccessLevel;
	}

	public String getBuildsAccessLevel(){
		return buildsAccessLevel;
	}

	public void setMergeRequestsEnabled(boolean mergeRequestsEnabled){
		this.mergeRequestsEnabled = mergeRequestsEnabled;
	}

	public boolean isMergeRequestsEnabled(){
		return mergeRequestsEnabled;
	}

	public void setSharedWithGroups(List<Object> sharedWithGroups){
		this.sharedWithGroups = sharedWithGroups;
	}

	public List<Object> getSharedWithGroups(){
		return sharedWithGroups;
	}

	public void setBuildCoverageRegex(Object buildCoverageRegex){
		this.buildCoverageRegex = buildCoverageRegex;
	}

	public Object getBuildCoverageRegex(){
		return buildCoverageRegex;
	}

	public void setAutoDevopsEnabled(boolean autoDevopsEnabled){
		this.autoDevopsEnabled = autoDevopsEnabled;
	}

	public boolean isAutoDevopsEnabled(){
		return autoDevopsEnabled;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCreatorId(int creatorId){
		this.creatorId = creatorId;
	}

	public int getCreatorId(){
		return creatorId;
	}

	public void setExternalAuthorizationClassificationLabel(String externalAuthorizationClassificationLabel){
		this.externalAuthorizationClassificationLabel = externalAuthorizationClassificationLabel;
	}

	public String getExternalAuthorizationClassificationLabel(){
		return externalAuthorizationClassificationLabel;
	}

	public void setDefaultBranch(String defaultBranch){
		this.defaultBranch = defaultBranch;
	}

	public String getDefaultBranch(){
		return defaultBranch;
	}

	public void setAutoDevopsDeployStrategy(String autoDevopsDeployStrategy){
		this.autoDevopsDeployStrategy = autoDevopsDeployStrategy;
	}

	public String getAutoDevopsDeployStrategy(){
		return autoDevopsDeployStrategy;
	}

	public void setNameWithNamespace(String nameWithNamespace){
		this.nameWithNamespace = nameWithNamespace;
	}

	public String getNameWithNamespace(){
		return nameWithNamespace;
	}

	public void setIssuesEnabled(boolean issuesEnabled){
		this.issuesEnabled = issuesEnabled;
	}

	public boolean isIssuesEnabled(){
		return issuesEnabled;
	}

	public void setMirror(boolean mirror){
		this.mirror = mirror;
	}

	public boolean isMirror(){
		return mirror;
	}

	public void setOpenIssuesCount(int openIssuesCount){
		this.openIssuesCount = openIssuesCount;
	}

	public int getOpenIssuesCount(){
		return openIssuesCount;
	}

	public void setAutoCancelPendingPipelines(String autoCancelPendingPipelines){
		this.autoCancelPendingPipelines = autoCancelPendingPipelines;
	}

	public String getAutoCancelPendingPipelines(){
		return autoCancelPendingPipelines;
	}

	public void setSnippetsEnabled(boolean snippetsEnabled){
		this.snippetsEnabled = snippetsEnabled;
	}

	public boolean isSnippetsEnabled(){
		return snippetsEnabled;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setImportStatus(String importStatus){
		this.importStatus = importStatus;
	}

	public String getImportStatus(){
		return importStatus;
	}

	public void setCiDefaultGitDepth(int ciDefaultGitDepth){
		this.ciDefaultGitDepth = ciDefaultGitDepth;
	}

	public int getCiDefaultGitDepth(){
		return ciDefaultGitDepth;
	}

	public void setArchived(boolean archived){
		this.archived = archived;
	}

	public boolean isArchived(){
		return archived;
	}

	public void setCiConfigPath(Object ciConfigPath){
		this.ciConfigPath = ciConfigPath;
	}

	public Object getCiConfigPath(){
		return ciConfigPath;
	}

	public void setTagList(List<Object> tagList){
		this.tagList = tagList;
	}

	public List<Object> getTagList(){
		return tagList;
	}

	public void setLastActivityAt(String lastActivityAt){
		this.lastActivityAt = lastActivityAt;
	}

	public String getLastActivityAt(){
		return lastActivityAt;
	}

	public void setContainerRegistryEnabled(boolean containerRegistryEnabled){
		this.containerRegistryEnabled = containerRegistryEnabled;
	}

	public boolean isContainerRegistryEnabled(){
		return containerRegistryEnabled;
	}

	public void setIssuesAccessLevel(String issuesAccessLevel){
		this.issuesAccessLevel = issuesAccessLevel;
	}

	public String getIssuesAccessLevel(){
		return issuesAccessLevel;
	}

	public void setPrintingMergeRequestLinkEnabled(boolean printingMergeRequestLinkEnabled){
		this.printingMergeRequestLinkEnabled = printingMergeRequestLinkEnabled;
	}

	public boolean isPrintingMergeRequestLinkEnabled(){
		return printingMergeRequestLinkEnabled;
	}

	public void setPathWithNamespace(String pathWithNamespace){
		this.pathWithNamespace = pathWithNamespace;
	}

	public String getPathWithNamespace(){
		return pathWithNamespace;
	}

	public void setJobsEnabled(boolean jobsEnabled){
		this.jobsEnabled = jobsEnabled;
	}

	public boolean isJobsEnabled(){
		return jobsEnabled;
	}

	public void setSnippetsAccessLevel(String snippetsAccessLevel){
		this.snippetsAccessLevel = snippetsAccessLevel;
	}

	public String getSnippetsAccessLevel(){
		return snippetsAccessLevel;
	}

	public void setHttpUrlToRepo(String httpUrlToRepo){
		this.httpUrlToRepo = httpUrlToRepo;
	}

	public String getHttpUrlToRepo(){
		return httpUrlToRepo;
	}

	public void setOnlyAllowMergeIfPipelineSucceeds(boolean onlyAllowMergeIfPipelineSucceeds){
		this.onlyAllowMergeIfPipelineSucceeds = onlyAllowMergeIfPipelineSucceeds;
	}

	public boolean isOnlyAllowMergeIfPipelineSucceeds(){
		return onlyAllowMergeIfPipelineSucceeds;
	}

	public void setReadmeUrl(Object readmeUrl){
		this.readmeUrl = readmeUrl;
	}

	public Object getReadmeUrl(){
		return readmeUrl;
	}

	public void setMergeMethod(String mergeMethod){
		this.mergeMethod = mergeMethod;
	}

	public String getMergeMethod(){
		return mergeMethod;
	}

	public void setWebUrl(String webUrl){
		this.webUrl = webUrl;
	}

	public String getWebUrl(){
		return webUrl;
	}

	public void setAvatarUrl(Object avatarUrl){
		this.avatarUrl = avatarUrl;
	}

	public Object getAvatarUrl(){
		return avatarUrl;
	}

	public void setWikiEnabled(boolean wikiEnabled){
		this.wikiEnabled = wikiEnabled;
	}

	public boolean isWikiEnabled(){
		return wikiEnabled;
	}

	public void setPublicJobs(boolean publicJobs){
		this.publicJobs = publicJobs;
	}

	public boolean isPublicJobs(){
		return publicJobs;
	}

	public void setNamespace(Namespace namespace){
		this.namespace = namespace;
	}

	public Namespace getNamespace(){
		return namespace;
	}

	public void setEmptyRepo(boolean emptyRepo){
		this.emptyRepo = emptyRepo;
	}

	public boolean isEmptyRepo(){
		return emptyRepo;
	}

	public void setStarCount(int starCount){
		this.starCount = starCount;
	}

	public int getStarCount(){
		return starCount;
	}

	public void setForksCount(int forksCount){
		this.forksCount = forksCount;
	}

	public int getForksCount(){
		return forksCount;
	}

	@Override
 	public String toString(){
		return 
			"ProjectsItem{" + 
			"ssh_url_to_repo = '" + sshUrlToRepo + '\'' + 
			",only_allow_merge_if_all_discussions_are_resolved = '" + onlyAllowMergeIfAllDiscussionsAreResolved + '\'' + 
			",_links = '" + links + '\'' + 
			",request_access_enabled = '" + requestAccessEnabled + '\'' + 
			",build_timeout = '" + buildTimeout + '\'' + 
			",path = '" + path + '\'' + 
			",repository_access_level = '" + repositoryAccessLevel + '\'' + 
			",wiki_access_level = '" + wikiAccessLevel + '\'' + 
			",shared_runners_enabled = '" + sharedRunnersEnabled + '\'' + 
			",id = '" + id + '\'' + 
			",merge_requests_access_level = '" + mergeRequestsAccessLevel + '\'' + 
			",lfs_enabled = '" + lfsEnabled + '\'' + 
			",visibility = '" + visibility + '\'' + 
			",resolve_outdated_diff_discussions = '" + resolveOutdatedDiffDiscussions + '\'' + 
			",builds_access_level = '" + buildsAccessLevel + '\'' + 
			",merge_requests_enabled = '" + mergeRequestsEnabled + '\'' + 
			",shared_with_groups = '" + sharedWithGroups + '\'' + 
			",build_coverage_regex = '" + buildCoverageRegex + '\'' + 
			",auto_devops_enabled = '" + autoDevopsEnabled + '\'' + 
			",name = '" + name + '\'' + 
			",creator_id = '" + creatorId + '\'' + 
			",external_authorization_classification_label = '" + externalAuthorizationClassificationLabel + '\'' + 
			",default_branch = '" + defaultBranch + '\'' + 
			",auto_devops_deploy_strategy = '" + autoDevopsDeployStrategy + '\'' + 
			",name_with_namespace = '" + nameWithNamespace + '\'' + 
			",issues_enabled = '" + issuesEnabled + '\'' + 
			",mirror = '" + mirror + '\'' + 
			",open_issues_count = '" + openIssuesCount + '\'' + 
			",auto_cancel_pending_pipelines = '" + autoCancelPendingPipelines + '\'' + 
			",snippets_enabled = '" + snippetsEnabled + '\'' + 
			",description = '" + description + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",import_status = '" + importStatus + '\'' + 
			",ci_default_git_depth = '" + ciDefaultGitDepth + '\'' + 
			",archived = '" + archived + '\'' + 
			",ci_config_path = '" + ciConfigPath + '\'' + 
			",tag_list = '" + tagList + '\'' + 
			",last_activity_at = '" + lastActivityAt + '\'' + 
			",container_registry_enabled = '" + containerRegistryEnabled + '\'' + 
			",issues_access_level = '" + issuesAccessLevel + '\'' + 
			",printing_merge_request_link_enabled = '" + printingMergeRequestLinkEnabled + '\'' + 
			",path_with_namespace = '" + pathWithNamespace + '\'' + 
			",jobs_enabled = '" + jobsEnabled + '\'' + 
			",snippets_access_level = '" + snippetsAccessLevel + '\'' + 
			",http_url_to_repo = '" + httpUrlToRepo + '\'' + 
			",only_allow_merge_if_pipeline_succeeds = '" + onlyAllowMergeIfPipelineSucceeds + '\'' + 
			",readme_url = '" + readmeUrl + '\'' + 
			",merge_method = '" + mergeMethod + '\'' + 
			",web_url = '" + webUrl + '\'' + 
			",avatar_url = '" + avatarUrl + '\'' + 
			",wiki_enabled = '" + wikiEnabled + '\'' + 
			",public_jobs = '" + publicJobs + '\'' + 
			",namespace = '" + namespace + '\'' + 
			",empty_repo = '" + emptyRepo + '\'' + 
			",star_count = '" + starCount + '\'' + 
			",forks_count = '" + forksCount + '\'' + 
			"}";
		}
}