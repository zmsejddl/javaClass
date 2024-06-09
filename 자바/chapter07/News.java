package chapter07;
//5-3
public class News {
	String title;
	String content;
	//static을 붙이면 class안에서 메소드를 바로 사용할 수 있다: getNews(); 이런식으로
	//안 붙이면 인스턴스(객체)를 형성해서 사용해야 된다
	public void setNews(String sTitle, String sContent) {
		title = sTitle;
		content = sContent;
	}
	public void getNews() {
		System.out.println("뉴스 제목: ");
		System.out.println(title);
		System.out.println("뉴스 내용: ");
		System.out.println(content);
	}
	
	public static void main(String[] args) {
		//클래스는 인스턴스 생성해서 사용
		News news1 = new News();
		news1.setNews("30만원대 갤럭시 A15 LTE 출시", "삼성전가가 가성비를 중시하는 소비자들을 위해....");
		news1.getNews();
		
		News news2 = new News();
		news2.setNews("메타버스 AR클래스로 게임하고 원격회의까지", "메타버스가 진화하고 있다. 가상세계와 아바타 중심의....");
		news2.getNews();
	}

}
