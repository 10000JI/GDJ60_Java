package com.iu.s4.objects1.ex1;

import java.util.Scanner;

public class MenuController {
	//start
	//1.등록 2.수정 3. 삭제 4.종료
	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentInput sip = new StudentInput();
		StudentView sv = new StudentView();
		
		System.out.print("학생 수를 입력하세요: ");
		int count = sc.nextInt();
		Student [] students = new Student[count];
		
		while(true) {
			System.out.println("1.학생 정보 입력");
			System.out.println("2.학생 검색 정보 출력");
			System.out.println("3.학생 전체 정보 출력");
			System.out.println("4.학생 한명 추가");
			System.out.println("5.종료");
			int num = sc.nextInt();
			if(num==1) {
				sip.setAllStudents(students);
			} else if(num==2) {
				Student student = sip.findStudent(students);
				if(student!=null) {
					sv.viewOne(student);
				}else {
					System.out.println("그런 학생은 없어요!");
				}
			} else if(num==3) {
				sv.viewList(students);
			}else if (num==4) {
				students = sip.setStudent(students);
			}else if (num==5) {
				break;
			} else {
				System.out.println("잘못입력했습니다.");
			}
		}
		
	}
}
