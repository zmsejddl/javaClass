package review;

import java.util.ArrayList;
import java.util.Random;

public class LottoController {

	//18-8
	//랜덤으로 로또 번호 생성	
	private LottoDto lottoDto = new LottoDto();
	
	public void getLottoNums() {
		Random random = new Random();
		ArrayList<Integer> lottoDtos = lottoDto.getLottoNums();
		for(int i = 0; i < 6; i++) {
			lottoDtos.add(random.nextInt(45)+1);
		}
	}
	
	
	//로또 번호 한세트 출력 메소드
	public void printLottoNums() {
		for(int num : lottoDto.getLottoNums()) {
			System.out.println(num + " ");
		}
		System.out.println();
	}
	
	
}
