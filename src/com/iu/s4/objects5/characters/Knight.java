package com.iu.s4.objects5.characters;

public class Knight extends Character implements AttactAble{
	int strong;
	
	Item item = new Staff();
	//인터페이스도 데이터타입 (상속처럼)
	
	@Override
	public void attack() {
		item.a();
		
	}
}
