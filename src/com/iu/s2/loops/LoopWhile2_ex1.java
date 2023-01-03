package com.iu.s2.loops;

import java.util.Scanner;

public class LoopWhile2_ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// MMORPG 게임
		//1. 로그인
		//2. 로그인 한 사용자만 게임 가능
		
		//--------------- 로그인 파트 ----------------
		//1. 로그인	2. 종료
		//1: id, pw 입력 후 로그인 판단
		//2: 종료
		boolean check = true;
		int id = 1234;
		int pw = 5678;
		
		while(check) {
			System.out.println("1. 로그인	2. 종료");
			int select = sc.nextInt();
			if(select==1) {
				System.out.println("ID 입력");
				int yId = sc.nextInt();
				System.out.println("PW 입력");
				int yPw = sc.nextInt();
				
				if(id==yId && pw==yPw) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("로그인 실패");
				}
			}else {
				System.out.println("종료합니다.");
				check=!check; // check=false;
			}
		}
		
		System.out.println("Check: "+check);
		
		//-------------- 게임 진행 파트 ----------------
		//1. 로그인 성공 했을 때 진행
		//레벨은 1로 시작
		//GOLD는 0
		//5렙 달성 시 1000GOLD 지급
		//10렙 달성 시 2000GOLD 지급
		//15렙 달성 시 3000GOLD 지급
		//각각 메세지도 출력
		//모든 몬스터의 경험치는 동일
		//1 -> 2 : 3마리
		//2 -> 3 : 6마리
		//3 -> 4 : 9마리
		//4 -> 5 : 12마리
		//...
		//14 -> 15 : 42마리
		//만랩달성 축하, 현재 GOLD 출력
		//잡을 때마다 몬스터 사냥 성공 메세지 출력 (3마리면 3번, 6마리면 6번)
		//레벨 업 성공 시에 축하 메세지 출력
		
		if(check) {
			
			int level = 1;
			int gold = 0;
			for(;level<15;level++) {
				System.out.println("현재레벨: "+level);
				
				if(level%5==0) {
					System.out.println(level + " 랩 달성 축하금");
					gold = gold +level/5*1000;
				}
				
//				if(level==5) {
//					System.out.println("5렙 달성 축하금");
//					gold = gold+1000;
//				}
//				
//				if(level==10) {
//					System.out.println("10렙 달성 축하금");
//					gold = gold +2000;
//				}//패턴이 보인다
				
				for(int m=0;m<level*3;m++) {
					System.out.println(m+1+" 번째 사냥 성공");
				}//안족 for문
				System.out.println("축 레벨업");
			}//바깥쪽 for문
			System.out.println(level+" 랩 달성 축하");
			gold = gold+level/5*1000; //15랩일때 골드 3000 지급
			System.out.println("GOLD:"+gold);
		}
	}
}		

//ex2>
//		Scanner sc = new Scanner(System.in);
//		boolean check = false;
//		int id = 1234;
//		int pw = 5678;
//		int inputid = 0;
//		int inputpw =0;
//		while (true) {
//			System.out.println("1.로그인 2.종료");
//			int login = sc.nextInt();
//			if (login == 1) {
//				System.out.print("아이디: ");
//				inputid = sc.nextInt();
//				System.out.print("비밀번호: ");
//				inputpw = sc.nextInt();
//				if (id == inputid && pw == inputpw) {
//					System.out.println("로그인 성공");
//					check = true;
//					break;
//				} else {
//					System.out.println("로그인 실패");
//					continue;
//				}
//			} else {
//				System.out.println("종료");
//				break;
//			}
//		}
//		
//		while(check) {
//			int gold=0;
//			int level=0;
//			int monster=0;
//			for(level=0;level<15;level++) {
//				for (monster = 0; monster < 3*level; monster++) {
//					System.out.print("몬스터를 잡으려면 0을 누르시오: ");
//					int set = sc.nextInt();
//					System.out.println("몬스터를 잡았다!");
//				}
//					System.out.println(monster+"마리 몬스터를 잡았다!");
//					System.out.println(level+1+"레벨");
//				if((level+1)%5==0) {
//					gold=gold+level/5*1000;
//					System.out.println(level+1+"렙 달성, "+gold+"GOLD 지급");					
//				}
//			}
//			System.out.println(level+"만랩 달성을 축하합니다! 현재 "+gold+"GOLD");
//			check=false;
//		}
		
		//for문안에 for문 (level로)