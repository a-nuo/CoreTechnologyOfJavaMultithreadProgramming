package chapter2.part2_3_7;

public class ThreadA extends Thread{
	private Service	service;
	public ThreadA (Service service){
		this.service = service;
	}
	
	@Override
	public void run() {
		this.service.runMethod();
	}

}
