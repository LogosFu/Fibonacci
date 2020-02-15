package cc.xpbootcamp.warmup.fibonacci;

import static java.util.stream.Collectors.joining;

import java.util.stream.IntStream;

public class FibonacciList {

  public String listFibonacci(int length){
    final Fibonacci fibonacci = new Fibonacci();
    return IntStream.range(1, length+1).mapToLong(fibonacci::calculate)
        .mapToObj(Long::toString).collect(joining(","));
  }
}
