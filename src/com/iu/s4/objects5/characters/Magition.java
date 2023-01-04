package com.iu.s4.objects5.characters;

public abstract class Magition extends Character{
	//추상클래스는 상속하면 추상메소드를 오버라이딩 해야하지만(많든 적든), 
	//오버라이딩하기 싫다면 해당 클래스도 추상클래스로 만든다.(abstract)
	
	public Magition() {
		super("aaa");
		// TODO Auto-generated constructor stub
	}
	
	private int mp;
	
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public abstract void spell();
}
