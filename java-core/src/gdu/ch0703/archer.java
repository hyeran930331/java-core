package gdu.ch0703;

public class archer extends Unit{
	//Unit을 상속받은 궁수
	void attack() {
		//궁수만 갖고있는 공격 메소드
	}
	@Override
	void move() {
		System.out.println("걸어서 움직인다.");
	}
}
