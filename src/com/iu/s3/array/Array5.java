package com.iu.s3.array;

public class Array5 {

	public static void main(String[] args) {
		//같은 배열변수로 배열 크기 줄이기 (뒷부분이 잘림)
		//ar1을 반복문 돌렸을 때, 1 2 만 나오게
		int [] ar1 = {1,2,3};
		int [] copy = new int[ar1.length-1];
		
		for(int i=0;i<copy.length;i++) {
			copy[i]=ar1[i];
		}
		
		ar1=copy;
		
		for(int i=0;i<ar1.length;i++) {
			System.out.println(ar1[i]);
		}
	}

}
