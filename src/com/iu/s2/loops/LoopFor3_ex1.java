package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//분과 초를 입력받아서
		//해당 분 초가 되면 반복문을 종료
		//20초가 되면 종료
		System.out.print("분을 입력하시오: ");
		int bun = sc.nextInt();
		System.out.print("초를 입력하세요: ");
		int cho = sc.nextInt();
		
		boolean check = false;
		
		for(int b=0 ;b<60;b++) {
			for(int s=0 ;s<60;s++) {
				System.out.println(b+" 분"+s+" 초");
				if(b == bun && s == cho ) {
//ex1>
//					b=60; //바깥쪽 for문 종료
//					break; //안쪽 for문 종료
//ex2>
					check = true; //바깥쪽 for문 종료
					break; //안쪽 for문 종료
				}
			}//안쪽 for 끝
			if(check) {
				break;
			}
		} //바깥 for 끝
		
		System.out.println(bun+" 분"+cho+" 초");
	}
}
