package com.iu.s4.objects3.p1;

public class Secret {
	
	public int point =500; //접근지정자 public: 어디서든 사용가능
	public int money=1000000000; //접근지정자 default: 같은 패키지 내 사용가능
	
	public Secret() {
		
	}
	
	public void s1() {
		System.out.println("Secret의 s1 메소드 실행");
	}
	
	void s2() {
		System.out.println("Default");
	}
	
}
