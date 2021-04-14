package gdu.ch0703;

import java.util.Calendar;

public abstract class Meal { //추상
	public static Meal getInstance() { //static Mael을 instance형변환
		/*
		 *return new Breakfast(); //다형성 breakfast를 리턴하시오.
		 *	}
		 */
	
		Meal meal = null;
		Calendar c = Calendar.getInstance();
		int h = c.get(Calendar.HOUR_OF_DAY); // 0<= h < 24 
		if (h < 12) { //아침
			meal = new Breakfast(); //다형성 breakfast를 리턴하시오.
		} else if(h <18) { //점심
			meal = new Lunch(); //다형성 
		} else if(h <24) { //저녁
			meal = new Dinner(); //다형성
		}
		return meal;
	}
}
