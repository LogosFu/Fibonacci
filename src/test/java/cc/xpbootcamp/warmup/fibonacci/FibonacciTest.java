package cc.xpbootcamp.warmup.fibonacci;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.Test;

class FibonacciTest {

  @Test
  void should_return_out_of_range_when_calculate_given_index_0() {
    final Fibonacci fibonacci = new Fibonacci();
    assertThatExceptionOfType(OutOfRangeException.class).isThrownBy(() -> fibonacci.calculate(0));
  }

  @Test
  void should_return_out_of_range_when_calculate_given_index_51() {
    final Fibonacci fibonacci = new Fibonacci();
    assertThatExceptionOfType(OutOfRangeException.class).isThrownBy(() -> fibonacci.calculate(51));
  }

  @Test
  void should_return_1_when_calculate_given_index_1() {
    final Fibonacci fibonacci = new Fibonacci();
    final long fibonacciNumber = fibonacci.calculate(1);
    assertThat(fibonacciNumber).isEqualTo(1);
  }

  @Test
  void should_return_1_when_calculate_given_index_2() {
    final Fibonacci fibonacci = new Fibonacci();
    final long fibonacciNumber = fibonacci.calculate(2);
    assertThat(fibonacciNumber).isEqualTo(1);
  }

  @Test
  void should_return_2_when_calculate_given_index_3() {
    final Fibonacci fibonacci = new Fibonacci();
    final long fibonacciNumber = fibonacci.calculate(3);
    assertThat(fibonacciNumber).isEqualTo(2);
  }

  @Test
  void should_return_3_when_calculate_given_index_4() {
    final Fibonacci fibonacci = new Fibonacci();
    final long fibonacciNumber = fibonacci.calculate(4);
    assertThat(fibonacciNumber).isEqualTo(3);
  }

  @Test
  void should_return_5_when_calculate_given_index_5() {
    final Fibonacci fibonacci = new Fibonacci();
    final long fibonacciNumber = fibonacci.calculate(5);
    assertThat(fibonacciNumber).isEqualTo(5);
  }

//  @Test
//  void should_return_fibonacci_number_when_list_fibonacci_given_length_is_50() {
//    final Fibonacci fibonacci = new Fibonacci();
//    final String fibonacciNumbers = fibonacci.listFibonacci(50);
//    final String[] numbers = fibonacciNumbers.split(",");
//
//    assertThat(numbers.length).isEqualTo(49);
//    assertThat(numbers[0]).isEqualTo("1");
//    assertThat(numbers[1]).isEqualTo("1");
//    assertThat(numbers[2]).isEqualTo("2");
//    assertThat(numbers[4]).isEqualTo("5");
//    assertThat(numbers[49]).isEqualTo("12586269025");
//  }
}