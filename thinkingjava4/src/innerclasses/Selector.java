package innerclasses;

public interface Selector {
	boolean end();
	Object current();
	void next();

}

class Sequence{
	private Object[] items;
	private int index=0;
	public Sequence(int i)
	{
		items=new Object[i];
	}
	public void add(Object o)
	{
		if(index<items.length)
		items[index++]=o;
	}
	
	public Selector getSel()
	{
		return new SequenceSelector();
	}
	
	class SequenceSelector implements Selector{

		private int i=0;
		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i==items.length;
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items[i];
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			i++;
		}
		
	}
	
	
	public static void main(String[] args) {
		Sequence s=new Sequence(10);
		for(int i=0;i<10;i++)
			s.add(i);
		Selector selector=s.getSel();
		while(!selector.end())
		{
			System.out.println(selector.current());
			selector.next();
		}
	}
	
}
