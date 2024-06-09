package chapter02;

//7번째

public class UseVariable3 {

	public static void main(String[] args) {
		
		/*
		 * 정사각형의 둘레를 구하는 코드 작성
		 * 한변: 마음대로 정하기
		 */
		int squareSide;
		squareSide = 9064768;
		System.out.println(4*squareSide);
		
		/*
		 * 1.직사각형의 넓이를 구하는 코드를 작성
		 * 2.직사각형의 둘레를 구하는 코드를 작성
		 * 3.반지름을 이용하여 원의 둘레를 구하는 코드를 작성
		 * 4.삼각형의 넓이를 구하는 코드 작성
		 * 5.삼각형의 길이를 구하는 코드 작성
		 * 6.정사각형의 넓이를 구하는 코드 작성
		 * 7.정오각형의 둘레를 구하는 코드 작성
		 * 8.정칠각형의 둘레를 구하는 코드 작성
		 * 9.정팔각형의 둘레를 구하는 코드 작성
		 * 10.오늘 지급받은 3권의 교재의 총 페이지수를 구하는 코드 작성
		 */
		//1번
		int rectangleSide1=7;
		int rectangleSide2=9;
		//2번
		System.out.println(rectangleSide1 * rectangleSide2);
		System.out.println(2 * (rectangleSide1 + rectangleSide2));
		//3번
		double radius = 7.0;
		System.out.println(2 * 3.14 * radius);
		//4번
		double triangleBase = 9.0;
		double triangleHeight = 7.0;
		System.out.println(triangleBase * triangleHeight / 2);
		//5번
		int triangleSide1 = 9;
		int triangleSide2 = 8;
		int triangleSide3 = 7;
		System.out.println(triangleSide1 + triangleSide2 + triangleSide3);
		//6번
		int squareSide2 = 9;
		System.out.println(squareSide2 * squareSide2);
		//7번
		int regularAngle = 6;
		System.out.println(regularAngle * 5);
		//8번
		int politicalPolygon = 8;
		System.out.println(politicalPolygon * 7);
		//9번
		int regularOctagon = 9;
		System.out.println(regularOctagon * 8);
		//10번
		int textBook1 = 70;
		int textBook2 = 74;
		int textBook3 = 83;
		System.out.println(textBook1 + textBook2 + textBook3);
		
		
		
		
		
		
	}

}
