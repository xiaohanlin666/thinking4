//: reusing/FinalArguments.java
// Using "final" with method arguments.
package reusing;
class Gizmo {
	private int i;
  public void spin(final int i) {this.i=i;}
  public void get()
  {
	  System.out.println(i);
  }
}

public class FinalArguments {
  void with(final Gizmo g) {
    //! g = new Gizmo(); // Illegal -- g is final
	  g.spin(100);;
  }
  void without(Gizmo g) {
    g = new Gizmo(); // OK -- g not final
   
  }
  // void f(final int i) { i++; } // Can't change
  // You can only read from a final primitive:
  int g(final int i) { return i + 1; }
  public static void main(String[] args) {
    FinalArguments bf = new FinalArguments();
    bf.without(null);
    Gizmo g=new Gizmo();
    g.get();
    bf.with(g);
    g.get();
  }
} ///:~
