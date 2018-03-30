package chapter3.part3_1_12;

import java.io.IOException;
import java.io.PipedOutputStream;
/**
 * 写数据
 * @author a_nuo
 *
 */
public class WriteData {
	public void writeMethod(PipedOutputStream out){
		try {
			System.out.println("write :");
			for(int i=0; i<300; i++){
				String outData = ""+(i+1);
				out.write(outData.getBytes());
				System.out.println("write "+outData+",");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
