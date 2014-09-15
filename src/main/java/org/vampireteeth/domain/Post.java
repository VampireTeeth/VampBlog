package org.vampireteeth.domain;

import java.util.LinkedList;

<<<<<<< HEAD
	public Post(String title, String content) {
		this.title = title;
		this.content = content;
		this.tags = new LinkedList<String>();
		this.comments = new LinkedList<String>();
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
	public List<String> getComments() {
		return comments;
	}

	public Post addComment(String comment) {
		this.comments.add(comment);
		return this;
	}
=======
import java.util.List;
>>>>>>> d305d35965567d4aee515d030d3c103a4747636b

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
