package com.iu.s3.array;

public class Array8 {

	public static void main(String[] args) {
		int[] ar = {5,9,8,3,6};
		//9,8,6,5,3 => 내림차순
		//3,5,6,8,9 => 오름차순
		//0 : 1,2,3,4 인덱스 비교 95836
		//1 : 2,3,4   인덱스 비교 98536
		//2 : 3,4	  인덱스 비교 98635
		//3 : 4		  인덱스 비교 95653
		//이중for문
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]<ar[j]) {
					int copy = ar[i];
					ar[i]=ar[j];
					ar[j]=copy;
				}
			}
		}
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
