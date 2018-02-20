//: reusing/Cartoon.java
// Constructor calls during inheritance.
import static net.mindview.util.Print.*;

import thinkingjava4.test.A;
import thinkingjava4.test.SubA;

class Art {
	    int i;
	 static final Art a=new Art(168);
  Art(int i) { print("Art constructor"); 
  this.i=i;
  }
  
}

class Drawing extends Art {
	private SubA a=new A("222b");
  Drawing() {super(100); print("Drawing constructor"); }
}

public class Cartoon extends Drawing {
  public Cartoon() { print("Cartoon constructor"); }
  public static void main(String[] args) {
	  Art a=new Art(123);
	
	  System.out.println("i==="+a.a.i);
	  a.a.i=188;
	  System.out.println("i==="+a.a.i);
	  Art a1=new Art(223123);
		
	  System.out.println("a1==="+a1.i);
  }
  private SubA a=new A("333c");
} /* Output:
Art constructor
Drawing constructor
Cartoon constructor
*///:~
