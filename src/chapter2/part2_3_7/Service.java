package chapter2.part2_3_7;
/**
 * 同步synchronized 不仅可以解决一个线程看到的对象处于不一致的状态，
 * 还可以保证进入同步方法或者同步代码块的每一个线程，都看到由同一个锁保护之前所有的修改效果
 * @author a_nuo
 *
 */
public class Service {
	private boolean isContinueRun = true;
	public void runMethod(){
		String anyString = new String();
		while(isContinueRun){
			//使线程工作内存中的私有变量与公共内存中的变量同步的功能
			//开启线程部分线程正常停止，否则死循环
//			synchronized(anyString){
//				
//			}
		}
		System.out.println("停下来");
	}
	public void stopMethod(){
		isContinueRun = false;
	}
}
