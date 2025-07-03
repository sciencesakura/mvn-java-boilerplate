package com.sciencesakura.boot;

import com.sciencesakura.basic.Primes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeController {

  @GetMapping("/api/primes/{n}")
  public ResponseEntity<Integer> getPrime(@PathVariable int n) {
    return Primes.isPrime(n) ? ResponseEntity.ok(n) : ResponseEntity.notFound().build();
  }
}
