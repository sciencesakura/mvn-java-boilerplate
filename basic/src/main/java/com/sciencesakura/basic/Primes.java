package com.sciencesakura.basic;

/**
 * A utility class for prime numbers.
 */
public final class Primes {

  private static final int[] WHEEL = {4, 2, 4, 2, 4, 6, 2, 6};

  private Primes() {
  }

  /**
   * Test if a number is prime.
   *
   * @param n the number to test
   * @return {@code true} if {@code n} is prime, {@code false} otherwise
   */
  public static boolean isPrime(int n) {
    if (n == 2 || n == 3 || n == 5) {
      return true;
    }
    if (n < 2 || n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
      return false;
    }
    var i = 7;
    var j = 0;
    while (i * i <= n) {
      if (n % i == 0) {
        return false;
      }
      if (j == WHEEL.length) {
        j = 0;
      }
      i += WHEEL[j++];
    }
    return true;
  }
}
