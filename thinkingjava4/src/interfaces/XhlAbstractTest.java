package interfaces;

public abstract class XhlAbstractTest {
	 int haha=10;
	
	public int f()
	{
		haha++;
		System.out.println("f() f()==="+haha);
		return 100;
	}
	
	abstract protected void g();
	
	abstract public  void x();
	

	public static void main(String[] args) {
		XhlAbstractTest x=new Sub();
		System.out.println(x.haha);
		x.f();
		x.f();
		x.f();
		x.f();
		
	}
}

class Sub extends XhlAbstractTest{
	int haha=20;

	@Override
	public int f() {
		// TODO Auto-generated method stub
		haha++;
		System.out.println("==="+haha);
		System.out.println("super==="+super.haha);
		return haha;
	}

	@Override
	protected void g() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void x() {
		// TODO Auto-generated method stub
		
	}
	
}
