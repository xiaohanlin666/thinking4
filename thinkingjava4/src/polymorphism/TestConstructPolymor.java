package polymorphism;

public class TestConstructPolymor {
	public TestConstructPolymor() {
		// TODO Auto-generated constructor stub
		System.out.println("before");
		TestConstructPolymor a=f(this);
		System.out.println(a+"==="+a.f(this).getClass());
		System.out.println("after");
	}
	
	TestConstructPolymor f(TestConstructPolymor t)
	{
		System.out.println("Test f()");
		return t;
	}
	public static void main(String[] args) {
		new Sub();
	}

}

class Sub extends TestConstructPolymor{
	int xx=168;
	public Sub()
	{
		System.out.println("sub sub sub");
	}
	
	Sub f(TestConstructPolymor t)
	{
		System.out.println("Sub f()==="+xx);
		return (Sub)t;
	}
}

