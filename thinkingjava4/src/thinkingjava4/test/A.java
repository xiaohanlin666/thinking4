package thinkingjava4.test;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 肖翰林
 * @version 1.0
 */
@XhlTest(tablename="student")
public class A extends SubA {
	
	private int id;
	
	public A(String s)
	{
		System.out.println("AAAAAAA"+s);
		List list=new ArrayList();
	}
	@XhlTest(name="",abc=1)
	public int a()
	{
		return 0;
	}

	int a=10;
	
	public static void main(String[] args)throws Exception {
		Class clazz=Class.forName("thinkingjava4.test.A");
		System.out.println(clazz);
		Annotation a[]= clazz.getAnnotations();
		System.out.println(a.length);
		for(Annotation b:a)
		{
			System.out.println(b);
		}
		
		XhlTest x=(XhlTest)clazz.getDeclaredAnnotation(XhlTest.class);
		System.out.println(clazz.getDeclaredFields()[1]);
		
		System.out.println(clazz.getConstructor(String.class));
		
	}
}
