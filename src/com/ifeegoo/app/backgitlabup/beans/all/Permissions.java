package com.ifeegoo.app.backgitlabup.beans.all;

public class Permissions
{

    private String projectAccess;
    private GroupAccess groupAccess;

    public void setProjectAccess(String projectAccess)
    {
        this.projectAccess = projectAccess;
    }

    public String getProjectAccess()
    {
        return projectAccess;
    }

    public void setGroupAccess(GroupAccess groupAccess)
    {
        this.groupAccess = groupAccess;
    }

    public GroupAccess getGroupAccess()
    {
        return groupAccess;
    }

}