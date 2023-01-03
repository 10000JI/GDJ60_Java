package com.iu.s4.objects2;

public class OverTest {
	//메소드 오버로딩
	//매개변수 두개를 받아서 +한 결과를 리턴
	//public void hap(int b, int a) //매개변수의 위치는 동일해야함
	
	public int hap(int a, int b) {
		return a+b;
	}
	
	public double hap(int a, double b) {
		return a+b;
	}
	
	public String hap(String a, int b) {
		return a+b;
	}
}
