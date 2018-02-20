package thinkingjava4.test;

public class TestInterput {
	
	public static void main(String[] args) {
		Thread t=new Thread(new Ab());
		
		t.start();
		t.interrupt();
		
	}
	

}

class Ab implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			for(int i=0;i<100;i++)
			System.out.println(Thread.interrupted());
			
		
	}
	
}
