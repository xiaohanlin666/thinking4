//: generics/Fibonacci.java
// Generate a Fibonacci sequence.
package generic;
import net.mindview.util.*;

public class Fibonacci implements Generator<String> {
  private int count = 0;
  public String next() { return fib(count++).toString(); }
  private Integer fib(int n) {
    if(n < 2) return 1;
    return fib(n-2) + fib(n-1);
  }
  public static void main(String[] args) {
    Fibonacci gen = new Fibonacci();
    for(int i = 0; i < 18; i++)
      System.out.print(gen.next() + " ");
  }
} /* Output:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584
*///:~
