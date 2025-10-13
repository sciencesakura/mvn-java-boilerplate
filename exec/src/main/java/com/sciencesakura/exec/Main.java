package com.sciencesakura.exec;

import com.sciencesakura.basic.Primes;
import java.util.stream.IntStream;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Option;
import picocli.CommandLine.Spec;

/**
 * The main class.
 */
@Command(name = "exec", description = "Generate prime numbers", mixinStandardHelpOptions = true)
public class Main implements Runnable {

  @Spec
  private CommandSpec spec;

  @Option(names = "-n", description = "Count of prime numbers to generate", paramLabel = "N", defaultValue = "10")
  private int count;

  /**
   * The main method.
   *
   * @param args the command-line arguments
   */
  static void main(String[] args) {
    new CommandLine(new Main()).execute(args);
  }

  @Override
  public void run() {
    var output = spec.commandLine().getOut();
    IntStream.range(2, Integer.MAX_VALUE).filter(Primes::isPrime).limit(count).forEach(output::println);
  }
}
