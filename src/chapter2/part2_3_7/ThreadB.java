package chapter2.part2_3_7;

public class ThreadB extends Thread{
	private Service	service;
	public ThreadB (Service service){
		this.service = service;
	}
	
	@Override
	public void run() {
		this.service.stopMethod();
	}

}
