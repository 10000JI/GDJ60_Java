package com.iu.s1.controls;

import java.util.Scanner;

public class Contorl1_ex1 {

	public static void main(String[] args) {
		//키보드로 부터 국어, 영어, 수학 점수를 입력 받음
		//총점과 평균을 계산
		
		//평균이 90점 이상이면 A를 출력
		//평균이 80점 이상이면 B를 출력
		//평균이 70점 이상이면 c를 출력
		//그 외 나머지는 F를 출력
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		double avg = 0.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요: ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		math = sc.nextInt();
		
		sum = kor+eng+math;
		avg = sum / 3.0;
		
		String level = "F";
		
		if(avg >= 90) {
			//System.out.println("A입니다.");
			level = "A";
		}
		if(avg >= 80 && avg <90) {
			//System.out.println("B입니다.");
			level = "B";
		}
		if(avg >= 70 && avg <80) {
			//System.out.println("C입니다.");
			level = "C";
		}
//		if(avg < 70) {
//			//System.out.println("F입니다.");
//			level = "F";
//		}
		
		//출력문은 딱 한번만 사용
		System.out.println(level);
	}
	
}
