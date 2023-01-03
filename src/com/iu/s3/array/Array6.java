package com.iu.s3.array;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		int [] ar = {8,5,13,9,6};
		int [] copy = new int[ar.length-1];
		int idx = 0;
 		//키보드로부터 삭제하고 싶은 값을 입력 받기
		//배열에서 키보드에서 입력한 값 삭제됨
	
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 숫자 입력: ");
		int key = sc.nextInt();
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==key) {
				continue; //입력한 값이 같으면 밑에 대입연산을 하지말고, 위로 올라가 대입을 생략한다.
			}
			copy[idx]=ar[i];
			idx++;
		}
		ar=copy;
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
	
		}
	}

}
