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
		 * 
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
			//默认删除写，若想要追加写则需要后面加参数true
			fos = new FileOutputStream(dest);
			//3.写操作
			String message = "qwert";//写的内容
			byte[] b = message.getBytes();
//			1024的倍数，线程1：0-1024 线程：1024-2048 线程：2048-3072
//			fos.write(b);//可以直接写入一个byte数组
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
