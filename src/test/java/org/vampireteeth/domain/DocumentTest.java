package org.vampireteeth.domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DocumentTest {

  private String content;
  private String username;
  private Calendar createdOn;
  private Document document;

  @Before
  public void setUp(){
    this.content = "Short content";
    this.username = "VampireTeeth";
    this.createdOn = Calendar.getInstance();
    this.document = new Document(this.content, this.username);
  }

  @Test
  public void testGetContent() {
    Assert.assertEquals(this.content, this.document.getContent());
  }

  @Test
  public void testGetUsername() {
    Assert.assertEquals(this.username, this.document.getUsername());
  }

  @Test
  public void testGetCreatedOn() {
    this.compareCalendars(this.createdOn, this.document.getCreatedOn());
  }

  private void compareCalendars(Calendar exp, Calendar act) {
    List<Integer> fields = new ArrayList<Integer>();
    fields.add(Calendar.DAY_OF_MONTH);
    fields.add(Calendar.MONTH);
    fields.add(Calendar.YEAR);
    for(Integer field : fields) {
      Assert.assertEquals(exp.get(field), act.get(field));
    }
  }
  @After
  public void tearDown() {}
}
