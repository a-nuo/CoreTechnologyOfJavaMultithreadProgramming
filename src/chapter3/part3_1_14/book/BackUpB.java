package chapter3.part3_1_14.book;

import java.util.concurrent.CountDownLatch;

public class BackUpB extends Thread {
	private DBTools dbTools;
	private CountDownLatch latch;
	public BackUpB(DBTools dbTools, CountDownLatch latch){
		this.dbTools = dbTools;
		this.latch = latch;
	}
	@Override
	public void run() {
		dbTools.backupB();
		latch.countDown();
	}
}
