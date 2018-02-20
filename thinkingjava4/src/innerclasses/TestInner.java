package innerclasses;

import java.util.List;
import java.util.Stack;

public class TestInner {
	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
