package com.iu.s4.objects2;

public class MonsterMain {

	public static void main(String[] args) {
		Monster mon1 = new Monster();
		mon1.power = 10;
		mon1.hp = 100;
		Monster mon2 = new Monster();
		mon2.power = 10;
		mon2.hp = 100;
		
//		System.out.println(mon1 == mon2); //주소값 비교
		
		boolean result = mon2.checkValue(mon1);
		System.out.println("Result: "+result);
		
		if(mon1.checkValue(mon2)) {
			System.out.println("동일합니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
//		System.out.println(mon1); //주소값
//		mon1.info(); //this를 프린트
//		System.out.println(mon2); //주소값
//		mon2.info();
	}

}
