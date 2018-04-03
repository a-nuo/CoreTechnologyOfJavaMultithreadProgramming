package chapter3.part3_2_3;
/**
 * 打印随机数
 * @author a_nuo
 *
 */
public class ThreadB extends Thread {
	public ThreadB(){
		super("ThreadB");
	}
	@Override
	public void run() {
		try {
			ThreadA a = new ThreadA();
			System.out.println("sysout:"+Thread.currentThread().getName());
			a.start();
			System.out.println("TheadB join before");
			a.join();
			System.out.println("TheadB join after");
			System.out.println("线程B在run end处打印了");
		} catch (InterruptedException e) {
			System.out.println("线程B在 catch 处打印了");
			e.printStackTrace();
		}
	}
}
