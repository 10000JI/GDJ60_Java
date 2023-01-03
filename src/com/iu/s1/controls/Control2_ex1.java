package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		//회원가입 할 때 입력한 ID, PW
		int id = 1234;
		int pw = 5678;
		
		//키보드로부터 id,pw를 입력 받아서 로그인 처리
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요: ");
		int inputId = sc.nextInt();
		System.out.print("비밀번호를 입력하세요: ");
		int inputPw = sc.nextInt();
		
		if(id == inputId && pw == inputPw) {
			System.out.println("로그인 성공입니다.");
		} else {
			System.out.println("로그인 실패입니다.");
		}
	}

}
