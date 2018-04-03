package chapter3.part3_2_3;
/**
 * join 遇到 interrupt方法会出现异常
 * @author a_nuo
 *
 */
public class Run232 {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(900);
		ThreadC c = new ThreadC(b);
		c.start();
		System.out.println("main end");
	}

}
