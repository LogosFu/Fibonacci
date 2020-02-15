package cc.xpbootcamp.warmup.fibonacci;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FibonacciTest {
  @Test
  void should_return_1_when_calculate_given_index_1() {
    final Fibonacci fibonacci = new Fibonacci();
    final int fibonacciNumber = fibonacci.calculate(1);
    assertThat(fibonacciNumber).isEqualTo(1);
  }

}