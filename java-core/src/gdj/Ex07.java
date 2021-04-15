package goodee.gdj;

public class Ex07 {
	public static void main(String[] args) {
		int c = 0;
		for (int i=2014; i <=2500; i=i+1) {
			if((i%400==0)||((i%4==0)&&(i%100!=0))) {
				System.out.println(i+"년");
				c = c+1;
			}
		}
		System.out.printf("2014~2500년 까지 윤년 : %s 개\n",c);
	}
}
