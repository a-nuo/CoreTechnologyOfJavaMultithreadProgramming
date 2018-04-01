package chapter3.part3_1_14.my;

import java.util.concurrent.CountDownLatch;

/**
 * 交替打印A,B,本例
 * @author a_nuo
 *
 */
public class Run {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch  latch = new CountDownLatch(40);
		DBTools dbTools = new DBTools();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 20; i++) {
			BackUpA a = new BackUpA(dbTools,latch);
			a.start();
			BackUpB b = new BackUpB(dbTools,latch);
			b.start();
		}
		latch.await();
		System.out.println(System.currentTimeMillis()-startTime);
	}

}
