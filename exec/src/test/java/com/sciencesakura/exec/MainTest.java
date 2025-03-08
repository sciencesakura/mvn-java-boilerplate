package com.sciencesakura.exec;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.junit.jupiter.api.Test;
import picocli.CommandLine;

class MainTest {

  @Test
  void when_n_is_default_value() {
    var actual = new StringWriter();
    var command = new CommandLine(new Main());
    command.setOut(new PrintWriter(actual));
    var exitCode = command.execute();
    assertEquals(0, exitCode);
    assertEquals("""
        2
        3
        5
        7
        11
        13
        17
        19
        23
        29
        """, actual.toString());
  }

  @Test
  void when_n_is_specified() {
    var actual = new StringWriter();
    var command = new CommandLine(new Main());
    command.setOut(new PrintWriter(actual));
    var exitCode = command.execute("-n", "5");
    assertEquals(0, exitCode);
    assertEquals("""
        2
        3
        5
        7
        11
        """, actual.toString());
  }
}
