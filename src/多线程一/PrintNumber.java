package 多线程一;
/**
 * 打印数字的类
* <p>Title: PrintNumber</p>  
* <p>Description: </p>  
* @author xianxian 
* @date 2019年7月17日
 */
public class PrintNumber implements Runnable{

	private int startNumber;
	private int endNumber;
	
	/**
	 * 
	 * <p>Title: print</p>  
	 * <p>Description: 打印数字的方法</p>
	 */
	public void print() {
		for(int i = this.startNumber;i <= this.endNumber;i++) {
			System.out.println(i);
		}
	}
	public PrintNumber(int startNumber, int endNumber) {
		this.startNumber = startNumber;
		this.endNumber = endNumber;
	}
	public int getStartNumber() {
		return startNumber;
	}
	public void setStartNumber(int startNumber) {
		this.startNumber = startNumber;
	}
	public int getEndNumber() {
		return endNumber;
	}
	public void setEndNumber(int endNumber) {
		this.endNumber = endNumber;
	}
	@Override
	public void run() {
		// 当前类实现Runnable接口，就成咯一个线程类，
		//实现Runnable接口，必须实现接口中的run方法
		//那么线程启动时会自动执行run方法
		this.print();
	}
}
