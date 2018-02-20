package thinkingjava4.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExtractM {
	private String name;
	
   void testList(List list)
   {
	   System.out.println("before==="+list);
	   list.add("haha");
	   System.out.println("after==="+list);
   }
	
   @XhlTest
   void modifyList(List list)
   {
	   System.out.println("modify before==="+list);
	   list=new LinkedList<String>();
	   list.add("ted");
	   list.add("qu");
	   System.out.println("modify after==="+list);
	   
   }
   
   public static void main(String[] args) {
	ExtractM m=new ExtractM();
	List list=new ArrayList<>();
	System.out.println(list);
	m.modifyList(list);
	System.out.println(list);
}
	

}
