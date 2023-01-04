package com.iu.s4.objects5.characters;

public abstract class Character {
	
	private String name;
	private int hp;
	private int level;
	
	public Character(String name) {
		this.name = name;
	}
	
	public Character() {
		
	}
	//기본생성자는 항상 써주자
	
//	public abstract void attack();
//	//자식클래스에서는 오버라이딩 해야 함
//	//메소드가 abstract이면 클래스도 abstract 지정자 써준다.
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
}
