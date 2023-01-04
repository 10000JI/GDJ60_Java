package com.iu.s4.objects4;

public class CardMain {

	public static void main(String[] args) {
		
		//클래스명.변수명
		System.out.println(Card.size);
		Card.staticMethod();
		
		Card card = new Card();
		card.setShape("Heart");
		card.setColor("Red");
		card.setNumber(1);
		card.info();
		
		Card.size = 8;
		//static변수 size로 인해 모든 card의 사이즈가 8이 된다
	
		Card card2 = new Card();
		card2.setShape("Spade");
		card2.setColor("Black");
		card2.setNumber(12);
		card2.size = 9;
		card2.info();
	}

}
