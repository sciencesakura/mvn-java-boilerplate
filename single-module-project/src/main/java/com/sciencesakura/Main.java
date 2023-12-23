package com.sciencesakura;

import java.util.stream.IntStream;

/**
 * The main class.
 */
public final class Main {

  private Main() {
  }

  /**
   * The entry point of application.
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    var n = 100;
    if (args.length > 0) {
      try {
        n = Integer.parseInt(args[0]);
      } catch (NumberFormatException ignored) {
        System.out.println(args[0] + " is not an integer.");
      }
    }
    IntStream.range(2, n).filter(Primes::isPrime).forEach(System.out::println);
  }
}
