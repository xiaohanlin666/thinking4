package io;

import java.io.*;

public class Stream3{

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
        
       

        byte[] byt=new byte[32];
        int len=0;
        try{
           
            while(-1 != (len=fi.read(byt))){
                fo.write(byt,0,len);
                
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        try{
            fo.flush();
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
