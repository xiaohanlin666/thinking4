package thinkingjava4.test;

public class Fruit<T> {
	
	T a;

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}
	
	
	T test(Fruit<T> bb)
	{
		T a=null;
		Fruit<?> bbdfd =new Fruit<String>();
		return a; 
	}
	

}
