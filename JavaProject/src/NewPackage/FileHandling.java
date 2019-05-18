package NewPackage;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("D:\\rahul\\file1.txt");
		boolean status = f.createNewFile();
		if (status)
		{
			System.out.println("File Created");
			
		}
	
		else 
		{
			System.out.println("File not Created");
		}
	
	}
	
	

}
