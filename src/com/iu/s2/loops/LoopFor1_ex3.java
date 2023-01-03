package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean check = false;
		
		//로그인 시도 중 5번 시도 가능
		
		//반복문 종료 후
		//로그인 성공했으면 "환영합니다" 메세지 출력
		// 로그인 실패시 "은행방문하세요" 메세지 출력
		for(int i=0; i<5; i++) {
			System.out.print("아이디입력:");
			int inputid = sc.nextInt();
			System.out.print("비밀번호입력:");
			int inputpw = sc.nextInt();
			System.out.println(i+1+"번째 카운트");
			if(id==inputid && pw ==inputpw) {
				System.out.println("로그인 성공.");
				check = true;
				i=10; // =break;
			} else {
				System.out.println("로그인 실패");
			}
		}
		
		if(check) {
			System.out.println("환영합니다.");
		}else {
			System.out.println("은행을 방문하세요.");
		}
		System.out.println("반복문 종료.");
	}
}
