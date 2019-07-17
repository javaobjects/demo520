package 装饰模式;

public class Test {

	public static void main(String[] args) {
		new MyBufferedInputStream(new MyFileInputStream()).read();
	}

}
