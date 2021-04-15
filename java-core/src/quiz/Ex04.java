package gdu.ch065.quiz;

public class Ex04 {
	public static void main(String[] args) {
		//???? 다중배열
		int ar[][] = new int[3][];
	
		int value = 0;
		/*ar[out]의 길이를 지정한것이다.*/
		ar[0] = new int[2]; // 얘네는 갯수구나.
		ar[1] = new int[3];
		ar[2] = new int[4];
		/*
		 * out이라는 변수를 0으로 초기화하고; out변수가 ar.length보다 작거나 같을때까지 반복한다; 반복할때마다 out의 값은 1씩 늘어난다.
		 * 반복되는 행동 {아래 for문}
		 */
		for (int out = 0; out < ar.length; out++) {
			/*
			 * in이라는 변수를 0으로 초기화하고; out변수가 ar[out].length보다 작거나 같을때까지 반복한다; 반복할때마다 in의 값은 1씩 늘어난다.
			 * 반복되는 행동 {ar[out][in]에 값을 넣는다.}
			 */
			for (int in = 0; in < ar[out].length; in++) {
				ar[out][in]= ++value; //++0 은 0 아닌가. 아니라 1개씩 인가봄
			}
		}
		
		/*fo문이 끝난줄 알았지만 아니다*/
		
		/*
		 * out이라는 변수를 0으로 초기화하고; out변수가 ar.length보다 작거나 같을때까지 반복한다; 반복할때마다 out의 값은 1씩 늘어난다.
		 * 반복되는 행동 {아래 for문}
		 */
		for (int out = 0; out < ar.length; out++) {
			/*
			 * in이라는 변수를 0으로 초기화하고; out변수가 ar.length보다 작거나 같을때까지 반복한다; 반복할때마다 out의 값은 1씩 늘어난다.
			 * 반복되는 행동 {ar[out][in]에 값을 넣는다.}
			 */
			for (int in = 0; in < ar[out].length; in++) {
				System.out.println("ar["+out+"]["+in+"]"+ar[out][in]);
			}
		}
		
		// ar[0][0], ar[0][1]
		// ar[1][0], ar[1][1], ar[1][2]
		// ar[2][0], ar[2][1], ar[2][2], ar[2][3]
		
		
	}
}
