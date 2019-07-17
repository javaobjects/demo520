package 线程二;

public class PlayMusic implements Runnable{

	public void playmusic() {
		while(true) {
			System.out.println("playmusic");
		}
	}
	@Override
	public void run() {
		playmusic();
		
	}
}
