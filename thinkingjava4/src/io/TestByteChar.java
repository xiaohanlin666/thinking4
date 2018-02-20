package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.DatatypeConverter;

public class TestByteChar {
	
	private static void toHex(byte[] bytes)
	{
	String helloHex = DatatypeConverter.printHexBinary(bytes); 
	System.out.println(helloHex);
	}

	public static void encode() { 
	String name = "I am 君山"; 
	for(char c:name.toCharArray())
	System.out.print(Integer.toHexString(c));
	System.out.println();
	try { 
	byte[] iso8859 = name.getBytes("ISO-8859-1"); 
	toHex(iso8859); 
	byte[] gb2312 = name.getBytes("GB2312"); 
	toHex(gb2312); 
	byte[] gbk = name.getBytes("GBK"); 
	toHex(gbk); 
	byte[] utf16 = name.getBytes("UTF-16"); 
	toHex(utf16); 
	byte[] utf8 = name.getBytes("UTF-8"); 
	toHex(utf8); 
	} catch (UnsupportedEncodingException e) { 
	e.printStackTrace(); 
	} 
	}
	
	
	public static void main(String[] args) throws Exception{
		boolean a=true;
		boolean b=true;
		boolean c=a^b;
		System.out.println(c);
		/*String file = "c:/stream.txt"; 
		String charset = "UTF-8"; 
		// 写字符换转成字节流
		FileOutputStream outputStream = new FileOutputStream(file); 
		OutputStreamWriter writer = new OutputStreamWriter( 
		outputStream, charset); 
		try { 
		   writer.write("这是要保存的中文字符"); 
		} finally { 
		   writer.close(); 
		} 
		// 读取字节转换成字符
		FileInputStream inputStream = new FileInputStream(file); 
		InputStreamReader reader = new InputStreamReader( 
		inputStream, charset); 
		StringBuffer buffer = new StringBuffer(); 
		char[] buf = new char[64]; 
		int count = 0; 
		try { 
		   while ((count = reader.read(buf)) != -1) { 
		       buffer.append(buf, 0, count); 
		   }
		 
		   System.out.println(buffer); 
		} finally { 
		   reader.close(); 
		}
		*/
		
		
		Pattern p=Pattern.compile("(\\D*)(.+)");
		Matcher m = p.matcher("ab1\\ndkfdk1");
		while(m.find())
		{
			System.out.println(m.group());
			System.out.println(m.group(1));
			System.out.println(m.group(2));
		}
		
		//encode();
}
}
