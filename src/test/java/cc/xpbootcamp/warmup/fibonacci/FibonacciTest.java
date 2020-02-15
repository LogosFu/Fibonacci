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

  @Test
  void should_return_1_when_calculate_given_index_2() {
    final Fibonacci fibonacci = new Fibonacci();
    final int fibonacciNumber = fibonacci.calculate(2);
    assertThat(fibonacciNumber).isEqualTo(1);
  }

  @Test
  void should_return_2_when_calculate_given_index_3() {
    final Fibonacci fibonacci = new Fibonacci();
    final int fibonacciNumber = fibonacci.calculate(3);
    assertThat(fibonacciNumber).isEqualTo(2);
  }

  @Test
  void should_return_3_when_calculate_given_index_4() {
    final Fibonacci fibonacci = new Fibonacci();
    final int fibonacciNumber = fibonacci.calculate(4);
    assertThat(fibonacciNumber).isEqualTo(3);
  }

  @Test
  void should_return_5_when_calculate_given_index_5() {
    final Fibonacci fibonacci = new Fibonacci();
    final int fibonacciNumber = fibonacci.calculate(5);
    assertThat(fibonacciNumber).isEqualTo(5);
  }
}