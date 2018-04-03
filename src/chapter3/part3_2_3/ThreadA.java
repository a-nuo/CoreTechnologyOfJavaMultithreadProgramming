package chapter3.part3_2_3;
/**
 * 打印随机数
 * @author a_nuo
 *
 */
public class ThreadA extends Thread {
	public ThreadA(){
		super("ThreadA");
	}
	@Override
	public void run() {
		System.out.println("sysout:"+Thread.currentThread().getName());
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String newString = new String();
			Math.random();
		}
	}
}
