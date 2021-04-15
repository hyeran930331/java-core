/* 3. 다음 바자 코드 실행시 출력되는 결과는?*/
package gdu.ch065.quiz;

public class Ex03_1 {
    public static void main(String[] args) {
    	Ex03_1 ex = new Ex03_1();
    	int x = 1;
    	int y = 10;
    	ex.swap(x, y);
    	
    	IntClass a = new IntClass(2);
    	IntClass b = new IntClass(20);
    	ex.swap(a, b);
    	
    	System.out.printf("x: %d, y: %d\n", x, y);
    	System.out.printf("a.num: %d, b.num: %d\n", a.num, b.num);
    }
    
    // 값타입 swap(int, int)
    void swap(int x, int y) {
    	int temp = x;
    	x = y;
    	y = temp;
    }
    
    // swap(IntClass, IntClass) 오버로딩
    // 참조타입 swap
    void swap(IntClass a, IntClass b) {
    	int temp = a.num;
    	a.num = b.num;
    	b.num = temp;
    }
}
class IntClass {
	int num;
	IntClass(int num) {
		this.num = num;
	}
}