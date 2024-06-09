package chapter21;

import java.util.ArrayList;
import java.util.List;

//10-3
public class ArrayListCollections {

	
	public static void main(String[] args) {
		//<제네릭>
		//<> - 이 괄호 안에 저장하고 싶은 클래스 타입을 넣는다
		//길이가 가변적이다
		//List 컬렉션을 구현하는 클래스
		//ArrayList, LinkedList
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<>();
		List<String> sList = new ArrayList<>();
		
		//객체를 저장 - add()
		sList.add("java");
		sList.add("adf");
		sList.add("ert");
		sList.add("euic");
		for(String str:sList) {
			System.out.println(str);
		}
		System.out.println();
		
		//저장된 총 객체수 얻기 - size()
		System.out.println(sList.size());
		System.out.println();
		
		//인덱스를 이용한 객체 얻기 - get()
		System.out.println(sList.get(0));
		System.out.println(sList.get(2));
		for(int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		System.out.println();
		
		//인덱스를 이용하여 객체 삭제 - remove()
		sList.remove(1);//adf 삭제
		for(String str : sList) {
			System.out.println(str);
		}
		System.out.println();
		
		ArrayList<Integer> list3 = new ArrayList<>();
		int num1 = 42;
		list3.add(num1);
		int num2 = list3.get(0);
		for(int i : list3) {
			System.out.println(i);
		}

	}
	
}
