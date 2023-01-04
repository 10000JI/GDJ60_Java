package com.iu.s4.objects4;

public class GodMain {

	public static void main(String[] args) {
//		God god1 = new God();
		God god = God.getInstance();
		god.setName("유일신");
		System.out.println("God: "+god);
		System.out.println("Name: "+god.getName());
		
		//singleTon = 싱글톤: 디자인 패턴 
		//전세계 객체를 딱 하나 만드는 것
		god = God.getInstance();
		System.out.println("God: "+god);
		//또 다른 객체 생성 
		System.out.println("Name: "+god.getName());
		//똑같은 객체의 주소와 이름 출력
	}

}
