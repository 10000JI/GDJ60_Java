package com.iu.s4.objects3.p1;

public class Member {

	//비만관리 회원등록
	private String name;
	private int age;
	private double ki;
	private double muge;
	private boolean check;
	//필드는 private로 해당 클래스 내에서만 사용 가능하게 한다
	
	public Member() {}
	
	public Member(int age) {
		if(age>0 && age<200) {
			this.age = age;
		}
	}
	
	//setter 메소드
	//메소드명: set+변수명의 첫글자를 대문자로 바꾼거
	public void setAge(int age) {
		if(age>0 && age<200) {
			this.age = age;
		}
	}
	//하지만 메소드를 public으로 선언해 다른 클래스에서 객체 선언 후
	//해당 메소드 호출 시, 필드 사용이 가능하다.
	
	//getter 메소드
	//메소드명: get+변수명의 첫글자를 대문자로 바꾼거
	public int getAge() {
		return this.age;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getKi() {
		return ki;
	}

	public void setKi(double ki) {
		this.ki = ki;
	}

	public double getMuge() {
		return muge;
	}

	public void setMuge(double muge) {
		this.muge = muge;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	
	public void info() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
	}
}
