package com.iu.s1.controls;

import java.util.Random;
import java.util.Scanner;

public class Control3_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		//Game: TRPG
		//법사
		String name = "핫팩";
		int hp = 20;
		int mp = 20;
		
		String monsterName = "오크";
		int monsterHp = 10;
		
		System.out.println("1. HP 보충");
		System.out.println("2. MP 보충");
		System.out.println("3. 마법1 사용");
		System.out.println("4. 마법2 사용");
		System.out.println("5. 턴 종료");
		int select = sc.nextInt();
		if(select == 1) {
			int h = rd.nextInt(41);
			hp = hp + h; //ex1>20+10 => 30(o)ex2>20+30 =>50(x) 
			if(hp>40) {
				hp=40;
			}
			System.out.println(hp);
		}else if(select == 2) {
			int m = rd.nextInt(41);
			mp = mp + m;
			if(mp>40) {
				mp=40;
			}
		}else if(select == 3) {
			System.out.print("주문을 입력하시오: ");
			String a = sc.next();
			if(a.equals("얍!")) {
				int monsterH = rd.nextInt(6);
				monsterHp = monsterHp - monsterH;
				System.out.println(name+"은 "+monsterName+"에게 "+monsterH+"데미지를 주었다.");
				mp = mp - 3;
			}
			else {
				System.out.println("주문이 잘못 되었습니다.");
			}
			//주문을 외우기
			//유저의 MP가 3씩 감소
			//0~5 이하의 수치를 공격
		}else if(select == 4) {
			System.out.print("주문을 입력하시오: ");
			String a = sc.next();
			if(a.equals("이얍!")) {
				int monsterH = rd.nextInt(11);
				monsterHp = monsterHp - monsterH;
				System.out.println(name+"은 "+monsterName+"에게 "+monsterH+"데미지를 주었다.");
				mp = mp - 5;
			}
			else {
				System.out.println("주문이 잘못 되었습니다.");
			}
			//주문을 외우기
			//유저의 MP가 5씩 감소
			//0~10 이하의 수치를 공격
		}else  {
			System.out.println("턴을 넘깁니다.");
		}
		
		//1. HP보충(포션) 2.MP(보충) 3.마법1 4.마법2 5.턴을 넘기기
		//HP 보충 시 최대 40이 끝
		//보충 시 랜덤하게 0~40 사이의 숫자를 받아서 HP에 더하기
		
		System.out.println(name+"의 hp: "+hp);
		System.out.println(name+"의 mp: "+mp);
		System.out.println("몬스터의 hp: "+monsterHp);
	
	}
}
