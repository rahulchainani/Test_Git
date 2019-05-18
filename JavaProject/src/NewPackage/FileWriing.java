package NewPackage;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fs = new FileOutputStream("D:\\rahul\\file1.txt");
		String text = "I live in Mumbai";
		byte b[] = text.getBytes();
		fs.write(b);
		fs.close();

	}

}
