package 装饰模式;

public class MyBufferedInputStream implements MyInputStream {

	private MyInputStream in;
	
	public MyBufferedInputStream(MyInputStream in) {
		this.in = in;
	}
	@Override
	public int read() {
		in.read();
		System.out.println("MyBufferedInputStream 开辟缓冲区read()");
		return 0;
	}

}
