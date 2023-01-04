package com.iu.s4.objects4;

public class Card {
	
	//Card
	private String shape;
	private int number;
	private String color;
	//DTO,VO
	
	//클래스변수
	public static int size = 10;
	//변수가 기울여져 있으면 그외지정자 static (이클립스 내)
	
	//instance 초기화블럭
	{}
	
	//static 초기화블럭
	static {
		Card.size = 50;
	}
	
	//클래스 메서드
	public static void staticMethod() {
		Card.size = 10;
		System.out.println("Static Method");
//		System.out.println(this.shape);
//		this.info();
//		//클래스 메서드 내에서 멤버변수, 멤버매서드 사용 불가
		Card card = new Card();
		card.info();
		//클래스 메서드 내에서 객체 생성은 가능
	}
	
	public void info() {
		System.out.println("Shape : "+this.shape);
		System.out.println("Color: "+this.color);
		System.out.println("Number: "+this.number);
		System.out.println("Size: "+Card.size);
		Card.staticMethod();
		//staic 변수는 객체 주소 필요 없으므로 this 안써도 된다
		//대신 "클래스명.변수" 로 써주자
	}
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
