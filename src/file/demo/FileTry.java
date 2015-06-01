package file.demo;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FileTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hudai");
		
		try {
			//System.setIn(new Scanner(new File(E:\\hudai\\filetry.txt)));
			System.setOut(new PrintStream(new FileOutputStream( new File("E:\\hudai\\filetry.txt"))) );
			System.out.println("Happy to see ");
			System.out.println("মোঃ জুবায়ের ইবনে মোস্তফা");
			System.out.println("Nothing");
			
			System.setOut( new PrintStream(new FileOutputStream(FileDescriptor.out)));
			System.out.println("Happy to see ");
			System.out.println("Nothing");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
