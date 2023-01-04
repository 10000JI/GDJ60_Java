package com.iu.s4.objects4;

public final class God {
	private String name;
	
//	private static final String MY_NAME="";
//	//final(상수)이 붙은 변수는 대문자로 쓴다.
//	//static final -> 변수명이 대문자+기울어짐
//	//static -> 변수명이 기울어짐
	
	private static God god;
	
	private God() {
		this.name = "test";
	}
	
	public static God getInstance() {
		if(God.god == null) {
			God.god = new God();
		}
		return God.god;
		//싱글톤: 전세계 단 하나의 객체만 생성
	}
	//★getInstance()★: 객체를 만들어서 제공하는 메소드

	public final String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
