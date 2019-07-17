package 多线程一;

public class Test {

	public static void main(String[] args) {

		/**
		 * 需求：朝控制台打印输出1-900这些数字
		 * 技术实现：打快点，同时让三个人(三个线程) 打印输出
		 * 一个从1-300
		 * 一个从301-600
		 * 一个从601-900
		 */
		PrintNumber p1 = new PrintNumber(1, 3000);
//		p1.print();
		PrintNumber p2 = new PrintNumber(3001, 6000);
//		p2.print();
		PrintNumber p3 = new PrintNumber(6001, 9000);
//		p3.print();
		//开辟 三个线程
		Thread t1 = new Thread(p1);//这里有传参准备就绪后会调用run方法
		t1.start();//准备就绪 
		Thread t2 = new Thread(p2);
		t2.start();
		Thread t3 = new Thread(p3);
		t3.start();
	}

}
