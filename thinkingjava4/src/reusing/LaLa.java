package reusing;

public class LaLa{
	void f()
	{
		System.out.println("LaLa");
	}
	
	public static void main(String[] args) {
		LaLa l=new TT();
		l.f();
	}
   
}

 class TT extends LaLa{

	 void f()
	 {
		 System.out.println("TT");
	 }
	
}

 class Haha extends LaLa{
	 void f()
	 {
		 System.out.println("haha");
	 }
 }