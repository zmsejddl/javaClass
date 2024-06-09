package chapter05;
//4-4
public class ArrayCreate {

	public static void main(String[] args) {

		/*
		 * 배열
		 * 변수는 1개의 데이터만 저장
		 * 저장해야 할 데이터의 수가 많아지면
		 * 그만큼 많은 변수가 필요하고 코드도 매우 길어진다
		 * 많은 양의 데이터를 적은 코드로 손쉽게 처리할 수 있는
		 * 배열(array)이 있다
		 */
		
		/*
		 * 배열이란?
		 * 배열은 같은 타입의 데이터를 연속된 공간에 나열하고
		 * 각 데이터에 인덱스를 부여해놓은 자료구조이다
		 * 자바에서 배열의 특징
		 * 1.배열은 같은 타입의 데이터만 저장할 수 있다
		 * 2.한 번 생성된 배열은 길이를 늘리거나 줄일 수 없다
		 */
		
		/*
		 * 배열 선언
		 * 배열 변수 선언은 두가지 형식이 있다
		 * 1.타입[] 변수
		 * 2.타입 변수[]
		 */
		int[] intArray;
		double[] doubleArray;
		String[] strArray;
		
		int intArr[];
		double doubleArr[];
		String strArr[];
		
		String name1 = "신용권";
		String name2 = "홍길동";
		String name3 = "김자바";
		//배열 생성
		//1.값 목록으로 배열 생성
		String[] names = {"신용권", "홍길동", "김자바"};
		//읽어 오는 방법 (참조)
		//배열변수이름[인덱스값]
		//인덱스는 각 항목의 데이터를 읽거나 저장하는데 사용되며
		//배열 이름 옆에 대괄호[]에 기입하면 된다
		//인덱스는 저장한 순서대로 0부터 시작한다
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println();
		
		String fruits[] = {"바나나", "사과", "딸기"};
		//콘솔에 사과 딸기 바나나 순으로 출력
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[0]);
		fruits[0]="수박";//배열에 값 입력
		System.out.println(fruits[0]);
		System.out.println();
		
		int[] scores = {83, 90, 87};
		System.out.println("scores[0]: " + scores[0]);
		System.out.println("scores[1]: " + scores[1]);
		System.out.println("scores[2]: " + scores[2]);
		System.out.println();
		
		//모든 점수를 콘솔에 출력
		for(int i = 0; i<3; i++) {
			System.out.println(scores[i]);
		}
		System.out.println();
		//모든 점수의 합
		int sum = 0;
		for(int i = 0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합: "+sum);
		System.out.println();
		//int sum1 = scores[0] + scores[1] + scores[2];이것도 되긴 됨
		
		//평균 점수 구하기 - 총합/갯수
		double avg = sum/3.0;
		System.out.println("평균: " + avg);
		System.out.println();
		
		//한 번 생성된 배열의 길이를 늘리거나 줄일 수 없다
		String[] colors = {"검정색", "빨간색", "녹색", "파란색"};
		//colors 배열에서 사용할 수 있는 인덱스 값의 범위:0~3
		//System.out.println(colors[-1]);이거 안됨
		//colors[4] = "노란색";이것도 안됨
		for(int i = 0;i<4;i++) {//범위 설정을 잘 해야 됨
			System.out.println(colors[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
