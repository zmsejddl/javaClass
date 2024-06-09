package chapter21;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		Board dao = new Board();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
		class BoardDao{
			
		}
	}

}
