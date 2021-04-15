package gdu.ch065.quiz;

import java.util.*;

public class ex07 {
	public static void main(String[] args) {
		String[] arr= { "1", "2", "9", "7", "4", "6", "1", "7", "0"};
		Set<String> set = new HashSet<>();
		/*
		 * HashSet은 객체를 저장하기 전에 먼저 객체의 hashCode()메소드를 호출해서 
		 * 해시 코드를 얻어낸 다음 저장되어 있는 객체들의 해시 코드와 비교한 뒤 같은 
		 * 해시 코드가 있다면 다시 equals() 메소드로 두 객체를 비교해서
		 *  true가 나오면 동일한 객체로 판단하고 중복 저장을 하지 않습니다. 
		 */
		for (String s : arr) {
			set.add(s);
			// arr[0] = 1
			// arr[1] = 2
			// arr[2] = 9
			// arr[3] = 7
			// arr[4] = 4
			// arr[5] = 6
			// arr[6] = 0
		}
		List<String> list = new ArrayList<>(set);
		/*
		 * [Java] 오름차순 정렬, 내림차순 정렬 Arrays.sort(), Collections.sort  
		 */
		Collections.sort(list);
		// arr[0] = 0
		// arr[1] = 1
		// arr[2] = 2
		// arr[3] = 4
		// arr[4] = 5
		// arr[5] = 7
		// arr[6] = 9
		
		for(String s : list) {
			System.out.println(s);
		}
	}
}
