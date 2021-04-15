package gdu.ch065.quiz;

public class Ex06 {
	public static void main(String[] args) {
		final int SUN = 1;
		final int MON = 2;
		final int TUE = 3;
		final int WED = 4;
		final int THU = 5;
		final int FRI = 6;
		final int SAT = 7;
		int start = 1;
		int end = 30;
		
		int startWeek = THU;
		
		System.out.println("2021.04");
		System.out.println("SU MO TU WE TH FR SA");
		/*
		 * i를 1로 초기화하고; i가 sartweek보다 작거나 같을때까지 반복; 반복할때마다 i를 1씩 더한다.
		 */
		for (int i=1; i<startWeek; i++) {
			//지금 tue가 3이니깐 3번방복
			System.out.print("   ");
			//3번째까지 빈칸을 남겨둠
		}
		/*
		 * i를 satar1, n을 satartWeek3으로 초기화하고; 
		 * n이 sartWeek랑 같을때까지 반복; 반복할때마다 i과n을 1씩 더한다.
		 */
		for (int i=start, n=startWeek; i<=end; i++,n++) {
			if(i<10) {
				System.out.print(" 0"+i);
			} else {
				System.out.print(" "+i);
			}
			//만약 10보다 낮으면 01 02 .... 09 쭉~출력.
			// 11~30출력.
			
			if (n%7==0) System.out.println();
			//만약 7일째면 다음줄로.
		}
	}
}
