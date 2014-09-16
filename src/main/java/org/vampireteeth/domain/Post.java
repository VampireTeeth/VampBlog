package org.vampireteeth.domain;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Post {

  @Id
  private String id;
  private String title;
  private String content;
  private String username;
  private List<String> tags; 
	private List<Document> comments;
  private Calendar createdOn;

	public Post(String title, String content) {
		this.title = title;
		this.content = content;
    this.username = "Unknown";
		this.tags = new LinkedList<String>();
		this.comments = new LinkedList<Document>();
		this.createdOn = Calendar.getInstance();
	}

	public Post(String title, String content, String username) {
		this.title = title;
		this.content = content;
    this.username = username;
		this.tags = new LinkedList<String>();
		this.comments = new LinkedList<Document>();
		this.createdOn = Calendar.getInstance();
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
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
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public Post setContent(String content) {
		this.content = content;
		return this;
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

	/**
	 * @return the createdOn
	 */
	public Calendar getCreatedOn() {
		return createdOn;
	}

	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(Calendar createdOn) {
		this.createdOn = createdOn;
	}

	public Post addComment(Document comment) {
		this.comments.add(comment);
		return this;
	}

}
