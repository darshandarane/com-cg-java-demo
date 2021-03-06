package com.cg.demo.ios;
 
import java.io.*;
import java.nio.*;

public class NioDemo {
	
	public static void main(String[] args) throws IOException {

		Path filePath = Paths.get("myfile.txt");
		InputStream is = Files.newInputStream(filePath);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		System.out.println(br.readLine());
		br.close();
		isr.close();
		is.close();
	}
}
