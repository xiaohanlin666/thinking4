package polymorphism;

public class TestFiled {
	private int i=18;
	 int get()
	{
		return i;
	}

	public static void main(String[] args) {
		TestFiled test=new SubTest();
		System.out.println(test.get());
	}
}

class SubTest extends TestFiled{
	private int i=66;
	 int get()
	{
		return i;
	}
}
