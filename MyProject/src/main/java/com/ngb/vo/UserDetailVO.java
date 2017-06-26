package com.ngb.vo;

public class UserDetailVO
{
  private String userID;
  private String userName;
  private String userLoginName;
  private String userLoginPassword;
  private String userStatus;
  private String userLoginStatus;
  private String userPurView;

  public String getUserID()
  {
    return this.userID;
  }
  public void setUserID(String userID) {
    this.userID = userID;
  }
  public String getUserName() {
    return this.userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  public String getUserLoginName() {
    return this.userLoginName;
  }
  public void setUserLoginName(String userLoginName) {
    this.userLoginName = userLoginName;
  }
  public String getUserLoginPassword() {
    return this.userLoginPassword;
  }
  public void setUserLoginPassword(String userLoginPassword) {
    this.userLoginPassword = userLoginPassword;
  }
  public String getUserStatus() {
    return this.userStatus;
  }
  public void setUserStatus(String userStatus) {
    this.userStatus = userStatus;
  }
  public String getUserLoginStatus() {
    return this.userLoginStatus;
  }
  public void setUserLoginStatus(String userLoginStatus) {
    this.userLoginStatus = userLoginStatus;
  }
  public String getUserPurView() {
    return this.userPurView;
  }
  public void setUserPurView(String userPurView) {
    this.userPurView = userPurView;
  }
}