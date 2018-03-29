package chapter3.part3_1_6;

public class ThreadB extends Thread {
	private Object lock;
	
	public ThreadB(Object lock){
		super("B");
		this.lock = lock;
	}
	@Override
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}
}
