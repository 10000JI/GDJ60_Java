package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학생 수를 입력 받고
		//학생 수 만큼 점수를 입력 받아서
		//총합계 출력
				
//		 System.out.print("학생 수를 입력하세요: "); 
//		 int student = sc.nextInt(); 
//		 int sum = 0;
//		 for(int i=0;i<student;i++) { 
//			 System.out.print("점수를 입력하세요: "); 
//			 int score =sc.nextInt(); 
//			 sum = sum+score; 
//		 } 
//		 System.out.println("총합계: "+sum);
		
		System.out.println("초를 입력하세요"); //5
		int second = sc.nextInt();
		for(int i=0;i<60;i++) {
			System.out.println(i+"초");
			if(second == i) {
				i=59; // =break;
			}
		}
		System.out.println("종료");
	}

}
