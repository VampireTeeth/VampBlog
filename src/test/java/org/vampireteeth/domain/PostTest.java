
package org.vampireteeth.domain;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PostTest {

	private String title;
	private String content;
  private String username;
  private String commentContent;
  private String commentUsername;
  private Document comment;
	private Post post;

	@Before
	public void setUp() {
		this.title = "The google earth";
		this.content = "This is a short content";
    this.username = "Steven";
    this.commentContent = "This is a comment";
    this.commentUsername = "VampireTeeth";
    this.comment = new Document(this.commentContent, this.commentUsername);
		this.post = new Post(this.title, this.content, this.username);
	}

	@Test
	public void testGetTitle() {
		String title = this.post.getTitle();
		Assert.assertEquals(this.title, title);
	}

	@Test
	public void testGetContent() {
		String content = this.post.getContent();
		Assert.assertEquals(this.content, content);
	}

	@Test
	public void testGetTagsEmpty() {
		Assert.assertEquals(0, this.post.getTags().size());
	}

	@Test
	public void testGetCommentsEmpty() {
		Assert.assertEquals(0, this.post.getComments().size());
	}

	@Test
	public void testAddTag() {
		String tag = "First tag";
		this.post.addTag(tag);
		Assert.assertEquals(1, this.post.getTags().size());
		Assert.assertEquals(tag, this.post.getTags().get(0));
	}

	@Test
	public void testAddComment() {
		this.post.addComment(this.comment);
		Assert.assertEquals(1, this.post.getComments().size());
		Assert.assertEquals(comment, this.post.getComments().get(0));
	}

	@Test
	public void testGetCreatedOn() {
		Calendar expected = Calendar.getInstance();
		Calendar actual = this.post.getCreatedOn();
		Assert.assertEquals(expected.get(Calendar.DAY_OF_YEAR),
				actual.get(Calendar.DAY_OF_YEAR));
		Assert.assertEquals(expected.get(Calendar.HOUR),
				actual.get(Calendar.HOUR));
		Assert.assertEquals(expected.get(Calendar.MINUTE),
				actual.get(Calendar.MINUTE));
		Assert.assertEquals(expected.get(Calendar.SECOND),
				actual.get(Calendar.SECOND));
	}
}
