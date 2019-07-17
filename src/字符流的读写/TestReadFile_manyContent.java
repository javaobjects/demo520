package 字符流的读写;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TestReadFile_manyContent {

	public static void main(String[] args) {
		File source = new File("E:\\abc.txt");
		File dest = new File("D:\\abc.txt");
		
//		FileReader f;
//		
//		BufferedReader br;
		
		//jdk7的新写法，不用写finally语句块，可以自动释放资源
		try(
				BufferedReader br = new BufferedReader(new FileReader(source));
				BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
				){
			String content = null;
			
			while((content = br.readLine()) != null) {
//				System.out.println(content);
				bw.write(content);
				bw.newLine();//换行操作
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
