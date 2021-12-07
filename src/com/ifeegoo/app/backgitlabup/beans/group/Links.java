package com.ifeegoo.app.backgitlabup.beans.group;

import com.alibaba.fastjson.annotation.JSONField;

import javax.annotation.processing.Generated;


@Generated("com.robohorse.robopojogenerator")
public class Links{

	@JSONField(name="merge_requests")
	private String mergeRequests;

	@JSONField(name="members")
	private String members;

	@JSONField(name="self")
	private String self;

	@JSONField(name="repo_branches")
	private String repoBranches;

	@JSONField(name="issues")
	private String issues;

	@JSONField(name="events")
	private String events;

	@JSONField(name="labels")
	private String labels;

	public void setMergeRequests(String mergeRequests){
		this.mergeRequests = mergeRequests;
	}

	public String getMergeRequests(){
		return mergeRequests;
	}

	public void setMembers(String members){
		this.members = members;
	}

	public String getMembers(){
		return members;
	}

	public void setSelf(String self){
		this.self = self;
	}

	public String getSelf(){
		return self;
	}

	public void setRepoBranches(String repoBranches){
		this.repoBranches = repoBranches;
	}

	public String getRepoBranches(){
		return repoBranches;
	}

	public void setIssues(String issues){
		this.issues = issues;
	}

	public String getIssues(){
		return issues;
	}

	public void setEvents(String events){
		this.events = events;
	}

	public String getEvents(){
		return events;
	}

	public void setLabels(String labels){
		this.labels = labels;
	}

	public String getLabels(){
		return labels;
	}

	@Override
 	public String toString(){
		return 
			"Links{" + 
			"merge_requests = '" + mergeRequests + '\'' + 
			",members = '" + members + '\'' + 
			",self = '" + self + '\'' + 
			",repo_branches = '" + repoBranches + '\'' + 
			",issues = '" + issues + '\'' + 
			",events = '" + events + '\'' + 
			",labels = '" + labels + '\'' + 
			"}";
		}
}