package thinkingjava4.test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * 通过跳过安全检查，提高反射效率
 * 三种执行方法的效率差异比较
 * 
 * @author 尚学堂高淇 www.sxt.cn
 *
 */
public class Demo06 {
	
	public static void test01(){
		User u = new User();
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000000L; i++) {
			u.getUname();
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("普通方法调用，执行10亿次，耗时："+(endTime-startTime)+"ms"); 
	}
	
	public static void test02() throws Exception{
		User u = new User();
		Class clazz = u.getClass();
		Method m = clazz.getDeclaredMethod("getUname", null);
//		m.setAccessible(true);
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000000L; i++) {
			m.invoke(u, null);
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("反射动态方法调用，执行10亿次，耗时："+(endTime-startTime)+"ms");
	}
	
	public static void test03() throws Exception{
		User u = new User();
		Class clazz = u.getClass();
		Method m = clazz.getDeclaredMethod("getUname", null);
		m.setAccessible(true);	//不需要执行访问安全检查
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000000L; i++) {
			m.invoke(u, null);
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("反射动态方法调用，跳过安全检查，执行10亿次，耗时："+(endTime-startTime)+"ms");
	}
	
	
	public static void main(String[] args) throws Exception {
		String s="akdfkadfk";
		Date a=new Date();
		Date b=new Date();
		System.out.println(s.hashCode());
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a.equals(b));
		Set set =new HashSet();
		ArrayList list=new ArrayList();
	}
}