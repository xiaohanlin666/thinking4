package generic;

public class TestThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		throw new RuntimeException();
	}
	
	public static void main(String[] args) {
		try {
			Thread t=new Thread(new TestThread());
			//t.setUncaughtExceptionHandler(new TestThreadHandler());
			t.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("==========="+e);
		}
	}

}

class TestThreadHandler implements Thread.UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		System.out.println("==========="+e);
	}
	
}
