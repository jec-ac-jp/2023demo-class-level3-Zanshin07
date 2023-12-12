package com.classroom.assignment.model.request;

public class Comment {

  private String name;
  private String content;

  public Comment(String name, String content) {
    this.setName(name);
    this.setContent(content);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
