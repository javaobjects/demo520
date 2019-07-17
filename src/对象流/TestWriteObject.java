package 对象流;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestWriteObject {

	public static void main(String[] args) {

		/**
		 * 写对象的套路：
		 * 1. 要有对象
		 * 2. 把对象输出实例化
		 * 3. 写
		 */
		
		Student stu = new Student(100,"sunwukong","huaguoshan");
		File file = new File("E:\\stu.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try (
				ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file))
				)
		{
			os.writeObject(stu);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
