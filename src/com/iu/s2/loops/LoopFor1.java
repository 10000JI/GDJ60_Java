package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1 {

	public static void main(String[] args) {
		System.out.println("Start");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반복문 횟수를 입력하세요");
		int count = sc.nextInt();
		
		for(int i=0;i<count;i++) {
			System.out.println("Hello World");
			System.out.println("Good Bye");
			System.out.println(i);
		}
		//조건식에 타입만 맞다면 변수가 와도, 상수가 와도 상관없다.
		
		System.out.println("Finish");
		
		
//		int i = 5;
//		
//		for(;i>0;i--) {
//			System.out.println("Hello World");
//			System.out.println("Good Bye");
//		}
//		//선언을 위에 하고 초기식을 생략해도 실행 가능

		
//		int i = 5;
//		
//		for(i=7;i>0;i--) {
//			System.out.println("Hello World");
//			System.out.println("Good Bye");
//		}
//		//다른 값으로 변경하여 대입해도 실행 가능
		
//		int i=0;
//		for(;i<5;i++) {
//			System.out.println("Hello World");
//			System.out.println("Good Bye");
//			System.out.println(i);
//		}
//		System.out.println(i);

	}

}
