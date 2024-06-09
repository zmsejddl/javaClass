package chapter24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//11-13
public class StreamMapping {

	public static void main(String[] args) {

		//맵핑
		//맵핑이란? 집합(자료구조)들 간의 대응
		//스트림 맵핑이란 자료구조에서 요소들을 새로운 요소로 매칭시켜서 새로운 스트림을 생성
		List<String> sl = Arrays.asList("toy", "robot", "box");
		//맵핑 1 -> a, 2 -> b
		//문자열의 길이로 매칭시켜서 새로운 스트림을 생성
		//map()
		//매개변수에는 기존의 배열에서 순차적으로 대입
		//리턴문에서는 새로운 배열로 매칭 시킬 데이터
		sl.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
		System.out.println();
		Stream<Integer> si = sl.stream().map(s -> s.length());
		List<Integer> il = sl.stream().map(s -> s.length()).collect(Collectors.toList());
		for(int i : il) {
			System.out.println(i);
		}
		
		
		
		
		
		
	}

}
