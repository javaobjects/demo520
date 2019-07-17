package 文件类;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) {
		//1. 如何创建File对象
		
		File file = new File("D:\\a.txt");
		//2. File类的方法有哪些？
		if(!file.exists()) {
			try {
				file.createNewFile();//文件不存在就创建
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		File b = new File("D:\\a\\b\\c");
		if(!b.exists()) {
			b.mkdirs();//创建多级目录，创建单级目录则为mkdir()
		}
		//3.
		File c = new File("file","abc.txt");//此处必须保证项目根目录有file文件夹
		if(!c.exists()) {
			try {
				c.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("c.canRead(): " + c.canRead());//是否可读
		System.out.println("c.canWrite(): " + c.canWrite());//是否可写
		System.out.println("c.getAbsolutePath(): " + c.getAbsolutePath());//绝对路径
		System.out.println("c.exists(): " + c.exists());//是否存在
		System.out.println("c.getName(): " + c.getName());//文件名
		System.out.println("c.lastModified(): " + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").
				format(new Date(c.lastModified())));//最后修改时间
	}

}
