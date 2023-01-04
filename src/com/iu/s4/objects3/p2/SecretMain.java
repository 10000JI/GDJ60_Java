package com.iu.s4.objects3.p2;

import com.iu.s4.objects3.p1.Secret;

public class SecretMain {

	public static void main(String[] args) {
		
		Secret secret = new Secret();
		//같은 패키지 내에 클래스가 존재하지 않아 import 해줬다.
		com.iu.s4.objects3.p2.Secret secret2 = new com.iu.s4.objects3.p2.Secret();

		
//		com.iu.s4.objects3.p1.Secret secret = new com.iu.s4.objects3.p1.Secret(); 
//		//import 안쓰면 클래스의 파일 위치(패키지)를 상세히 적어줘야됨
		
		secret.money =1;
		
		secret.s1();
		//secret.s2();
		
		//System.out.println(secret.money);
		System.out.println(secret.point);
		//Test test = new Test();
		//System.out.println(test.point);
	}

}
