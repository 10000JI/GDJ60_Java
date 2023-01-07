package com.iu.s3.array;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		int [] ar= {5,1,4};
		//1. 데이터 추가
			//0번 인덱스에 추가
		//2. 데이터 삭제
			//0번 인덱스 삭제
		//3. 종료

		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while(check) {
			System.out.println("1.데이터추가 2.데이터삭제 3.종료");
			int num = sc.nextInt();		
			if(num==1) {
				System.out.print("추가할 숫자를 입력하시오: ");
				num = sc.nextInt();
				int [] copy = new int [ar.length+1];
				copy[0]=num;
				for(int i=0;i<ar.length;i++) {
					copy[i+1] = ar[i];
				}
				ar = copy;
			} else if(num==2) {
				int [] copy = new int[ar.length-1];
				for(int i=0;i<copy.length;i++) {
					copy[i]=ar[i+1];
				}
				ar=copy;
			} else if(num==3) {
				System.out.println("종료되었습니다.");
				break;
			}
			for(int i=0;i<ar.length;i++) {
				System.out.println(ar[i]);
			}
		}
	}
}
