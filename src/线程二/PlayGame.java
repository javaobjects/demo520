package 线程二;

public class PlayGame implements Runnable{
	
	public void playgame() {
		while(true) {
			System.out.println("playgame");
		}
	}
	@Override
	public void run() {
		playgame();
	}
}
