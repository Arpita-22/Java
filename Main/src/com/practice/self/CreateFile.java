package com.practice.self;
import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[]args) throws IOException {
		File myFile = new File("filename.text");
		try {
			if(myFile.createNewFile()) {
				System.out.println(myFile.getName());
			}else {
				System.out .println("File already exists");
			}
		}	
		catch (IOException e) {
		System.out.println("error");
		e.printStackTrace();
	  }
	}

}
