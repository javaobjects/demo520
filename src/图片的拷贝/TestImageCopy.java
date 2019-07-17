package 图片的拷贝;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestImageCopy {

	public static void main(String[] args) {

		/**
		 * 文件拷贝的套路：
		 * 1. 要有两个文件对象：源文件 目标文件
		 * 2. 要有两个流 ， 一个负责读，一个负责写
		 * 3.循环读写
		 * 4.流都要关闭
		 */
//		1. 要有两个文件对象：源文件 目标文件
		File source = new File("E:\\简书\\Java\\138-Images\\1.png");
//		File source = new File("E:\\1.png");
		
		File dest = new File("E:\\简书\\Java\\1.png");
//		File dest = new File("D:\\1.png");
		
//		2. 要有两个流 ， 一个负责读，一个负责写
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(source);
			fos = new FileOutputStream(dest);
			
			byte[] b = new byte[3];//存放读的数据
			int numbers = -1;//使用该变量作为循环的条件
			//这里是读，读到b数组中，b数组是我们在内存中开辟缓冲区
			while((numbers = fis.read(b)) != -1) {
				fos.write(b,0,numbers);//读多少写多少
				fos.flush(); //刷新
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {//4.流都要关闭
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
