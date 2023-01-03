package com.iu.s3.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		//1. 학생수 입력
		//2. 학생수 만큼 이름을 입력, iu, winter
		//3. 학생수 만큼 학생의 번호, 국어, 영어 수학 입력
		//	iu 학생의 번호:
		//	iu 학생의 국어:
		//	iu 학생의 영어:
		//	iu 학생의 수학:
		//	총점 평균 계산
		
		//모든 학생의 정보 출력
		//이름 번호 국어 영어 수학 총점 평균
		//iu  1  53 63 52
//ex1>
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요: ");
		int count = sc.nextInt();
		String [] names = new String[count];
		int [] nums = new int[names.length];
		int [] kors = new int[names.length];
		int [] engs = new int[names.length];
		int [] maths = new int[names.length];
		int [] totals = new int[names.length];
		double [] avgs = new double[names.length];
		
		for(int i=0;i<names.length;i++) {
			System.out.print(i+1+" 번째 학생 수를 입력하세요:");
			names[i] = sc.next();			
		}
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+" 의 번호 입력");
			nums[i] = sc.nextInt();
			System.out.println(names[i]+" 의 국어 입력");
			kors[i] = sc.nextInt();
			System.out.println(names[i]+ "의 수학 입력");
			maths[i] = sc.nextInt();
			System.out.println(names[i]+" 의 영어 입력");
			engs[i] = sc.nextInt();
			totals[i]=kors[i]+engs[i]+maths[i];
			avgs[i] = totals[i]/3.0;
		}
		
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+"\t");
			System.out.print(nums[i]+"\t");
			System.out.print(kors[i]+"\t");
			System.out.print(engs[i]+"\t");
			System.out.print(maths[i]+"\t");
			System.out.print(totals[i]+"\t");
			System.out.println(avgs[i]+"\t");
			
		}
		
//ex2>	
//		Scanner sc = new Scanner(System.in);
//		System.out.print("학생 수를 입력하세요: ");
//		int num = sc.nextInt();
//		String [] student = new String[num];
//		int [] nums = new int [student.length];
//		int [] infor = new int[3];
//		String[] subject = {"국어", "영어", "수학"}; 
//		int sum=0;
//		int avg=0;
//		
//		for (int j = 0; j < student.length; j++) {
//			System.out.print("학생의 이름을 입력하세요: ");
//			student[j] = sc.next();
//			System.out.print("학생의 번호를 입력하세요: ");
//			nums[j] = sc.nextInt();
//			for (int i = 0; i < infor.length; i++) {
//				System.out.print(student[j] + "학생의 " + subject[i] + "점수를 입력하시오: ");
//				infor[i] = sc.nextInt();
//				sum = sum + infor[i];
//			}
//			avg = sum / 3;
//			System.out.println("이름\t번호\t국어\t영어\t수학\t총합\t평균");
//			System.out.println(student[j]+"\t"+nums[j]+"\t"+infor[0]+"\t"+infor[1]+"\t"+infor[2]+"\t"+sum+"\t"+avg);
//			avg = 0;
//			sum = 0;
//		}
//		System.out.println("프로그램을 종료합니다.");
	}

}
