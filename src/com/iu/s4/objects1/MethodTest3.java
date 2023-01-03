package com.iu.s4.objects1;

public class MethodTest3 {
	public void t3(int salary, double tax) {
		//실급여를 계산하는 메소드
		salary = (int)(salary*tax);
		System.out.println("T3: "+salary);
	}
	
	public void info(Sword sw) {
		//Sword 모든 정보를 출력
		System.out.println(sw.name);
		System.out.println(sw.damage);
		sw.name = "단도";
	}
}
