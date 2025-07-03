package com.sciencesakura.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  /**
   * Main method to start the Spring Boot application.
   *
   * @param args Command line arguments (not used).
   */
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
