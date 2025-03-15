package com.sciencesakura.groovy

/**
 * A utility class for prime numbers.
 */
final class Primes {

  private static final WHEEL = [4, 2, 4, 2, 4, 6, 2, 6]

  private Primes() {
  }

  /**
   * Tests if a number is prime.
   *
   * @param n the number to test
   * @return {@code true} if the number is prime, {@code false} otherwise
   */
  static boolean isPrime(int n) {
    if (n == 2 || n == 3 || n == 5) return true
    if (n < 2 || n % 2 == 0 || n % 3 == 0 || n % 5 == 0) return false
    def i = 7
    def j = 0
    while (i * i <= n) {
      if (n % i == 0) return false
      if (j == WHEEL.size()) {
        j = 0
      }
      i += WHEEL[j++]
    }
    true
  }
}
