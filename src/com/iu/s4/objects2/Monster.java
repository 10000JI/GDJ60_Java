package com.iu.s4.objects2;

public class Monster {
	
	//멤버변수, instance변수
	int power=100;
	int hp;
	
	//생성자 Constructor
	public Monster() {
		//매개변수가 없는 생성자를 기본생성자, default Constructor
		System.out.println("생성자 실행");
		this.power=50;
		this.hp=60;
	}
	
	//멤버메서드, instance method
	public boolean checkValue(Monster monster) {
		//나의 power와 몬스터의 power와 같고, 나의 hp와 몬스터의 hp와 같다면 true, 다르면 flase 리턴
		if(this.power == monster.power&& this.hp == monster.hp) {
			return true;
		} else {
			return false;
		}
	}
	
	public void info(int a) {
		
	}
	
	//공격	
	//어슬렁
	public void info() {
		System.out.println(this);
		//참조변수 this : class 내부에서만 사용 가능, 생성된 객체주소를 담음
		//해당 메소드는 그냥으로는 주소를 알 수 없기 때문에 this 사용
		System.out.println(this.power);
		//this는 생략 가능 
		System.out.println(hp);
		attack();
		
	}
	
	public void attack() {
		System.out.println("공격합니다.");
		//this.info();
	}
	
	public void setHp(int hp) {
		this.hp = hp; //멤버변수 hp와 매개변수 hp를 구분하기 위해 해당 클래스를 나타내는 this를 사용하여 멤버변수임을 명시
	}
	
}
