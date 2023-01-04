package com.iu.s4.objects2;

public class Car {
	
	static String company="BMW";
	//변수가 기울여져 있으면 그외지정자 static (이클립스 내)
	String name;
	int price;
	String color;
	
	{
		//초기화 블럭 -> 공통적인 멤버변수를 초기화하고 싶을 때 자주 사용
		System.out.println("초기화 블럭: "+this.company);
		this.company="AUDI";
	}
	
	public Car() {
//		this("Black"); //this() : 생성자 내에서 다른 생성자를 호출할 때 사용, public Car(String color) 호출
		System.out.println("생성자: "+this.company);
		this.company="Kia";
		this.name="스포티지";
		this.price=3500;
		this.color="Black";
	}
	
	public Car(String color) { //public Car(String color,int price) 호출
		this(color,3500);
//		this.company="Kia";
//		this.name="스포티지";
//		this.price=3500;
//		this.color=color;
	}
	
	public Car(String color,int price){ //public Car(String color,int price,String name) 호출
		this(color,price,"Kia");
//		this.company="Kia";
//		this.name="스포티지";
//		this.price=price;
//		this.color=color;
	}
	
	public Car(String color,int price,String name) {
		this.company="Kia";
		this.color=color;
		this.name=name;
		this.price=price;
	}
	
	public void info() {
		System.out.println("Name: "+this.name);
		System.out.println("Company: "+this.company);
		System.out.println("Price: "+this.price);
		System.out.println("Color: "+this.color);

		
	}
}
