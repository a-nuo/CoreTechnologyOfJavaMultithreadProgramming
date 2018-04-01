package chapter3.part3_1_14.book;
/**
 * 创建20个线程，10个线程备份到A数据库，10个线程备份到B数据库，二者交叉执行
 * @author a_nuo
 *
 */
public class DBTools {
	volatile private boolean prevIsA = false;
	synchronized public void backupA(){
		try {
			while(prevIsA==true){
				wait();
			}
			for (int i = 0; i < 5; i++) {
				System.out.println("AAAAA");
			}
			prevIsA = true;
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	synchronized public void backupB(){
		try {
			while(prevIsA==false){
				wait();
			}
			for (int i = 0; i < 5; i++) {
				System.out.println("BBBBB");
			}
			prevIsA = false;
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
