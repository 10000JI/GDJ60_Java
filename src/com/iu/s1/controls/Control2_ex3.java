package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex3 {
	public static void main(String[] args) {
		//회원가입 할 때 입력한 ID, PW
		int id = 1234;
		int pw = 5678; 
		
		int regular = 1;
		int non_regular = 2;
		
		//키보드로부터 id,pw를 입력 받아서 로그인 처리
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요: ");
		int inputId = sc.nextInt();
		System.out.print("비밀번호를 입력하세요: ");
		int inputPw = sc.nextInt();
		
		//로그인이 성공 했을 때만 실행
		//급여를 입력
		//정규직이면 1을 입력, 계약직이면 2를 입력
		//실급여 계산
		//정규직: 고용보험 2%, 의료보험 3%, 국민연금 1%, 산재보험 1%
		//계약직: 원천징수 3.3%
		//실금여 출력
		
		boolean check = false; //false : 로그인 X | true : 로그인 O
		if(id==inputId&&pw==inputPw) {
			System.out.println("로그인 성공입니다.");
			check = true;
		} else {
			System.out.println("로그인 실패입니다.");
			check = false;
		}
		if (check) {
			System.out.print("급여입력: ");
			int salary = sc.nextInt();
			System.out.println("1. 정규직	2. 계약직");
			int select = sc.nextInt();
			if(select ==1) {
				System.out.println("정규직 선택");
				int tax = 0;
//				//고용보험
//				int tax1 = (int)(salary*0.02);
				tax = tax+(int)(salary*0.02); //누적함수
//				//의료보험
//				int tax2 = (int)(salary*0.03);
				tax = tax+(int)(salary*0.03);
//				//산재보험
//				int tax3 = (int)(salary*0.01);
				tax = tax+(int)(salary*0.01);
//				//국민연금
//				int tax4 = (int)(salary*0.01);
				tax = tax+(int)(salary*0.01);
				salary = salary - tax;
			}else {
				System.out.println("계약직 선택");
				salary = (int)(salary*0.97);
			}
			System.out.println("실급여: "+salary);
		}else { 
			System.out.println("로그인 한 사용자만 가능");
		}
	}
}	
