package chapter22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//10-10
public class CharacterConvertStreamExample {

	public static void main(String[] args) {
		//문자 변환 보조 스트림
		try {
			FileOutputStream fos = new FileOutputStream("text1.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//try catch with resources 문법
		//이 문법을 사용하면 자동으로 스트림을 닫아 준다
		try(FileOutputStream fos = new FileOutputStream("text1.txt")){
			//파일로 문자를 저장하고, 저장된 문자를 다시 읽기 위해서 
			//문자 변환 보조 스트림(Writer, Reader)을 조합한다
			Writer writer = new OutputStreamWriter(fos);
			writer.write("hello world");
			writer.flush();
			System.out.println("문자를 파일로 출력 완료");
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("text1.txt")){
			Reader reader = new InputStreamReader(fis);
			char[] buffer = new char[100];
			int readCharNum = reader.read(buffer);
			//char 배열에서 읽은 수만큼 문자열로 변환
			String data = new String(buffer, 0, readCharNum);
			System.out.println(data);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
}
