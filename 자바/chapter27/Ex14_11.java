package chapter27;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
import java.util.function.*;
import static java.util.Comparator.*;

public class Ex14_11 {

	public static void main(String[] args) {

		Student3[] stuArr = {
				new Student3("나자바", true, 1, 1, 300),
				new Student3("김지미", false, 1, 1, 250),
				new Student3("김자바", true, 1, 1, 200),
				new Student3("이지미", false, 1, 2, 150),
				new Student3("남자바", true, 1, 2, 100),
				new Student3("안지미", false, 1, 2, 50),
				new Student3("황지미", false, 1, 3, 100),
				new Student3("강지미", false, 1, 3, 150),
				new Student3("이자바", true, 1, 3, 200),
		};
		
		System.out.printf("1. 단순그룹화(반별로 그룹화)%n");
		Map<Integer, List<Student3>> stuByBan = Stream.of(stuArr)
				.collect(Collectors.groupingBy(Student3::getBan));
		
		for(List<Student3> ban : stuByBan.values()) {
			for(Student3 s : ban) {
				System.out.println(s);
			}
		}
		
		
		System.out.println("%n2. 단순그룹화(성적별로 그룹화)%n");
		Map<Student3.Level, List<Student3>> stuByLevel = Stream.of(stuArr)
				.collect(Collectors.groupingBy(s -> {
					if(s.getScore() >= 200) {
						return Student3.Level.HIGH;
					}else if(s.getScore() >= 100) {
						return Student3.Level.MID;
					}else {
						return Student3.Level.LOW;
					}
				}));
		
		TreeSet<Student3.Level> keySet = new TreeSet<>(stuByLevel.keySet());
		
		for(Student3.Level key : keySet) {
			System.out.println("[" + key +"]");
			
			for(Student3 s : stuByLevel.get(key)) {
				System.out.println(s);
			}
			System.out.println();
		}
		
		System.out.printf("%n3. 단순그룹화 + 통계(성적별 학생수)%n");
		Map<Student3.Level, Long> stuCntByLevel = Stream.of(stuArr)
				.collect(groupingBy(s -> {
					if(s.getScore() >= 200) {
						return Student3.Level.HIGH;
					}else if(s.getScore() >= 100) {
						return Student3.Level.MID;
					}else {
						return Student3.Level.LOW;
					}
				}, counting()));
		
		for(Student3.Level key : stuCntByLevel.keySet()) {
			System.out.printf("[%s] - %d명, ", key, stuCntByLevel.get(key));
		}
		System.out.println();
		
		for(List<Student3> level: stuByLevel.values()) {
			System.out.println();
			for(Student3 s : level) {
				System.out.println(s);
			}
		}
		
		System.out.printf("%n4. 다중그룹화(학년별, 반별)");
		Map<Integer, Map<Integer, List<Student3>>> stuByHakAndBan = 
				Stream.of(stuArr)
				.collect(Collectors.groupingBy(Student3::getHak, Collectors.groupingBy(Student3::getBan)));
		
		for(Map<Integer, List<Student3>> hak : stuByHakAndBan.values()) {
			for(List<Student3> ban : hak.values()) {
				System.out.println();
				for(Student3 s : ban) {
					System.out.println(s);
				}
			}
		}
		
		System.out.printf("%n5. 다중그룹화 + 통계(학년별, 반별 1등)");
		Map<Integer, Map<Integer, Student3>> topStuByHakAndBan = 
				Stream.of(stuArr)
				.collect(Collectors.groupingBy(Student3::getHak, Collectors.groupingBy(Student3::getBan, collectingAndThen(maxBy(comparingInt(Student3::getScore)), Optional::get))));
		
		for(Map<Integer, Student3> ban : topStuByHakAndBan.values()) {
			for(Student3 s : ban.values()) {
				System.out.println(s);
			}
		}
		
		System.out.printf("%n6. 다중그룹화 + 통계(학년별, 반별 성적그룹)");
		Map<String, Set<Student3.Level>> stuByScoreGroup = Stream.of(stuArr)
				.collect(groupingBy(s -> s.getHak() + "-" + s.getBan(), mapping(s -> {
					if(s.getScore() >= 200) {
						return Student3.Level.HIGH;
					}else if(s.getScore() >= 100) {
						return Student3.Level.MID;
					}else {
						return Student3.Level.LOW;
					} 
				}, toSet())));
		
		Set<String> keySet2 = stuByScoreGroup.keySet();
		
		for(String key : keySet2) {
			System.out.println("[" + key + "]" + stuByScoreGroup.get(keySet2));
		}
		
		
		
	}

}
