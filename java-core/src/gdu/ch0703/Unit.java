package gdu.ch0703;

public abstract class Unit {
	//abstract 는 추상클래스로 만든다.
	// 추상클래스의 객체는 만들수없다.
	
	//왜 필요할까? (게임은 유닛객체는없다)
	//부모클래스역할을 하려고.
	abstract void move(); 
	//모든 유닛은 움직이는 메소드를 가진다
	//하지만 각각 move가 있다면 이건 추상메소드 = 추상클래스안에서.
	//구현부가 없다.
}
