package goodee.gdj;

public class Ex10 {
	public static void main(String[] args) {
		for (int i=1; i<=5; i=i+1){
			System.out.print(i);
			for (int j=2; i<=5; i=i+1) {
				System.out.print(i);
				if(i<j) {
					System.out.println("*");
				}
			}
		}
	}
}
