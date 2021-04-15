
/*
 * 2.다음 코드의 실행결과 출력물이 다음과 같이
 * 나오도록 추석을 제거하고 for 제어문의 조건문을 완성하시오.
 * 
 * 출력 1 4 5 7 9
 */
package gdu.ch065.quiz;

public class Ex02 {
	/*숫자 배열 arNum을 만든다.*/
	static int[] arNum = {7, 9, 1, 4, 5};
	/* 실행되는 메소드 main은 리턴값이 없는void 정적매소드static이며 어디서든 참조public가능하다
	 * 
	 * out변수는 arNum배열의 길이보다 1작게 초기화한다; out이 0보다 작을때 까지 반복, 반복할때마다 out은 1씩 작아진다
	 * 반복되는 행동 {for문 }
	 */
	public static void main(String[] args) {
		int out, in;
		for (out=Ex02.arNum.length-1; out >0 ; out-=1) {
			System.out.println("\t arNum["+out+"] 비교저장");
		// 
		//	
		// in변수는 0으로 초기화하고, in이 out보다 작을까지 반복, 반복할때마다 in은 1씩 커진다
		// 반복되는 행동 { 만약if (Ex02.arNum[in]이  Ex02.arNum[in]보다 크다면)
		// Ex02.swap (in과 in+1)과 해라. }
		//
			for (in=0; in < out; in+=1 ) {
				if (Ex02.arNum[in] > Ex02.arNum[in+1]) {
					Ex02.swap(in, in+1);
				} 
			System.out.print("arNum["+in+"]과 arNum["+(in+1)+"] 비교결과-> ");
			Ex02.dispaly();
			System.out.println("");
			//한번으로 arNum[out]의 변수는 확정됨. 
			//그다음엔 arNum[out-1]의 자리를 확정할때까지 반복해야함.
			}
		}
		Ex02.dispaly();
	}
	
	
	/* Ex02.swap(1,2);
	 * 이렇게 사용되며, Ex02.arNum[1]번에 있는 값과 Ex02.arNum[2]에 있는 값을 바꿔서 저장한다.
	 * 
	 * swap은 리턴값이 없는void 정적매소드static. 입력값은 숫자 2개.
	 * 1번 temp에 Ex02.arNum[1]저장
	 * 2번 Ex02.arNum[1]에 Ex02.arNum[2]값 저장
	 * 3번 Ex02.arNum[2]에 temp에서 받은 값 저장
	 */
		static void swap(int one, int two) {
			int temp = Ex02.arNum[one];
			Ex02.arNum[one] = Ex02.arNum[two];
			Ex02.arNum[two] = temp;
		}
		/*
		 * Ex02.display();
		 * 이렇게 사용되며, Ex02.arNum[1]번에 있는 값과 Ex02.arNum[2]에 있는 값을 바꿔서 저장한다.
		 * 
		 * display은 리턴값이 없는void 정적매소드static. 입력값도 없다.
		 * index=0인 숫자변수를 만들어서, 그게 Ex02.arNum의 길이보다 작을때 까지반복, 반복될때마다 index를 늘인다.
		 * 반복되는 행동 { Ex02.arNum[index]를 출력한다. }
		 */
		static void dispaly() {
			for (int index = 0; index < Ex02.arNum.length; index++) {
				System.out.print(Ex02.arNum[index]);
			}
		}
}
