//: control/CommaOperator.java

public class CommaOperator {
  public static void main(String[] args) {
	 String s="def";
	 switch(s)
	 {
	 case "abc":
	 case "def":
	 case "ghi":System.out.println("abcdefghi");break;
	 case "jkl":System.out.println("jkl");
	 case "mno":System.out.println("mno");break;
	 default:System.out.println("not");
	 
	 }
  }
} /* Output:
i = 1 j = 11
i = 2 j = 4
i = 3 j = 6
i = 4 j = 8
*///:~
