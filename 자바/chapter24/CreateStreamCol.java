package chapter24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//11-11
public class CreateStreamCol {

	public static void main(String[] args) {

		//배열도 배열 클래스가 존재
		//배열안에 약간의 메소드(기능)가 존재
		//배열 클래스안에 배열 or ArrayList을 만드는 메소드: asList(데이터 나열)
		List<String> list1 = new ArrayList<>();
		list1.add("toy");
		list1.add("robot");
		list1.add("box");
		List<String> list = Arrays.asList("toy", "robot", "box");
		//스트림 생성하기: 컬렉션 인스턴스
		//void accept(T t)
		list.stream().forEach(s -> System.out.println(s));
		
		
	}

}
