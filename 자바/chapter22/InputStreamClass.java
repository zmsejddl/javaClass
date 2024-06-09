package chapter22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//10-9
public class InputStreamClass {

	public static void main(String[] args) {
		//바이트 입력 스트림: InputStream
		//기본 타입 byte와 다른 의미
		//byte 8bit단위로 입출력하는 스트림
		try {
			InputStream is = new FileInputStream("test1.dat");
			while(true) {
				int data;
				try {
					data = is.read();
					if(data == -1) break;
					System.out.println(data);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	
}
