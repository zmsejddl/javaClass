package chapter26;

import java.util.function.Function;

//11-24
//4.생성자에서 메소드 참조 사용 가능
public class StringMaker {

	public static void main(String[] args) {

		Function<char[], String> f = ar -> {
			return new String(ar);
		};
		//람다식 생략 가능한거 줄이기
		f = ar -> new String(ar);
		//메소드 참조를 사용하여 줄이기
		f = String :: new;
		char[] src = {'R', 'o', 'b', 'o', 't'};
		String str = f.apply(src);
		System.out.println(str);
		
		makeString(ar -> new String(ar));
		makeString(String :: new);
	}
	
	public static void makeString(Function<char[], String> f) {
		f = String :: new;
		char[] src = {'R', 'o', 'b', 'o', 't'};
		String str = f.apply(src);
		System.out.println(str);
	}

}
