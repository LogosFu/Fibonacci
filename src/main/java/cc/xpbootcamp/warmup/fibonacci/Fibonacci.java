package cc.xpbootcamp.warmup.fibonacci;

public class Fibonacci {


  public long calculate(int index) {
    if (index <= 0||index>50) {
      throw new OutOfRangeException();
    }
    if (index < 3) {
      return 1;
    } else {
      return this.calculate(index - 1) + this.calculate(index - 2);
    }
  }
}
