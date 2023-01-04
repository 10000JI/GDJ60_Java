package com.iu.s4.objects5.characters;

public class Main {

	public static void main(String[] args) {
//		Magition magition = new Magition();
//		magition.getMp();
//		magition.setMp(0);	
//		magition.setHp(0);
//		magition.setName(null);
//		//추상클래스는 객체생성 불가능
		
		Archer archer = new Archer();
		
		Character character = null;
		
		character = archer;
		//Archer 타입은 Character 타입이다. 
		
//		archer = character;
//		//모든 Character가 Archer가 아니다.
		
		archer = (Archer)character;
		//강제타입 형변환 해주면 가능하다 
		//캐릭터 중 아처인 애들만
		
		
		archer.attack();
		
		
		
//		archer.setDex(0);
//		archer.setLevel(3);
		
//		magition.attack();
//		archer.attack();
		
//		Character character = new Character("");
//		//추상 클래스는 객체 생성 불가능
	}

}
