package chapter21;

import java.util.List;

public class Board {

	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	
	public Board() {
	}


	public String getTitle() {
		return title;
	}

	

	public String getContent() {
		return content;
	}


	public List<Board> getBoardList(String title, String content) {
		return Board;
	}

	
	

	
	
	
	
}
