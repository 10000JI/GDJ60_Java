package com.iu.s3.array;

public class Array3 {
	public static void main(String[] args) {
		//변수에는 같은 데이터타입만 대입 가능
		
		int num=1; //primitive type, 원시타입, 지역변수
		String name = "iu"; //reference type, 참조타입, 지역변수
		int [] ar1 = {1,2,3}; //reference type, 참조타입
		int [] ar2 = {5,6,7,8};
		//배열은 한번 만들어진 크기는 줄이거나 늘릴수가 없다.
		
//		ar1 = num; //ar1은 int배열 타입이고, num은 int 타입이라 값을 넣을 수 없다.
		
		//★얕은복사★->주소를 복사
		ar1=ar2;
		
		System.out.println(ar1.length);
		System.out.println(ar2.length);
		
		System.out.println("================");
		for(int i=0;i<ar1.length;i++) {
			System.out.println(ar1[i]);
		}
		System.out.println("================");
		for(int i=0;i<ar2.length;i++) {
			System.out.println(ar2[i]);
		}
	}
}
