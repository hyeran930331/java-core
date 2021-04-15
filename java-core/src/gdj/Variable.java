package goodee.gdj;

public class Variable {
	public static void main(String[] args) {
		int x; //변수선언
		x = 10; //값대입 초기화
		x = 5;
		
		int y = 7; //선언과 초기화를 동시에
		
		System.out.println(x);
			{
				System.out.println(y);
				//y의 유효범위
				int z = 777;
			}
		int i = 0;
		for (i =0; i<10; i=i+1) {
			System.out.println(i);
			}
		System.out.println(i);
		
		final int a = 11; //상수
		System.out.println(a);
		
		//변수의 자료형 (값 - 하나의 값 / 참조 형식 - 여러개의값
		//값 byre short int long floar double boolean char
		//배열 int[] char[]
		}
}