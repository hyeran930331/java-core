package gdu.ch063;

import java.util.*;

public class BoardMain {
	public static void main(String[] args) {

	ArrayList<Board> board = new ArrayList<Board>();

	board.add(new Board("제목1","내용1"));
	board.add(new Board("제목2","내용2", "작가2"));
	board.add(new Board("제목3","내용3", "작가3", "210401-3"));
	board.add(new Board("제목4","내용4", "작가4", "210401-4", 4));

	for(Board b : board) { //for문을 통한 전체출력
	    System.out.println(b);
	}
	
	}
}
