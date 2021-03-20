package language.practice.self;
import java.io.*;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;

public class ReadConsole {
	public static void main(String [] args) throws IOException {
		InputStreamReader cin = null;
		
		try {
			cin = new InputStreamReader(System.in);
			System.out.println("enter characters, press q to quit");
			char c;
			do {
				c = (char) cin.read();
				System.out.println(c);	
			}while(c != 'q');
		}finally {
			if(cin != null) {
				cin.close();
			}
			
		}
		//to create a file object and read from it
		File f1 = new File("c:/java/hello");
		InputStream fI = new FileInputStream(f1);
		
		//to create a file  and write data to it
		File f2 = new File("c:/java/hello");
		OutputStream fO = new FileOutputStream(f2);
		
		//try-with-resources
		FileReader fr = null;
		try {
			File file = new File("file.txt");
			fr = new FileReader(file);
			char [] a = new char[10];
			fr.read(a);//reads the content to the array
			for(char c : a) {
				System.out.println(c);//prints the character one by one
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				fr.close();		
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
}
