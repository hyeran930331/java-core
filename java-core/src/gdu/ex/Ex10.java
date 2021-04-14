package gdu.ex;

public class Ex10 {
	public static void main(String[] args) {
		for (int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				if((i*j)<10){
					System.out.print(i+"*"+j+"=0"+(i*j)+"\t");
				}else {
					System.out.print(i+"*"+j+"="+(i*j)+"\t");
				}
			}
			System.out.print("\n");
		}
	}
}
