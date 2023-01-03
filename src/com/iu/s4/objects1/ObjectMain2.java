package com.iu.s4.objects1;

public class ObjectMain2 {

	public static void main(String[] args) {
		//Sword의 Instance 생성 
		int n =10;  //n은 지역변수
		Sword s1 = new Sword(); //s1은 참조변수면서 지역변수, 지역변수는 초기화해야 사용가능
		//객체 생성 시에 price,damage,level,life 멤버변수 만들어짐
		s1.name = "집행검"; //String은 참조타입
		s1.price = 50000; //멤버변수 = instance변수
		s1.damage = 50; //멤버변수 = instance변수
		s1.level = 3; //멤버변수 = instance변수
		s1.life = 500; //멤버변수 = instance변수
		 
		Knight knight = new Knight();
		knight.name = "물주먹";
		knight.hp = 100;
		knight.strength = 90;
		knight.dex = 80;
		knight.stamina = 70;
		knight.wiz = 10;
		
		//얕은복사 (주소 복사)
		knight.sword = s1; //sword는 멤버변수 = instance변수 , reference type 
		System.out.println(knight.sword.name);
		
		//변수 선언
//		Sword s2; //지역변수면서 참조타입변수
//		System.out.println(s2.damage); //지역변수를 초기화하지 않아 멤버변수 damage 사용 불가능
		
		Sword s2 = null; //지역변수의 객체 안만들고 
		System.out.println(s2.damage); //멤버변수 사용하면 NullPointException 발생
		
		
	}

}
