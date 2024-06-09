package chapter11;
//6-21
//배열이나 예외처리가 필요한 초기화에서는 명시적 초기화만으로는 복잡한 초기화 작업이 힘들다
//생성자에서 추가적으로 초기화를 사용
public class Ex6_15 {
	private int[] arr = new int[10];
	
	public Ex6_15() {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public static void main(String[] args) {
		Ex6_15 ex6_15 = new Ex6_15();
		int[] arr1 = ex6_15.getArr();
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
