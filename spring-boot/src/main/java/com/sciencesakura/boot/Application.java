package com.sciencesakura.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * An entry point for the Spring Boot application.
 */
@SpringBootApplication
public class Application {

  /**
   * Main method to start the Spring Boot application.
   *
   * @param args Command line arguments (not used).
   */
  static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
