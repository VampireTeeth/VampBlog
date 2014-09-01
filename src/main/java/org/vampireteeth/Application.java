package org.vampireteeth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.vampireteeth.domain.Customer;
import org.vampireteeth.domain.Post;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

	public static void main(String... args) {
    SpringApplication.run(Application.class, args);
    Customer c = new Customer("Steven", "Liu", 30);
    System.out.println(c);
    printPost();
  }

  private static void printPost() {
    Post post = new Post("This is a title", "This is a content");
    System.out.println(post.getTitle());
    System.out.println(post.getContent());
  }

}
