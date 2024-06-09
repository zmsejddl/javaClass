package chapter02;
//9번째
public class IntroduceMyself {

	public static void main(String[] args) {

		/*
		 * 자기 소개 및 좋아하는 것 5개를 다양한 변수 선언을 통해
		 * 콘솔에 출력하세요
		 * 목적: 변수를 선언하고 사용
		 * boolean, int, double, String
		 * 
		 * 자기 소개
		 * String name;
		 * double tall;
		 * int age;
		 * System.out.println(); 
		 */
		String name = "정영훈";
		double tall = 173.3;
		int age = 24;
		String school = "부산대학교";
		//println(개행 enter)
		//print(개행이 없음)
		
		System.out.println("저의 이름은 " + name +" 입니다");
		System.out.println("저의 키는 " + tall + " 입니다");
		System.out.println("저의 나이는 " + age + " 입니다");
		System.out.println("현재 " + school + "을 휴학중입니다");
		
		//좋아하는 것 5개
		//취미, ...
		String hobby1 = "사이클링";
		int distance = 5;
		String hobby2 = "포켓몬";
		int type = 5;
		String hobby3 = "넷플릭스";
		String aniname = "주술회전";
		int totalChapter = 48;
		String hobby4 = "독서";
		double time = 30.0;
		String hobby5 = "뉴스 시청";
		int when = 7;
		String cook1 = "김치찌개";
		String material1 = "김치";
		String material2 = "두부";
		String material3 = "다진마늘";
		String material4 = "참기름", material5 = "맛술";
		String material6 = "돼지고기", material7 = "땡초";
		String material8 = "간장", material9 = "물엿", material10="고춧가루";
		int cookTime1 = 15;
		double mass1 = 1.0;
		double mass2 = 0.5;
		double mass3 = 3.0;
		double mass4 = 200.0;
		double mass5 = 1;
		String bug = "벌레"; 
		int divide = 3;
		boolean kill = true;
		String monster1 = "주리비안";
		String monster2 = "뚜꾸리";
		String monster3 = "수댕이";
		double power = 3.5;
		String clothes = "스웨터";
		String soup1 = "부대찌개";
		String soup2 = "존슨탕";
		String animal1 = "고라니";
		String animal2 = "쥐";
		String food = "치즈";
		String man = "나폴레옹";
		int tall1 = 167;
		String person = "평균 사람";
		int tall2 = 163;
		int year = 4000;
		String animal3 = "코끼리";
		String name2 = "세종대왕";
		String memo = "메모장";
		String key = "F5";
		String event = "차 사고";
		String sport = "스키";
		String area = "강릉";
		String idea1 = "no.의 약자는 Numero라는 라틴어이다";
		String idea2 = "사막에서 죽는 이유 중, 가장 높은 원인은 익사다";
		String idea3 = "알로에의 꽃말은 건강, 만능, 미신이다";
		String idea4 = "콜라는 원래 소화제였다";
		String idea5 = "코카콜라는 미국 본사에서만 생산된다";
		String idea6 = "욕은 고통을 완화시켜주는 작용을 한다";
		String idea7 = "잠이 안 올때 양을 세는 것은 sleep와 sheep이란 말이 숨소리에 가깝기 때문이다";
		String idea8 = "인간에게 가장 가까운 동물은 고릴라이다";
		String idea9 = "몽크의 절규는 그냥 귀를 막고 있는 것이다";
		String idea10 = "이슬람의 가르침 눈에는 눈, 이에는 이 그리고 다음에는 용서해 주는 게 가장 좋다라고 쓰여 있다";
		String idea11 = "소의 위나 내장에는 강력한 자석이 있다";
		String idea12 = "만화 포켓몬스터에서 로켓단이 나오지 않는 화는 1화뿐이다";
		String idea13 = "상어는 뒤로 수영을 할 수 없다";
		String idea14 = "낙타의 오줌은 끈적거리며, 바다의 염도보다 2배나 짜다";
		
		System.out.println("제 취미는 " + hobby1 + "입니다");
		System.out.println("보통 " + distance + "km 정도를 탑니다");
		System.out.println("제가 좋아하는 것은 " + hobby2 + "입니다");
		System.out.println("그 중에서도 " + type + "세대를 좋아합니다");
		System.out.println(type + "세대의 스타팅 포켓몬으로는 "+monster1+", "+monster2+", "+monster3+"가 있습니다");
		System.out.println(hobby3 + "에서 " + aniname + "을 최근에 봤습니다. 현재 " + totalChapter + "화까지 나왔습니다");
		System.out.println("자기 전 " + time + "분 정도는 "+hobby4 + "를 합니다" );
		System.out.println("밥 먹을 때면 세상 돌아가는 것을 알기 위해 " + hobby5 +"을 합니다");
		System.out.println("주로 " + when + "시에 봅니다");
		System.out.println("제가 좋아하는 음식인 " + cook1+"의 조리방법을 설명해보겠습니다");
		System.out.println(cook1 +"의 조리방법을 설명해보겠습니다");
		System.out.println("재료로는 " + material1+", "+material2+", "+material3+", "+material4+", "+material5+", "+material6+", " +material7+", "+ material8+", "+ material9+", "+material10+"가 있으면 됩니다");
		System.out.println("먼저 팬에 "+material1+"와 "+material3+material4+material5+material6+"을 넣고 볶아줍니다");
		System.out.println(material6 +"가 익기 시작했으면 물"+mass4+"g을 부어줍니다");
		System.out.println("물이 끓기 시작하면 "+material7+" "+mass5+"개을 넣어준 뒤 "+ material8+", "+material9+", "+ material10+"을 넣고 "+cookTime1+"동안 끓여줍니다");
		System.out.println(bug +"를 "+divide+"등분 하면 죽일 수 있을까요? "+kill);
		System.out.println("겨울철 "+clothes+"를 입을 때 느끼는 정전기는 "+power+"만 볼트이다");
		System.out.println(soup1+"의 미국 이름은 "+soup2+"이다");
		System.out.println(animal1 + "는 한국에서만 산다");
		System.out.println(animal2+"는 "+food+"를 좋아하지 않는다");
		System.out.println(man+"의 키는 "+tall1+"이다");
		System.out.println(person+"의 키는 "+ tall2+"이였다");
		System.out.println(year+"년 동안 새로 가축이 된 동물은 없다");
		System.out.println(animal3 + "는 점프할 수 없다");
		System.out.println(name2+"이 죽은 이유는 성병이다");
		System.out.println(memo+"에서 "+key+"를 누르면 시간이 표시된다");
		System.out.println("최근에 "+area+"으로 "+sport+"타러 갔다가 "+event+"를 당했습니다");
		
		
		
		
	}

}
