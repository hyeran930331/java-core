package gdu.ch065;

public class AMain {
	public static void main(String[] args) {
		for (int i=0; i<100l i++) {
			System.out.println(A.arr2[i]);
		}
	}
	
	class A{
		static int x =7;
		static int[] arr = {1, 5, 10};
		static int[] arr2;
		static int[] ranNum; // 1~44
		
		static {
			//static 변수사용가능
			A.arr2 = new int[100];
			for (int i=0; i<100; i++) {
				A.arr2[i] = i +1;
			}
			A.ranNum = (int)(Math.random()*44)+1;
		}
		//block
	}
}
