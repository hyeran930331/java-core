package goodee.gdj;

public class Ex08 {
	public static void main(String[] args) {
		int num = 30;
		//소수면 "소수" / 아니면 "소수아님"
		int c = 0;
		
		for (int i=2; i<num;i=i+1) {
			//System.out.print(i+"/"+num+" : ");
			//System.out.println(num%i);
			if (num%i == 0) {//나누어 떨어지는 수가 있다면,
				c= c +1;
				//System.out.println("약수 : "+i);
			}
		}
		
		if (c == 0) {
			System.out.println("소수");
		}else {
			System.out.print("소수아님");
			System.out.printf("(약수 갯수 : %s)",c);
		}
	}
}
