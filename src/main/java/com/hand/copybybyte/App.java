package com.hand.copybybyte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try {
		FileInputStream fis = new FileInputStream("G1.jpg");
		FileOutputStream fos = new FileOutputStream("newG1.jpg");
		byte input[]=new byte[50];
		while (fis.read(input)!=-1) {
			fos.write(input);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}
