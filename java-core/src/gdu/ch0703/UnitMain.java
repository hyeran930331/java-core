package gdu.ch0703;

public class UnitMain {
	public static void main(String[] args) {
	Unit u = null;
	//u = new Unit(); 추상클래스 객체는 만들수 업삳
	
	//하지만
	
	knight knight = new knight();
	knight.move(); //다형성
	
	archer archer = new archer();
	archer.move(); //다형성
	
	Unit unit = new knight();
	//unit.move(); 추상메소드라 불가
	if(unit instanceof knight) {
		((knight)unit).attack();
	}
	
	}
}