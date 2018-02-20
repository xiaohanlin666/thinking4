//: polymorphism/Sandwich.java
// Order of constructor calls.
package polymorphism;
import static net.mindview.util.Print.*;

class AAA{
	public AAA(int i)
	{
		System.out.println("AAA"+i);
	}
}
class Meal {
	private AAA a=new AAA(126);
  Meal() { print("Meal()"); }
}

class Bread {
  Bread() { print("Bread()"); }
   AAA a=new AAA(888);
}

class Cheese {
  Cheese() { print("Cheese()"); }
}

class Lettuce {
  Lettuce() { print("Lettuce()"); }
}

class Lunch extends Meal {
	int ccc;
  Lunch() { print("Lunch()");
  int i;
  i=1;
  i++;
  ccc++;}
  private AAA a;
  public void f()
  {
	  AAA b;
	  
	 
  }
}

class PortableLunch extends Lunch {
  PortableLunch() { print("PortableLunch()");}
}

public class Sandwich extends PortableLunch {
  private Bread b = new Bread();
  private Cheese c = new Cheese();
  private Lettuce l = new Lettuce();
  public Sandwich() { print("Sandwich()"); }
  public static void main(String[] args) {
    new Sandwich();
  }
} /* Output:
Meal()
Lunch()
PortableLunch()
Bread()
Cheese()
Lettuce()
Sandwich()
*///:~
