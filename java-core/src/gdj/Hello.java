package goodee.gdj;
//소스 주석은 안넘어감
//public 사용허가와 관련된 키워드이고 "접근제한자"
public class Hello {
	// 클래스 풀네임 goodee.gdj.Hello
	//메소드는 기능의 이름 , 메소드는 리턴값을 남길수 있음
	
	//프로그램에서 제일 처음 실행되는 메서드는
	//클래스이름을 이용하여 호출이 가능해야하고
	//이름은 main 이어야한다.
	
	public static void main(String[] args){
		System.out.println("안녕하세요");
	}
	//main이라는 메소드는 문자열 배열을 받음 
	//void	
		//static이 없으면 Hello h = new Hello();
		//있으면 Hello.main(null);
	
}

