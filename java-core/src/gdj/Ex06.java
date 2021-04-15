package goodee.gdj;

public class Ex06 {
	public static void main(String[] args) {
		int num = 0;
		for (int i =1; i <10; i=i+1) {
			if (i%2 != 0 ) {//이 아니면 1이고, 그럼 홀수
				num = num +i;
			}
		}
		System.out.println("10까지 홀수의 합 : "+num);
	}
}
