package com.iu.s4.objects1;

import java.rmi.StubNotFoundException;

public class ObjectsMain {

	public static void main(String[] args) {
		System.out.println("Start");
		//main은 프로그램을 실행 목적
		//Test 목적
		//main은 어느 클래스 안에 있던지 상관 X
		
		//학생 한명 생성
		//객체 생성
		//변수 선언과 거의 동일
		Student student = new Student();
		//primitive type이 아니다. 값이 하나가 할당되는 것이 아닌 student 구성을 해야되기 때문에 각각의 변수나 메소드에 값 할당.
		//따라서 reference type이다.
		student.name="test";
		student.num=20;
		System.out.println(student);
		System.out.println(student.name); //reference type의 기본 초기화는 null이다. null
		System.out.println(student.num);
		System.out.println(student.avg); //heap애 만들어지면(변수가 이미 만들어짐) 초기화가 자동으로 된다. 0.0
		
		//학생 객체 생성
		Student student2 = new Student();
		student2.name = "iu";
		student2.num = 30;
		int a = 20;
		int b = 10;
		
		a=b;
		
		System.out.println(student==student2);
		
		//★얕은복사 (주소복사)★ (s3.array에 Array3.java 참고)
		student = student2;
		System.out.println(student.name);
		student.name = "winter";
		System.out.println(student2.name);
		
		System.out.println("Finish");

	}

}
