package com.ngb.vo;

import java.util.List;

public class TreeNodeVO
{
  private String id;
  private String text;
  private String state;
  private String checked;
  private String attributes;
  private List<? extends TreeNodeVO> children;

  public String getId()
  {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getText() {
    return this.text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getChecked() {
    return this.checked;
  }

  public void setChecked(String checked) {
    this.checked = checked;
  }

  public String getAttributes() {
    return this.attributes;
  }

  public void setAttributes(String attributes) {
    this.attributes = attributes;
  }

  public List<? extends TreeNodeVO> getChildren() {
    return this.children;
  }

  public void setChildren(List<? extends TreeNodeVO> children) {
    this.children = children;
  }
}