package 对文件进行读取操作;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestReadFile_InputStream {

	public static void main(String[] args) {

		/**
		 * 对文件进行读写操作套路：
		 * 1. 总是声明文件对象
		 * 2. 实例化流
		 * 3. 读或者写，注意要循环读取
		 * 4.把流关闭
		 */
		
		//1. 总是声明文件对象
		File source = new File("file","abc.txt");
		
		//2. 实例化流
		InputStream is = null;
		
		try {
			is = new FileInputStream(source);
			
			int result = -1;//存放读的字节，就是读的结果
		
			while((result = is.read()) != -1) {
				System.out.print((char)result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {//把流关闭
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
