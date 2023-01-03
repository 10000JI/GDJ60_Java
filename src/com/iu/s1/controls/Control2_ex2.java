package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex2 {

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
		
		//평균이 60점 이상인가?
		//과목당 40점 미만이면 불합격
		//합격 불합격 출력

//ex1>		
//		System.out.println("펻균이 60점 이상인가?");
//		if(avg >= 60) {
//			System.out.println("60점 이상입니다.");
//		} else {
//			System.out.println("60점 미만입니다.");
//		}
//		
//		System.out.println("과목당 40점 미만입니까?");
//		if(kor < 40) {
//			System.out.println("국어가 40점 미만이므로 불합격입니다.");
//		} else {
//			System.out.println("국어는 40점 이상입니다.");
//		}
//		
//		if(eng < 40) {
//			System.out.println("영어가 40점 미만이므로 불합격입니다.");
//		} else {
//			System.out.println("영어는 40점 이상입니다.");
//		}
//		
//		if(math < 40) {
//			System.out.println("수학이 40점 미만이므로 불합격입니다.");
//		} else {
//			System.out.println("수학은 40점 이상입니다.");
//		}
//		
//		if(kor > 40 && eng > 40 && math > 40 && avg > 60) {
//			System.out.println("합격입니다.");
//		} else {
//			System.out.println("불합격입니다.");
//		}

//ex2>		
//		if(avg >= 60) {
//			if(kor>=40&&eng>=40&&math>=40) {
//				System.out.println("합격");
//			} else {
//				System.out.println("불합격");
//			}
//		}else {
//			System.out.println("불합격");
//			
//		}
		
//ex3>		
		boolean flag = false;
		if(avg>=60) {
			flag = true;
			if(kor<40 || eng<40 || math<40 ) {
				flag = false;
			} 
		}

		if(flag) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}

}
