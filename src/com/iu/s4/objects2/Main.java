package com.iu.s4.objects2;

public class Main {

	public static void main(String[] args) {
		
		ReturnTest returnTest = new ReturnTest();
		returnTest.t1(); //리턴타입 void는 호출만 해라
		
		int num = returnTest.t2(); //void를 제외한 리턴타입은 변수에 대입
		System.out.println(num);
	
		int [] ar = returnTest.t3();
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
