package strategy;

public class SortUtil {
	private SortMethod sortMethod;

	public SortUtil(SortMethod sortMethod)
	{
		this.sortMethod=sortMethod;
	}

	public void setSortMethod(SortMethod sortMethod) {
		this.sortMethod = sortMethod;
	}
	
	public void sort(Compareable[] array)
	{
		System.out.println(329932932);
		System.out.println(array);
		 sortMethod.sort(array);
	}
	
	public static void main(String[] args) {
		SortUtil s=new SortUtil(new InsertSort());
		Dog[] d=new Dog[]{new Dog(12),new Dog(22),new Dog(33)};
		Cat[] c=new Cat[]{new Cat(66),new Cat(88),new Cat(899)};
		s.sort(c);
	}
}

interface SortMethod{
	public void sort(Compareable[] arr);
}

interface Compareable{
	public int compare(Compareable o);
}

class Cat implements Compareable
{

	private int age;
	public Cat(int age)
	{
		this.age=age;
	}
	@Override
	public int compare(Compareable o) {
		// TODO Auto-generated method stub
		Cat c=(Cat)o;
		if(c.age>this.age)
			return 1;
		return -1;
	}
	
}
class Dog implements Compareable
{

	private int weight;
	public Dog(int weight)
	{
		this.weight=weight;
	}
	@Override
	public int compare(Compareable o) {
		// TODO Auto-generated method stub
		Dog c=(Dog)o;
		if(c.weight>this.weight)
			return 1;
		return -1;
	}
	
}
class PopSort implements SortMethod
{

	@Override
	public void sort(Compareable[] arr) {
		// TODO Auto-generated method stub
		Compareable[] result;
		if(arr!=null&&arr.length>0)
		result=new Compareable[arr.length];
		if(arr[1].compare(arr[2])==1)
			arr[1]=arr[2];
		
		
	}
	
}

class InsertSort implements SortMethod
{

	@Override
	public void sort(Compareable[] arr) {
		// TODO Auto-generated method stub
		Compareable[] result;
		if(arr!=null&&arr.length>0)
		result=new Compareable[arr.length];
		if(arr[1].compare(arr[2])==1)
			arr[1]=arr[2];
	}
	
}
