package exceptions;

public class TestThread {
	int i=10;
	
	public static void main(String[] args) {
		
		TestThread t=new TestThread();
		Haha h=new Haha();
		for(int i=0;i<5;i++)
		{
			
			
			
		Thread h1=new Thread(h);
		h1.start();
		}
	}

}

class Haha implements Runnable{
	
	private int t=10;
	

	


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(t>0)
		{
			System.out.println(Thread.currentThread().getName()+"==="+t);
			t--;
		}
	}
	
}
