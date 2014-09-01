
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

	private List<String> tags;

	private List<String> comments;

	private Calendar createdOn;

	public Post(String title, String content) {
		this.title = title;
		this.content = content;
		this.tags = new LinkedList<String>();
		this.comments = new LinkedList<String>();
    this.createdOn = Calendar.getInstance();
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

	/**
	 * @return the createdOn
	 */
	public Calendar getCreatedOn() {
		return createdOn;
	}

}
