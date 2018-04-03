package chapter3.part3_2_3;
/**
 * 打印随机数
 * @author a_nuo
 *
 */
public class ThreadC extends Thread {
	private ThreadB b;
	public ThreadC(ThreadB b){
		super("ThreadC");
		this.b = b;
	}
	@Override
	public void run() {
		System.out.println("sysout:"+Thread.currentThread().getName());
			System.out.println("ThreadC run start ");
			b.interrupt();
	}
}
