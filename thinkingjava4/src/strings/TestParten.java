package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestParten {
	
	public static void main(String[] args) {
		String s="abcabcabc";
		Pattern p=Pattern.compile("(abc)+?");
		Matcher m=p.matcher(s);
		while(m.find())
			System.out.println(m.group(1));
		
	}

}
