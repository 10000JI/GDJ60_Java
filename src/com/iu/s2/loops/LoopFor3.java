package com.iu.s2.loops;

public class LoopFor3 {

	public static void main(String[] args) {
		//구구단 3단
		//2*1=2		3*1=3
		//2*2=4		3*2=6
		//2*3=6		3*3=9
		//...		...
		//2*9=18	3*9=27
		
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i+"X"+j+"="+i*j);
			}
		}
		
//		for(int i=1;i<10;i++) {
//			System.out.println("3 * "+i+" = " +3*i);
//		}
		
	}

}
