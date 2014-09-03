package org.vampireteeth.domain;

import java.util.LinkedList;
import java.util.List;

public class Post extends Document{

  private String title;

  private List<String> tags;

  private List<Document> comments;


  public Post(String title, String content, String username) {
    super(content, username);
    this.title = title;
    this.tags = new LinkedList<String>();
    this.comments = new LinkedList<Document>();
  }

  /**
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @set the title
   */
  public Post setTitle(String title) {
    this.title = title;
    return this;
  }

  /**
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  public Post addTag(String tag) {
    this.tags.add(tag);
    return this;
  }

  /**
   * @return the comments
   */
  public List<Document> getComments() {
    return comments;
  }

  public Post addComment(Document comment) {
    this.comments.add(comment);
    return this;
  }

}
