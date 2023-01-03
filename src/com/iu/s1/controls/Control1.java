package com.iu.s1.controls;

public class Control1 {

	public static void main(String[] args) {
		//단일 if
		//if(조건식){ 조건식 true일 때 실행 }
		//졸업시험, 무조건 졸업, 평균이 90점 이상이면 우등상 수상
		System.out.println("프로그램 시작");
		double avg = 80; // >,<... //지역변수
		boolean check = true; //지역변수 (main내에서 한정)
		int don = 0; //지역변수
		
		if(avg>=90) { //check==true 안써도 된다. (위에 정의함)
			System.out.println("우등상 수상");
			System.out.println("졸업을 축하 합니다.");	
			don = 100000000;
			System.out.println("장학금: "+don);
			System.out.println(check);
		} //if의 끝
		
		System.out.println("장학금:"+don);
		System.out.println("졸업을 축하 합니다.");	
		System.out.println("프로그램 종료");
		
	}// main의 끝

}
