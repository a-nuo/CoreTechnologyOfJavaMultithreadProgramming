package chapter3.part3_1_6;

public class ThreadC extends Thread {
	private Object lock;
	
	public ThreadC(Object lock){
		super("C");
		this.lock = lock;
	}
	@Override
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}
}
