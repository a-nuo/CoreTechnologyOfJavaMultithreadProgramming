package chapter3.part3_1_14.my;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 创建20个线程，10个线程备份到A数据库，10个线程备份到B数据库，二者交叉执行
 * @author a_nuo
 *
 */
public class DBTools {
	 Lock lock = new ReentrantLock();
	 Condition isA = lock.newCondition();
	 volatile private static boolean prevIsa = false; 
	 public void backupA(){
		try {
			lock.lock();
			while(prevIsa==true){
				isA.await();
			}
			for (int i = 0; i < 5; i++) {
				System.out.println("AAAAA");
			}
			prevIsa=true;
			isA.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	 public void backupB(){
		try {
			lock.lock();
			while(prevIsa==false){
				isA.await();
			}
			for (int i = 0; i < 5; i++) {
				System.out.println("BBBBB");
			}
			prevIsa=false;
			isA.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
}
