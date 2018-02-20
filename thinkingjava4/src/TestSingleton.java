
public class TestSingleton {
public static void main(String[] args) {
	CarSingle c=CarSingle.getInstance();
}
}

class CarSingle{
	private static CarSingle c=new CarSingle();
	private CarSingle()
	{
		
	}
	static CarSingle getInstance()
	{
		return c;
	}
}
