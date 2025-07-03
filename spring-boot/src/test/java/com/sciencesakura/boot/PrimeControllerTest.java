package com.sciencesakura.boot;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class PrimeControllerTest {

  @Autowired
  MockMvc mockMvc;

  @ParameterizedTest
  @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17, 19})
  void return_200_ok(int n) throws Exception {
    mockMvc.perform(get("/api/primes/{n}", n))
        .andExpect(status().isOk())
        .andExpect(content().string(String.valueOf(n)));
  }

  @ParameterizedTest
  @ValueSource(ints = {4, 6, 8, 9, 10, 12, 14, 15})
  void return_404_not_found(int n) throws Exception {
    mockMvc.perform(get("/api/primes/{n}", n))
        .andExpect(status().isNotFound());
  }
}
