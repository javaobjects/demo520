package 字符流的读写;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TestReadFileByFileReader {

	public static void main(String[] args) {
		File source = new File("E:\\abc.txt");
		
		FileReader reader = null;
		
		try {
			reader = new FileReader(source);//把管道接好 
			
			char[] c = new char[16];
			reader.read(c);
			System.out.println(Arrays.toString(c));
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
