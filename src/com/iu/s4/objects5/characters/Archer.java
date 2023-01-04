package com.iu.s4.objects5.characters;

public class Archer extends Character{

	private int dex;
	
	public Archer() {
		super(""); // 생략되어 있음
	}
	
	@Override
	public void attack() {
		System.out.println("활 공격");
	}
	
	public void move() {
		System.out.println("이동~");
	}
	
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	
}
