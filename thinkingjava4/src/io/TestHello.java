package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

import org.omg.CORBA.portable.UnknownException;

public class TestHello {
	
	public static void main(String[] args)throws Exception {
		
		URL url=new URL("http://dota2.sgamer.com/");
		BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
		String sb=new String();
		
		while((sb=br.readLine())!=null){
			System.out.println(sb);
		}
		 }

}
