package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;

public class TestFileInput {
	public static void main(String[] args)throws Exception {
		/*File file=new File("c:"+File.separator+"hahaha.txt");
		System.out.println(file.length());
		String haha="永勇";
		byte[] b=haha.getBytes();
		
		OutputStream os=new FileOutputStream(file);
		for(int i=0;i<b.length;i++)
		os.write((int)b[i]);
		os.close();
		
		
		
		
		File file2=new File("c:"+File.separator+"hahaha.txt");
		System.out.println(file2.length());
		byte[] b2=new byte[(int)file2.length()];
		
		InputStream is=new FileInputStream(file2);
		is.read(b2);
		is.close();
		System.out.println(new String(b2));*/
		
		
		
		
		File file3= new File( "c:"+File.separator+"hahaha.txt");
        //获得一个字节流
       InputStream is3= new FileInputStream( file3);
        //把字节流转换为字符流，其实就是把字符流和字节流组合的结果。
       Reader reader3= new InputStreamReader( is3);
        char [] byteArray= new char[( int) file3.length()];
        int size= reader3.read( byteArray);
       System. out.println( "大小:"+size +";内容:" +new String(byteArray));
       System.out.println(byteArray.length);
       for(int i=0;i<byteArray.length;i++)
    	   System.out.println(byteArray[i]);
       
       System.out.println("=====");
        is3.close();
        reader3.close();
		
	}

}
