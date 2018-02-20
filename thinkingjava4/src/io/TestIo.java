package io;

import java.io.UnsupportedEncodingException;

import javax.xml.bind.DatatypeConverter;

public class TestIo {
	
	private static void toHex(byte[] bytes)
	{
		String helloHex = DatatypeConverter.printHexBinary(bytes);  
        System.out.println(helloHex);
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {  
        byte[] b;  
        String str = "测";  
  
        //UTF8编码格式下，一个汉字占3字节  
        b = str.getBytes("UTF-8");  
        toHex(b);
        System.out.println("UTF8编码格式下，一个汉字占" + b.length + "字节");  
  
        //UTF16编码格式下，一个汉字占4字节  
        b = str.getBytes("UTF-16");  
        toHex(b);
        System.out.println("UTF16编码格式下，一个汉字占" + b.length + "字节");  
  
        //默认编码UTF-8编码格式下，一个汉字占3字节  
        b = str.getBytes();  
        toHex(b);
        System.out.println("默认编码" + System.getProperty("file.encoding") + "编码格式下，一个汉字占" + b.length + "字节");  
    }  

}
