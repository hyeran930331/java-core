package goodee.gdj;

public class Ex04 {
	public static void main(String[] args) { //공공연하게 static하고, void 로 실행한다 (안의 값을)
		int oneAge = 21;
		int twoAge = 27;	
		
		if ((oneAge <30) && (twoAge <30)) {
			System.out.println("출입");
		} else {
			System.out.println("출입금지");
		}
	}
}
