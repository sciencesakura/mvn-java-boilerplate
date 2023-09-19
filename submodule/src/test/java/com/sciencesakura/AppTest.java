package com.sciencesakura;

import static org.assertj.core.api.Assertions.assertThatNoException;

import org.junit.jupiter.api.Test;

class AppTest {

  @Test
  void run() {
    assertThatNoException().isThrownBy(() -> App.main(new String[0]));
  }
}
