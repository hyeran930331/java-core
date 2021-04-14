package gdu.ch0703;

public class knight extends Unit{
	//Unit을 상속받은 기사
	void attack() {
		//기사만 갖고있는 공격 메소드
	}
	@Override
	void move() {
		System.out.println("말타고 움직인다.");
	}
}
