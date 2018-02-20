package io;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
 
/**
 * Java程序通过字节流和字符流的方式来读取文件数据。
 * 需强调FileInputStream和FileReader的关键区别在于：FileReader用于读取字符流，而FileInputStream用来读取原始字节流。
 * @author Javin Paul
 */
public class HowToReadFileInJava {
    public static void main(String args[]) {
 
        // 例1 – 使用FileInputStream 读取文件内容
        try (FileInputStream fis = new FileInputStream("c:/data.txt")) {
            int data = fis.read();
            while (data != -1) {
                System.out.print(Integer.toHexString(data));
                data = fis.read();
            }
        } catch (IOException e) {
            System.out.println("Failed to read binary data from File");
            e.printStackTrace();
        }
 
            System.out.println();
        // 例2 – Java中使用FileReader 读取文件数据
        try (FileReader reader = new FileReader("c:/data.txt")) {
            int character = reader.read();
            while (character != -1) {
                        System.out.print(Integer.toHexString(character));
                System.out.print((char) character);
                character = reader.read();
            }
        } catch (IOException io) {
            System.out.println("Failed to read character data from File");
            io.printStackTrace();
        }
    }
}