package com.ifeegoo.app.backgitlabup.beans;

import com.alibaba.fastjson.annotation.JSONField;

import javax.annotation.processing.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Namespace{

	@JSONField(name="path")
	private String path;

	@JSONField(name="avatar_url")
	private String avatarUrl;

	@JSONField(name="web_url")
	private String webUrl;

	@JSONField(name="kind")
	private String kind;

	@JSONField(name="parent_id")
	private Object parentId;

	@JSONField(name="name")
	private String name;

	@JSONField(name="id")
	private int id;

	@JSONField(name="full_path")
	private String fullPath;

	public void setPath(String path){
		this.path = path;
	}

	public String getPath(){
		return path;
	}

	public void setAvatarUrl(String avatarUrl){
		this.avatarUrl = avatarUrl;
	}

	public String getAvatarUrl(){
		return avatarUrl;
	}

	public void setWebUrl(String webUrl){
		this.webUrl = webUrl;
	}

	public String getWebUrl(){
		return webUrl;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public String getKind(){
		return kind;
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
			"Namespace{" + 
			"path = '" + path + '\'' + 
			",avatar_url = '" + avatarUrl + '\'' + 
			",web_url = '" + webUrl + '\'' + 
			",kind = '" + kind + '\'' + 
			",parent_id = '" + parentId + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",full_path = '" + fullPath + '\'' + 
			"}";
		}
}