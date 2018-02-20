//: concurrency/EvenGenerator.java
// When threads collide.
package generic;

public class EvenGenerator extends IntGenerator {
  private int currentEvenValue = 0;
  public synchronized int next() {
    ++currentEvenValue; // Danger point here!
    Thread.yield();
    ++currentEvenValue;System.out.println(Thread.currentThread());
    return currentEvenValue;
  }
  public static void main(String[] args) {
    EvenChecker.test(new EvenGenerator());
  }
} /* Output: (Sample)
Press Control-C to exit
89476993 not even!
89476993 not even!
*///:~
