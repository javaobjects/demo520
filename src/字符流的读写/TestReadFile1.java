package 字符流的读写;

import java.io.File;
import java.io.FileInputStream;

public class TestReadFile1 {

	public static void main(String[] args) {
		File source = new File("e:\\abc.txt");

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(source);

			System.out.println((char) fis.read());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
