package com.iu.s3.array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		int [] ar = new int[3];
		int [] ar2 = new int[0];
		
		//키보드로부터 숫자를 입력 받아서 해당 숫자만큼 배열 생성
		//배열에 들어갈 숫자 입력 후, 인덱스 별로 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num0 = sc.nextInt();
		int [] ar3 = new int[num0];
		for(int i=0;i<num0;i++) {
			System.out.print(i+1+" 번째 숫자를 입력: ");
			ar3[i] = sc.nextInt();
		}
		for(int i=0;i<ar3.length;i++) {
			System.out.println("ar3["+i+"]=의 값: "+ar3[i]);
		}
		
		System.out.println(ar[2]);
		
	}

}
