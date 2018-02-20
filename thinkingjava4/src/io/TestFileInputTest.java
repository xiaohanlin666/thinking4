package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileInputTest {
	public static void main(String[] args) {
		FileInputStream fs=null;
		BufferedInputStream bis=null;
		FileOutputStream fo=null;
		try {
			fs=new FileInputStream("c:/aaa.txt");
			bis=new BufferedInputStream(fs);
			 fo=new FileOutputStream("c:/bbb.txt");
			byte[] b=new byte[10];
			int len=0;
			String s;
			StringBuffer sb=new StringBuffer();
			while((len=bis.read(b))!=-1)
			{
				System.out.println(len);
				s=new String(b,0,len,"gbk");
				sb.append(s);
				
				fo.write(b,0,len);
				
			}
			System.out.println(sb);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				fs.close();
				bis.close();
				fo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
