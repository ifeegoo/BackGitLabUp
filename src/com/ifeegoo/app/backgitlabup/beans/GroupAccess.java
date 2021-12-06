package com.ifeegoo.app.backgitlabup.beans;

public class GroupAccess {

    private int accessLevel;
    private int notificationLevel;
    public void setAccessLevel(int accessLevel) {
         this.accessLevel = accessLevel;
     }
     public int getAccessLevel() {
         return accessLevel;
     }

    public void setNotificationLevel(int notificationLevel) {
         this.notificationLevel = notificationLevel;
     }
     public int getNotificationLevel() {
         return notificationLevel;
     }

}