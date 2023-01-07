package com.iu.s2.loops;

import java.util.Random;
import java.util.Scanner;

public class LoopWhile1 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int num = rd.nextInt(15); //0~14
		
		while(check) {
			System.out.print("숫자를 입력하세요: ");
			int a = sc.nextInt();
			
			if(a==num) {
				System.out.println("번호가 일치합니다.");
				//check = false;
				//방법1
				
				break;
				//방법2
				
				//반복문 벗어나는 방법
				//1)check를 false로 바꾼다
				//2)반복문 사이에 break를 만났을 때
			} else {
				System.out.println("틀렸습니다.");
			}
		}
	}
}
