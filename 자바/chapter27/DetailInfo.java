package chapter27;
//12-5

import java.util.Optional;

public class DetailInfo {

	//flatMap 메소드
	//중첩된 Optional
	Optional<String> passport;
	
	public DetailInfo(Optional<String> passport) {
		this.passport = passport;
	}

	public Optional<String> getPassport() {
		return passport;
	}

	public void setPassport(Optional<String> passport) {
		this.passport = passport;
	}

	public static void main(String[] args) {
		
		Optional<DetailInfo> di = Optional.of(new DetailInfo(Optional.ofNullable(null)));
		//flatMap Optional을 반환하는 내용물을 Optional로 감싸지 않고 그냥 반환
		//Map인 경우 중첩된 Optional을 두번 벗겨내야 하지만 flatMap은 한 번만 벗기면 된다
		String passprot = di.flatMap(p -> p.getPassport()).orElse("It's null");
		System.out.println(passprot);
		
		
	}

}
