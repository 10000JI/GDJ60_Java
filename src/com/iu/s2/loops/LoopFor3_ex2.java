package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex2 {
	public static void main(String[] args) {
		//배그
		//총알 30발 -> 1탄창
		//캐릭터당  -> 3탄창
		
		//1. 단발
		//2. 점사
		
		//1번이면 "탕!" 30번 반복 출력
		//2번이면 "타타탕!" 10번 반복 출력
		
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < 3; j++) {
			System.out.println("1. 단발");
			System.out.println("2. 점사");
			int num = sc.nextInt();
			
			int count=10;
			String sound = "타타탕!";
			// else에 2번이라고 치면, 선언부에 2번의 정보를 넣어줌으로서 코드 길이 줄일 수 있다.
			
			if (num == 1) {
				sound = "탕!"; 
				count = 30;
			} 
	
			for(int b=0;b<count;b++) {
				System.out.println(b+1+"번째 소리: "+sound);
			}
			//반복문 for문을 두번 쓰지말고 한번 쓰자
			
			System.out.println("탄창 하나 소비");
		} //바깥쪽 for문 끝
		System.out.println("탄창을 모두 소진하셨습니다.");
	}
}
