package chapter21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//10-5
//Collections 인터페이스
//상속하는 인터페이스: List, Set, Map
//Set 컬렉션
//저장 순서가 유지되지 않는다
//객체를 중복해서 저장할 수 없고, 하나의 null만 저장할 수 있다
//수학의 집합과 비슷하다
public class HashSetClass {

	public static void main(String[] args) {
		//HashSet
		//Set인터페이스를 구현한 클래스
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<>();
		
		//객체를 중복 없이 저장한다
		//저장 - add()
		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("jwaqes");
		set.add("zxasfa");
		set.add("java");
		set.add("ja4fi3");
		//반복문을 이용할 때는 Iterator, for each문만 사용할 수 있다
		//Iterator 반복자
		//전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자라고 한다
		//next()메소드는 하나의 객체를 가져올 때 사용할 수 있다
		//hasNext()메소드는 가져올 객체가 있으면 true를 리턴
		//더 이상 가져올 객체가 없으면 false를 리턴한다
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println();
		
		//저장된 요소 수 - size()
		System.out.println(set.size());
		System.out.println();
		
		//삭제 - remove(E element)
		set.remove("jwaqes");
		set.remove("zxasfa");
		Iterator<String> itr1 = set.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println();
		
		List<Person> pList = new ArrayList<Person>();
		pList.add(new Person("Jung Young Hun1"));
		pList.add(new Person("Jung Young Hun2"));
		pList.add(new Person("Jung Young Hun3"));
		Iterator<Person> pItr = pList.iterator();
		while(pItr.hasNext()) {
			System.out.println(pItr.next());
		}
		
		//clear() - 모든 요소를 제거하고 비우는 메소드
		set.clear();
		System.out.println(set);
		//isEmpty() - 컬렉션에 요소가 없는지 검증
		System.out.println(set.isEmpty());
		if(set.isEmpty()) {
			System.out.println("set이 비어있다");
		}
		
	}
	
	
}
