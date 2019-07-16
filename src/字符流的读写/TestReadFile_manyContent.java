package 字符流的读写;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestReadFile_manyContent {

	public static void main(String[] args) {
		File source = new File("E:\\abc.txt");
		
//		FileReader f;
//		
//		BufferedReader br;
		
		//jdk7的新写法，不用写finally语句块，可以自动释放资源
		try(
				BufferedReader br = new BufferedReader(new FileReader(source));
				){
			String content = null;
			
			while((content = br.readLine()) != null) {
				System.out.println(content);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
