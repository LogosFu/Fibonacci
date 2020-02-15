package cc.xpbootcamp.warmup.fibonacci;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciListTest {

  @Test
  void should_return_fibonacci_number_when_list_fibonacci_given_length_is_50() {
    final FibonacciList fibonacciList = new FibonacciList();
    final String fibonacciNumbers = fibonacciList.listFibonacci(50);
    final String[] numbers = fibonacciNumbers.split(",");

    assertThat(numbers.length).isEqualTo(50);
    assertThat(numbers[0]).isEqualTo("1");
    assertThat(numbers[1]).isEqualTo("1");
    assertThat(numbers[2]).isEqualTo("2");
    assertThat(numbers[4]).isEqualTo("5");
    assertThat(numbers[49]).isEqualTo("12586269025");
  }
}