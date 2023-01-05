package com.iu.s4.objects6;

public class Robot {
	//Robot은 armLeft와 armRight에 대해 의존적(Defendency)
	private ArmLeft armLeft;
	private ArmRight armRight = new ArmRight();
	//강한결합
	
	public Robot() {
		this.armRight = new ArmRight();
	}
	//Inject
	//의존성이 필요로 할때 주입해 주는 것
	
	//--> Defendency Injection : 의존성 주입
	
	
	public ArmLeft getArmLeft() {
		return armLeft;
	}
	public void setArmLeft(ArmLeft armLeft) {
		this.armLeft = armLeft;
	}
	public ArmRight getArmRight() {
		return armRight;
	}
	public void setArmRight(ArmRight armRight) {
		this.armRight = armRight;
	}
	
	public Robot(ArmRight armRight) {
		this.armRight = armRight;
		//setter와 동일
		//약한결합
	}
}
