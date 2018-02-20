package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import serial.Person;

public class GenericArg {
	
	public static <T> List<T> makeList(T ...args)
	{
		List<T> list=new ArrayList<T>();
		for(T t:args)
			list.add(t);
		return list;
	}
	
	public static void main(String[] args) {
		List<String> l=GenericArg.<String>makeList("a","b","c","d");
		System.out.println(l.get(0));
		Map<Person,List<? extends Person>> map=new HashMap();
		map.put(new Person(), new ArrayList());
		
	}

}
