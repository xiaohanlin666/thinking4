package generic;

import innerclasses.Contents;
import innerclasses.Destination;

public class Parcel6 {
	
	private class PContents implements Contents
	{

		@Override
		public int value() {
			// TODO Auto-generated method stub
			return 111;
		}
		
	}
	
	private class PDestination implements Destination
	{

		@Override
		public String readLabel() {
			// TODO Auto-generated method stub
			return "hahah";
		}
		
	}
	
	
	public Contents getCon()
	{
		return new PContents();
	}
	
	public Contents getConAn()
	{
		return new Contents(){

			@Override
			public int value() {
				// TODO Auto-generated method stub
				return 89898;
			}
			
		};
	}
	
	public class Content2
	{
		public int x=0;
		public Content2(int x)
		{
			this.x=x;
		}
	}
	public Content2 getConAn1()
	{
		int a=2838283;
		return new Content2(a){

			
			public int value() {
				// TODO Auto-generated method stub
				return 8565698;
			}
			
		};
	}
	
	public Destination getDestin()
	{
		return new PDestination();
	}

}
