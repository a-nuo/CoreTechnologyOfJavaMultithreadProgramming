package chapter4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	public Condition conditionA = lock.newCondition();
	public Condition conditionB = lock.newCondition();
	
	public void awaitA(){
		try{
			lock.lock();
			System.out.println("begin awaitA time " + System.currentTimeMillis());
			conditionA.await();
			System.out.println("end awaitA time "+ System.currentTimeMillis());
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	public void awaitB(){
		try{
			lock.lock();
			System.out.println("begin awaitB time"+System.currentTimeMillis());
			conditionB.await();
			System.out.println("end awaitB time"+System.currentTimeMillis());
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	public void signalAll_A(){
		try{
			lock.lock();
			System.out.println("signalAll_A time "+System.currentTimeMillis());
			conditionA.signalAll();
		}finally{
			lock.unlock();
		}
	}
	public void signalAll_B(){
		try{
			lock.lock();
			System.out.println("signalAll_B time "+System.currentTimeMillis());
			conditionB.signalAll();
		}finally{
			lock.unlock();
		}
	}
}
