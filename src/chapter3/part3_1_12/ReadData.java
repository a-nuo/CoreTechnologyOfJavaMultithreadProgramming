package chapter3.part3_1_12;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * 读数据
 * @author a_nuo
 *
 */
public class ReadData {
	public void readMethod(PipedInputStream input){
		try {
			System.out.println("read :");
			byte[] byteArray = new byte[20];
			int readLength = input.read(byteArray);
			while(readLength!=-1){
				String newData = new String(byteArray,0,readLength);
				System.out.println("read "+newData+",");
				readLength = input.read(byteArray);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
