package com.iu.s2.loops;

public class LoopFor1_ex1 {

	public static void main(String[] args) {
		//0부터 100 미만 사이의 짝수만 출력
		int i =0;
		for(; i<100 ;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("=======================");
		
		//짝수 출력 if문 없이 출력
		for(int j=0;j<100 ;j=j+2) {
			System.out.println(j);
		}
		System.out.println("=======================");
		
		//0~100미만의 합계를 구하세요
		//1+2+...+99
		int l = 0;
		for(int k=0;k<100;k++) {
			l = l+k;
		}
		System.out.println(l);
	}
}
