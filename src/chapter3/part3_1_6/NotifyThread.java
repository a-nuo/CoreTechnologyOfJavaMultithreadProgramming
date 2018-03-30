package chapter3.part3_1_6;

public class NotifyThread extends Thread{
	private Object lock;
	public NotifyThread(Object lock){
		super("NotifyThread");
		this.lock = lock;
	}
	
	@Override
	public void run() {
		synchronized(lock){
			//唤醒A、B、C三个线程，但他们都不能立即执行，直到Notify线程同步块儿执行完毕，才能开始执行
			System.out.println("notify begin ThreadName :1"+Thread.currentThread().getName());
			lock.notify();
			System.out.println("notify end ThreadName :1"+Thread.currentThread().getName());
			System.out.println("notify begin ThreadName :2"+Thread.currentThread().getName());
			lock.notify();
			System.out.println("notify end ThreadName :2"+Thread.currentThread().getName());
			System.out.println("notify begin ThreadName3 :"+Thread.currentThread().getName());
			lock.notify();
			System.out.println("notify end ThreadName :3"+Thread.currentThread().getName());
			System.out.println("notify begin ThreadName4 :"+Thread.currentThread().getName());
			lock.notify();
			System.out.println("notify end ThreadName :4"+Thread.currentThread().getName());
		}
	}
}
