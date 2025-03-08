package com.sciencesakura.kotlin

private val WHEEL = intArrayOf(4, 2, 4, 2, 4, 6, 2, 6)

/**
 * Test if a number is prime.
 *
 * @param n the number to test
 * @return `true` if the number is prime, `false` otherwise
 */
fun isPrime(n: Int): Boolean {
  if (n == 2 || n == 3 || n == 5) return true
  if (n < 2 || n % 2 == 0 || n % 3 == 0 || n % 5 == 0) return false
  var i = 7
  var j = 0
  while (i * i <= n) {
    if (n % i == 0) return false
    if (j == WHEEL.size) {
      j = 0
    }
    i += WHEEL[j++]
  }
  return true
}
