package com.org.practice_;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Write a program to copy the image from one location and paste in another location

public class CopyImgOneLocationToAnotherFileIO {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\Pune Class Practice\\1.png");
		FileOutputStream fos = new FileOutputStream("D:\\Workspaces\\11.png");
		
		Byte[] b = new Byte[1024];
		
		 byte[] buffer = new byte[1024];
         int bytesRead;

         while ((bytesRead = fis.read(buffer)) != -1) {
             fos.write(buffer, 0, bytesRead);
         }

         System.out.println("Image Copied Successfully...");

	}
}
