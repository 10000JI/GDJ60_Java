package com.iu.s4.objects1;

import java.util.Scanner;

import com.iu.s4.objects1.ex1.StudentView;

public class MethodMain1 {

	public static void main(String[] args) {
		System.out.println("Main Method 실행");
		MethodTest mt = new MethodTest();
		MethodTest3 mt3 = new MethodTest3();
		int salary = 3000000;
		double tax =0.95;
		//호출시 매개변수로 보내는 값: 인자값
		mt3.t3(salary,tax);
		System.out.println("main :"+salary);
		
		Sword sw = new Sword();
		sw.name = "집행검";
		sw.damage = 50;
		mt3.info(sw); //실제 값을 나타내는 주소를 풀력
		System.out.println(sw.name); //실제 값을 나타내는 주소를 풀력
	
		//메소드를 호출한다.
		//mt.t1();
		mt.t2();
		
		System.out.println("Main Method 종료");
		
	}

}
