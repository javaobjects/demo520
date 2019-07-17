package 线程二;

public class Test {

	public static void main(String[] args) {

		/**
		 * 模拟玩游戏
		 * 1.可以玩游戏
		 * 2.同时可以听音乐
		 * 3.同时可以和队友聊天
		 */
		PlayGame play = new PlayGame();
		
		Chat wechar = new Chat();
		
		PlayMusic music = new PlayMusic();
		
		Thread t1 = new Thread(play);
		t1.start();
		Thread t2 = new Thread(wechar);
		t2.start();
		Thread t3 = new Thread(music);
		t3.start();
	}

}
