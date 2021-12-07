package com.ifeegoo.app.backgitlabup.beans.all;

import java.util.Date;

public class Namespace {

    private int id;
    private String name;
    private String path;
    private String ownerId;
    private Date createdAt;
    private Date updatedAt;
    private String description;
    private Avatar avatar;
    private boolean shareWithGroupLock;
    private int visibilityLevel;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setPath(String path) {
         this.path = path;
     }
     public String getPath() {
         return path;
     }

    public void setOwnerId(String ownerId) {
         this.ownerId = ownerId;
     }
     public String getOwnerId() {
         return ownerId;
     }

    public void setCreatedAt(Date createdAt) {
         this.createdAt = createdAt;
     }
     public Date getCreatedAt() {
         return createdAt;
     }

    public void setUpdatedAt(Date updatedAt) {
         this.updatedAt = updatedAt;
     }
     public Date getUpdatedAt() {
         return updatedAt;
     }

    public void setDescription(String description) {
         this.description = description;
     }
     public String getDescription() {
         return description;
     }

    public void setAvatar(Avatar avatar) {
         this.avatar = avatar;
     }
     public Avatar getAvatar() {
         return avatar;
     }

    public void setShareWithGroupLock(boolean shareWithGroupLock) {
         this.shareWithGroupLock = shareWithGroupLock;
     }
     public boolean getShareWithGroupLock() {
         return shareWithGroupLock;
     }

    public void setVisibilityLevel(int visibilityLevel) {
         this.visibilityLevel = visibilityLevel;
     }
     public int getVisibilityLevel() {
         return visibilityLevel;
     }

}