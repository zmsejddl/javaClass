package chapter19;
//9-5
//String 클래스
//자바에서 문자열을 위한 클래스
//다른 언어에서는 문자열을 char형의 배열로 다룬다
public class StringClass {
	public static void main(String[] args) {
		int[] intArr1= {1,2,3};
		int[] intArr2 = intArr1;
		intArr2[0] = 42;
		for(int i =0; i < intArr1.length; i++) {
			System.out.println(intArr1[i]);
		}
		int num1 = 0;
		int num2 = num1;
		num2 = 42;
		System.out.println(num1);
		System.out.println(num2);
		
		//불변(immutable)의 특성
		//문자열(String)의 비교
		String str1 = "abc";//문자열 리터럴 "abc"의 주소가 str1에 저장된다
		String str2 = "abc";//문자열 리터럴 "abc"의 주소가 str2에 저장된다
		//등가비교연산자 == -> 클래스인 경우 주소값을 비교
		System.out.println("str == str2?" + (str1 == str2));
		
		String str3 = new String("abc");//새로운 String인스턴스 생성
		String str4 = new String("abc");//새로운 String인스턴스 생성
		System.out.println("str3 == str4?" + (str3 == str4));
		//대부분의 경우는 주소가 아닌 값을 비교한다
		//문자열의 비교는 항상 equals()사용해서 한다는 것을 주의한다
		System.out.println("str3 == str4?" + (str3.equals(str4)));
		
	}
}
