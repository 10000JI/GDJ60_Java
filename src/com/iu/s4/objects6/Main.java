package com.iu.s4.objects6;

public class Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Robot robot = new Robot(); 
		ArmLeft armLeft = new ArmLeft();
		robot.setArmLeft(armLeft);
		
		System.out.println(robot.getArmLeft());
		//약한연결 -> 메인클래스에서 armLeft 객체 생성 후 robot에 set으로 연결
		System.out.println("Right: "+robot.getArmRight());
		//강한연결 -> robot 객체 생성하면서 생성자 안에 있던 armRight
		
		robot = null;
		//객체를 소멸시키는 과정
		
		System.out.println("Add Robot에서 작업");
		robot = new Robot();
		System.out.println(robot);
		
		System.out.println("프로그램 종료");
	}

}
