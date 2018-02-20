package io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeExample {
	   public static void main(String[] args) throws IOException {
	          final PipedOutputStream output = new PipedOutputStream();
	          final PipedInputStream  input  = new PipedInputStream(output);
	          Thread thread1 = new Thread( new Runnable() {
	              @Override
	              public void run() {
	                  try {
	                      output.write( "啊啊啊啊啊Hello world, pipe!".getBytes());
	                  } catch (IOException e) {
	                  }
	              }
	          });
	          Thread thread2 = new Thread( new Runnable() {
	              @Override
	              public void run() {
	            	  System.out.println(1111);
	                  try {StringBuffer sb=new StringBuffer();
	                      int data = input.read();
	                      while( data != -1){
	                          sb.append((char)data);
	                          data = input.read();
	                          System.out.println(sb);
	                      }
	                      System.out.println(1111);
	                  } catch (IOException e) {
	                  } finally{
	                     try {
	                                       input.close();
	                                } catch (IOException e) {
	                                       e.printStackTrace();
	                                }
	                  }
	              }
	          });
	          thread1.start();
	          thread2.start();
	      }
}