package innerclasses;

import innerclasses.TestOuter.Inner1;

public class Outer {
	 class Inner{
		public Inner(){
			System.out.println("inner inner");
		}
	}
	public Inner getInner()
	{
		return new Inner();
	}
	public static void main(String[] args) {
		TestOuter t=new TestOuter();
		TestOuter.Inner1 i=t.new Inner1("adfdf");
		i.printUpcase();
		
	}

}
