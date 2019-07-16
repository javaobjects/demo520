package 对文件进行写操作;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestWriteFile_OutputStream {

	public static void main(String[] args) {

		/**
		 * 对文件进行写操作的完整套路：
		 * 1、要有目标文件，内容的输出地
		 * 2、要实例化输出流
		 * 3、写操作，肯定要while循环
		 * 4、流要关闭
		 * 
		 * 备注：若目标文件中有内容将会对其内容清空再写入
		 */
		File path = new File("file");
		
		if(!path.exists()) {
			path.mkdir();//创建一级目录 
		}
		
		File dest = new File(path,"abc.txt");
		
		if(!dest.exists()) {
			try {
				dest.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//2.要实例化输出流
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(dest);
			//3.写操作
			String message = "qwert";//写的内容
			byte[] b = message.getBytes();
			for (int i = 0; i < b.length; i++) {
				fos.write(b[i]);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();//4. 流要关闭
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
