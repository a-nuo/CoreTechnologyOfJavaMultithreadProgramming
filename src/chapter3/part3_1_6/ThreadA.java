package chapter3.part3_1_6;

public class ThreadA extends Thread {
	private Object lock;
	
	public ThreadA(Object lock){
		super("A");
		this.lock = lock;
	}
	@Override
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}
}
