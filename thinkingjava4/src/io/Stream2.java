package io;

import java.io.*;

public class Stream2{

    public static void f(){
        FileInputStream fi = null;
        try{
            fi = new FileInputStream("c:/123456.flv");
        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        }

        FileOutputStream fo = null;
        try{
            fo = new FileOutputStream("d:/888888.flv");
        }catch(Exception e){
            System.out.println("error in file output stream's creation");
            e.printStackTrace();
        }
        
        BufferedInputStream bis=new BufferedInputStream(fi, 1024);
        BufferedOutputStream bos=new BufferedOutputStream(fo, 1024);

        int byt;
        try{
            byt = bis.read();
            while(-1 != byt){
                bos.write(byt);
                byt = bis.read();
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        try{
            bos.flush();
        }catch(IOException e){
            System.out.println("Exception in flush()");
        }finally{
            if (null != fo){
                try{
                    fo.close();
                }catch(IOException e){
                    System.out.println("Exception in fo.close()");
                }
            }
           
            if (null != fi){
                try{
                    fi.close();
                }catch(IOException e){
                    System.out.println("Exception in fi.close()");
                }
            }
        }

        System.out.println("copy done!");
    }
    
    
    
    public static void main(String[] args) {
		
    	long start=System.currentTimeMillis();
    	f();
    	long end=System.currentTimeMillis();
    	System.out.println(end-start);
	}
}
