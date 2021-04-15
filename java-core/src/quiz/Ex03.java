/* 3. 다음 바자 코드 실행시 출력되는 결과는?*/
package gdu.ch065.quiz;

public class Ex03 {
	public static void main(String[] args) {//stack main, Ex03
		Ex03 t = new Ex03(); //stack Ex03 사라짐, t생김 (heap을 가르킴) //heap t번지수
		int a = 20; //stack a=2
		//int[] b = new int[] {}; 
		int b[] = {100, 200, 300}; //stack b[int 배열] //heap b번지수
		t.change(a,b); //.메소드 발동.map.stack.change (a = 20, b= b번지수) <heap> a+10, b[1]+10 //마치고 map 사라짐 
		//a = 20 b[] = 100,210,300
		t.display(a,b);//.메소드발동.map.stack.display (z = 20, b= b번지수)
		// "20/210"
		
		//배열은 heap의 번지수를 가짐. 값을 heap으로 넘겨준. 참조값을 가르킴
		//인수값은 stack에 값을 가짐. 하지만 메소드 설정후 그 stack의 map은 사라짐. 원래값으로 돌아옴.
	}
	
	/*
	 * 리턴값이 없는 메소드 change는 입력값 2개가 필요하다.
	 * 
	 *  초기화된 값은 입력받은 a값에 +10 하고, b[1]자리에 +10한다.
	 */
	void change(int a, int b[]) {
		a +=10;
		b[1] +=10;
	}
	
	/*
	 * 리턴값이 없는 메소드 display는 입력값 2개가 필요하다.
	 * 
	 * 출력한다 a/b[1]
	 */
	void display(int a, int b[]) {
		System.out.print(a+"/"+b[1]);
	}
}
