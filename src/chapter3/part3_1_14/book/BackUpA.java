package chapter3.part3_1_14.book;

import java.util.concurrent.CountDownLatch;

public class BackUpA extends Thread {
	private DBTools dbTools;
	private CountDownLatch latch;
	public BackUpA(DBTools dbTools, CountDownLatch latch){
		this.dbTools = dbTools;
		this.latch = latch;
	}
	@Override
	public void run() {
		dbTools.backupA();
		latch.countDown();
	}
}
