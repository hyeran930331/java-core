package gdu.ch065.quiz;

public class Ex05 {
	public int result = 0;
	static boolean flag = false;
	
	public static void main(String[] args) {
		Ex05.setResult(10);
		Ex05.display();
	}
	
	public static void setResult(int x) {
		Ex05.flag = Ex05.method1(x) || Ex05.method2();
	}
	
	public static boolean method1(int x) {
		boolean temp = false;
		if (x >0) {
			Ex05.result= x; // static 필드에 public이 안되나?
			temp = true;
		}
		return temp;
	}
	
	public static boolean method2() {
		Ex05.result= Ex05.result*10;
		return true;
	}
	
	public static void display() {
		System.out.print(Ex05.result+" ");
		System.out.println(Ex05.flag);
	}
}
