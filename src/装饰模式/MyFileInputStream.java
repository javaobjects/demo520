package 装饰模式;

public class MyFileInputStream implements MyInputStream {

	public MyFileInputStream() {
		
	}
	
	@Override
	public int read() {
		System.out.println("MyFileInputStream read()");
		return 0;
	}

}
