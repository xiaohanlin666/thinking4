//: exceptions/LostMessage.java
// How an exception can be lost.
package exceptions;

import java.util.HashMap;

class VeryImportantException extends Exception {
  public String toString() {
    return "A very important exception!";
  }
}

class HoHumException extends Exception {
  public String toString() {
    return "A trivial exception";
  }
}

public class LostMessage {
	
	
	
  void f() throws VeryImportantException {
    throw new VeryImportantException();
  }
  void dispose() throws HoHumException {
    throw new HoHumException();
  }
  public static void main(String[] args)throws Exception {
	  LostMessage l=new LostMessage(); 
	  
		try {
			try {
				HashMap m=new HashMap();
				
				l.f();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			try {
				throw e.getCause();
			} catch (Throwable e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	
  }
} /* Output:
A trivial exception
*///:~
