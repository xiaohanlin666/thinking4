package innerclasses;

public class TestOuter {
	
	private Inner1 inner1=new Inner1("abcdefg");
	private Inner2 inner2=new Inner2();
	
	class Inner1{
		
		public String s;
		public Inner1(String s)
		{
			this.s=s;
		}
		
		void printUpcase()
		{
			System.out.println(s.toUpperCase());
		}
		
	}
	
	class Inner2{
		
		TestOuter getOuter()
		{
			return TestOuter.this;
		}
		
	}
	
	public Inner1 get1()
	{
		return inner1;
	}
	public Inner2 get2()
	{
		return inner2;
	}
	
	
	public void pr()
	{
		inner1.printUpcase();
	}
	
	
	public static void main(String[] args) {
		TestOuter t=new TestOuter();
		System.out.println(t.new Inner2().getOuter()==t);
		TestOuter.Inner1 i=t.new Inner1("adfdf");
		i.printUpcase();
	}
	
	

}
