package com.iu.s4.objects1;

public class MethodTest {
	//메소드 선언 공식
	//public static void main(String[] args){}
	//접근지정자 [그외지정자] 리턴타입 메소드명([매개변수들] 선언){}
	//[대괄호 안에 있는 것]: 옵션. 꼭 필요한거 X
	
	//접근지정자: public
	//그외지정자: 생략
	//리턴타입 : void
	//메서드명 : 작명
	//매개변수 : 생략
	public void t1() { //메서드의 header, 선언부
		//{} 메서드의 body, 내용
		//제어문, 반복문, 등
		System.out.println("t1 메서드 실행 시작");
		MethodTest2 mt2 = new MethodTest2();
		int num = 10;
		System.out.println("T1 Num:"+num);
		mt2.infor();
		System.out.println("t1 메서드 종료");
	}
	
	//t2 메소드 선언
	public void t2() {
		System.out.println("t2 메소드 실행 시작");
		int num = 20;
		System.out.println("T1 Num:"+num);
		System.out.println("t2 메소드 종료");
	}
}
