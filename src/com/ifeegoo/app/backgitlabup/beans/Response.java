package com.ifeegoo.app.backgitlabup.beans;

import com.alibaba.fastjson.annotation.JSONField;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class Response{

	@JSONField(name="lfs_enabled")
	private boolean lfsEnabled;

	@JSONField(name="shared_projects")
	private List<Object> sharedProjects;

	@JSONField(name="projects")
	private List<ProjectsItem> projects;

	@JSONField(name="visibility")
	private String visibility;

	@JSONField(name="request_access_enabled")
	private boolean requestAccessEnabled;

	@JSONField(name="shared_runners_minutes_limit")
	private int sharedRunnersMinutesLimit;

	@JSONField(name="ldap_access")
	private Object ldapAccess;

	@JSONField(name="description")
	private String description;

	@JSONField(name="path")
	private String path;

	@JSONField(name="full_name")
	private String fullName;

	@JSONField(name="ldap_cn")
	private Object ldapCn;

	@JSONField(name="web_url")
	private String webUrl;

	@JSONField(name="avatar_url")
	private String avatarUrl;

	@JSONField(name="extra_shared_runners_minutes_limit")
	private Object extraSharedRunnersMinutesLimit;

	@JSONField(name="parent_id")
	private Object parentId;

	@JSONField(name="name")
	private String name;

	@JSONField(name="id")
	private int id;

	@JSONField(name="full_path")
	private String fullPath;

	public void setLfsEnabled(boolean lfsEnabled){
		this.lfsEnabled = lfsEnabled;
	}

	public boolean isLfsEnabled(){
		return lfsEnabled;
	}

	public void setSharedProjects(List<Object> sharedProjects){
		this.sharedProjects = sharedProjects;
	}

	public List<Object> getSharedProjects(){
		return sharedProjects;
	}

	public void setProjects(List<ProjectsItem> projects){
		this.projects = projects;
	}

	public List<ProjectsItem> getProjects(){
		return projects;
	}

	public void setVisibility(String visibility){
		this.visibility = visibility;
	}

	public String getVisibility(){
		return visibility;
	}

	public void setRequestAccessEnabled(boolean requestAccessEnabled){
		this.requestAccessEnabled = requestAccessEnabled;
	}

	public boolean isRequestAccessEnabled(){
		return requestAccessEnabled;
	}

	public void setSharedRunnersMinutesLimit(int sharedRunnersMinutesLimit){
		this.sharedRunnersMinutesLimit = sharedRunnersMinutesLimit;
	}

	public int getSharedRunnersMinutesLimit(){
		return sharedRunnersMinutesLimit;
	}

	public void setLdapAccess(Object ldapAccess){
		this.ldapAccess = ldapAccess;
	}

	public Object getLdapAccess(){
		return ldapAccess;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setPath(String path){
		this.path = path;
	}

	public String getPath(){
		return path;
	}

	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public String getFullName(){
		return fullName;
	}

	public void setLdapCn(Object ldapCn){
		this.ldapCn = ldapCn;
	}

	public Object getLdapCn(){
		return ldapCn;
	}

	public void setWebUrl(String webUrl){
		this.webUrl = webUrl;
	}

	public String getWebUrl(){
		return webUrl;
	}

	public void setAvatarUrl(String avatarUrl){
		this.avatarUrl = avatarUrl;
	}

	public String getAvatarUrl(){
		return avatarUrl;
	}

	public void setExtraSharedRunnersMinutesLimit(Object extraSharedRunnersMinutesLimit){
		this.extraSharedRunnersMinutesLimit = extraSharedRunnersMinutesLimit;
	}

	public Object getExtraSharedRunnersMinutesLimit(){
		return extraSharedRunnersMinutesLimit;
	}

	public void setParentId(Object parentId){
		this.parentId = parentId;
	}

	public Object getParentId(){
		return parentId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setFullPath(String fullPath){
		this.fullPath = fullPath;
	}

	public String getFullPath(){
		return fullPath;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"lfs_enabled = '" + lfsEnabled + '\'' + 
			",shared_projects = '" + sharedProjects + '\'' + 
			",projects = '" + projects + '\'' + 
			",visibility = '" + visibility + '\'' + 
			",request_access_enabled = '" + requestAccessEnabled + '\'' + 
			",shared_runners_minutes_limit = '" + sharedRunnersMinutesLimit + '\'' + 
			",ldap_access = '" + ldapAccess + '\'' + 
			",description = '" + description + '\'' + 
			",path = '" + path + '\'' + 
			",full_name = '" + fullName + '\'' + 
			",ldap_cn = '" + ldapCn + '\'' + 
			",web_url = '" + webUrl + '\'' + 
			",avatar_url = '" + avatarUrl + '\'' + 
			",extra_shared_runners_minutes_limit = '" + extraSharedRunnersMinutesLimit + '\'' + 
			",parent_id = '" + parentId + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",full_path = '" + fullPath + '\'' + 
			"}";
		}
}