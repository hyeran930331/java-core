/*
 * 1. 프로젝트 폴더에 goodee.txt파일 생성 후 실행
 *       www.gdu.co.kr
 * 실행하면 w()w()g()u()c().()r이 출력되는데 
 *       ()w().()d().()o()k() while을 앞에 넣으면
 * 파일내용과 같게 출력 되도록 코드를 수정하시오.
 */

package gdu.ch065.quiz;

import java.io.*; 

public class Ex01 {
	public static void main(String[] Args) throws Exception {
		// FileInputStream 파일의 위치를 찾는 메소드다.
		
		String fileName = "goodee.txt";
		FileInputStream fis = null;
		fis = new FileInputStream(fileName);
		//FileInputStream fis = new FileInputStream("goodee.txt"); // 위에것을 한줄로
		
		 do
		  { System.out.print((char)fis.read());}
		 while (fis.read() != -1);
		 /* 
		 * 
		 * 하나씩 건너뛰게 된 원인은?
		 * 위 System.out한 fis.read()와
		 * 아래 While안에 검사한 fis.read()가 달라서!
		 */
		 System.out.println("");
		
		 //검사값을 저장해줄 변수가 필요!
		int temp = -1; // -1은 의미없는 초기화
		FileInputStream fis2 = new FileInputStream("goodee.txt"); //위에것을 한줄로
		while((temp=fis2.read())!= -1){
		/*
		 * The java.io.FileInputStream클래스 안에 read()메소드는 
		 * reads a byte of data 데이터의 바이트를 읽는다. 기계어로
		 */
		/*
		 * read() methods returns 이 메소드는 값을 반환한다.
		 * -1 if the end of the file is reached. 파일의 끝에 다달하면 -1을
		 */
		System.out.print((char)temp);
		//temp는 숫자로 된 기계어로 그걸 (char)의 형태로 바꾼다.
		}
	}
}
