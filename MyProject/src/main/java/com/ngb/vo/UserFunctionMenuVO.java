package com.ngb.vo;

public class UserFunctionMenuVO extends TreeNodeVO
{
  private String ufmID;
  private String ufmPID;
  private String ufmCode;
  private String ufmDetail;

  public String getUfmID()
  {
    return this.ufmID;
  }

  public void setUfmID(String ufmID) {
    this.ufmID = ufmID;
  }

  public String getUfmPID() {
    return this.ufmPID;
  }

  public void setUfmPID(String ufmPID) {
    this.ufmPID = ufmPID;
  }

  public String getUfmCode() {
    return this.ufmCode;
  }

  public void setUfmCode(String ufmCode) {
    this.ufmCode = ufmCode;
  }

  public String getUfmDetail() {
    return this.ufmDetail;
  }

  public void setUfmDetail(String ufmDetail) {
    this.ufmDetail = ufmDetail;
  }
}