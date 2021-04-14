package gdu.ch1001;

public class ExceptionMain {
	public static void main(String[] args) {
		/*nullpointer Exception*/
			//A a =null;
			//a.test();
		
		/*outOfBounds Exception*/
			//int[] arr = new int[3];
			//for(int i=0; i<4; i++) {
			//	arr[i] = 1;
			//	//arr[3]이 없어서. 
			//	//i<arr.length 를 많이씀
			//}
		
		/*nemberFormat*/
			//String s = "goodee";
			//int x = Integer.parseInt(s);
			//System.out.println(x);
			
		/*classCasting*/
			//Object o = 10;
			//Integer x = 10;//참조형 x를 새로만들어서 10을 넣은것.
			//o = x;
			
			//if(o instanceof A) {
			//	A a = (A)o; //강제로 형 변환
				
			//} else {
			//	System.out.println("else");
			//}
			
		/*trycath */
		//	int[] arr = new int[4];
		//	for(int i=0; i<4; i++) {
		//		try {
		//			arr[i]= 10;
		//		} catch(Exception e) {
		//			e.printStackTrace();
		//			System.out.println("예외발생");
		//		}
		//	}
		
		/*trycath */
			try {
				Class.forName("a.b.c"); //실행시점에 a.b.c를 갖고있어야함 = new a.b.c();\
				} catch(Exception e) { //예외를 찾았다면
					e.printStackTrace();
					System.out.println("예외발생");
				}
			}
	}
}

class A {
	public void test() {
		
	}
}
