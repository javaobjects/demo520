package 线程二;

public class Chat implements Runnable{

	public void wechar() {
		while(true) {
			System.out.println("wechar");
		}
	}
	@Override
	public void run() {
		wechar();
	}
}
