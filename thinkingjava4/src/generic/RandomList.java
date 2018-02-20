package generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList<T> {
	private List<T> storge=new ArrayList<T>();
	private Random ran=new Random(47);
	
	public void add(T o)
	{
		storge.add(o);
	}
	
	public T select()
	{
		return storge.get(ran.nextInt(storge.size()));
	}
	
	public static void main(String[] args) {
		RandomList<String> randList=new RandomList<String>();
		for(String s:"dkfk dkfkdaaa 2odk dfk dldl dl kdkf kdk kdfk kdfk kdflre e232 dlerl3".split(" "))
			randList.add(s);
		
		for(int i=0;i<10;i++)
			System.out.println(randList.select());
	}

}
