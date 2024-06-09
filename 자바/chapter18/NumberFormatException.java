package chapter18;
//8-22
public class NumberFormatException {
	
	public static void main(String[] args) {
		//명시적 형변환은 기본 데이터 타입만 적용 가능하다
		//문자열을 숫자로 변환할려면 Integer.parseInt(String s)
		String data1 = "100";
		String data2 = "a100";
		
		//숫자로 변환
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		System.out.println(value1);
		
	}

}
