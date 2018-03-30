package chapter3.part3_1_12;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 管道流，用于在线程间直接传输数据
 * @author a_nuo
 *
 */
public class Run {

	public static void main(String[] args) {
		try {
			WriteData write = new WriteData();
			ReadData read =new ReadData();
			
			PipedOutputStream out = new PipedOutputStream();
			PipedInputStream input = new PipedInputStream();
			
			//产生通讯连接,效果相同
			//input.connect(out);
			out.connect(input);
			
			ThreadWrite threadWrite = new ThreadWrite(write, out);
			ThreadRead threadRead = new ThreadRead(read, input);
			
			threadRead.start();
			Thread.sleep(2000);
			threadWrite.start();
			
		} catch (IOException  e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
