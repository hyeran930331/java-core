package goodee.gdj;

public class Ex09 {
	public static void main(String[] args) {
		//소수의 갯수
		boolean flag = true;
		
		//3~100까지
		int s = 3; 
		int num = 100;
		
		//약수 숫자세기
		int c = 0;
		
		for (int x=s; x<=num;x=x+1) {
			for (int y=2; y<=x; y=y+1) {
				System.out.printf("x = %s,",x);
				System.out.print("y = "+y);
				System.out.println("나누면 = "+x%y);
				
				if (x%y == 0) {//나누어 떨어지는 수가 있다면,
					flag = false;
					break;
				}
			}
			if (flag) {//앞에서 2~100까지 y가 변했는데도, flag가 false가 안되었다면,
				c= c+1; //이건 소수다 갯수세고,
				System.out.println("     소수 갯수 = "+c);
			}
			flag = true; // 마지막으로 다시 flag값 다시 주고,
			//처음 포함 x를 한개 더해보자, 100까지
		}
		
		System.out.printf("소수는 %s개 입니다.\n",c);
	}
}
