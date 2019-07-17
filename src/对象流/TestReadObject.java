package 对象流;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestReadObject {

	public static void main(String[] args) {

		/**
		 * 读对象的套路:
		 * 1. 要有对象源，在文件里
		 * 2. 把对象输出流实例化
		 * 3.读
		 */
		File file = new File("E:\\stu.txt");
		
		try (
				ObjectInputStream is = new ObjectInputStream(new FileInputStream(file))
				){
			Student stu = (Student) is.readObject();
			System.out.println(stu);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
