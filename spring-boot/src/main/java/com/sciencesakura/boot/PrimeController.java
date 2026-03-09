package com.sciencesakura.boot;

import com.sciencesakura.basic.Primes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * A REST controller for {@code /api/primes/}.
 */
@RestController
public class PrimeController {

  /**
   * Tests if the given number is prime.
   *
   * @param n the number to test
   * @return {@code 200 OK} if {@code n} is prime, {@code 404 NOT FOUND} otherwise
   */
  @GetMapping("/api/primes/{n}")
  public ResponseEntity<Integer> getPrime(@PathVariable int n) {
    return Primes.isPrime(n) ? ResponseEntity.ok(n) : ResponseEntity.notFound().build();
  }
}
