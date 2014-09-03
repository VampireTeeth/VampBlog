package org.vampireteeth.domain;

import java.util.Calendar;

import org.springframework.data.annotation.Id;

public class Document {

  @Id
  private String id;
  private String content;
  private String username;
  private Calendar createdOn;

  /**
   * @param content
   * @param username
   */
  public Document(String content, String username) {
    this.content = content;
    this.username = username;
    this.createdOn = Calendar.getInstance();
  }

  /**
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * @return the content
   */
  public String getContent() {
    return content;
  }

  /**
   * @param content the content to set
   */
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * @return the username
   */
  public String getUsername() {
    return username;
  }

  /**
   * @param username the username to set
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * @return the createdOn
   */
  public Calendar getCreatedOn() {
    return createdOn;
  }
}
