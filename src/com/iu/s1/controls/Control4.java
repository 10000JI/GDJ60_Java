package com.iu.s1.controls;

public class Control4 {

	public static void main(String[] args) {
		//다중 선택
		//switch case
		int num = 1;
		String select = "3";
		System.out.println("1. 햄버거");
		System.out.println("2. 샌드위치");
		System.out.println("3. 샐러드");
		
		switch(select) {
		case "1":
			System.out.println("1번 선택");

		case "2":
			System.out.println("2번 선택");
			break;
			
		case "3":
			System.out.println("3번 선택");
			break;
		
		default:
			System.out.println("그외 나머지");
			
		
		}
	}

}
