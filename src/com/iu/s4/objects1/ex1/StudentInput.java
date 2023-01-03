package com.iu.s4.objects1.ex1;

import java.util.Scanner;

public class StudentInput {
	
	//★★★★★★★★★★ findStudent ★★★★★★★★★★★
	//학생배열을 받아서 
	//★학생의 번호를 입력받아서 일치하는 학생을 리턴, 없으면 null(reference 기본값)★
	
	//setStudent
	//학생 한명 객체를 생성해서 이름, 번호, 국어, 영어, 수학 입력
	//총점 평균
	//학생 한명 추가
	
	//setAllStudents
	//매개변수로 학생배열을 받아서
	//배열의 수만큼 학생 객체를 생성해서 이름, 번호, 국어, 영어, 수학 입력
	//총점 평균
	//학생 객체를 배열에 대입
	
	public Student findStudent(Student[] students) {
    	StudentView sv = new StudentView();
		Scanner sc = new Scanner(System.in);
    	System.out.print("찾으려는 학생의 번호를 입력: ");
	    int num = sc.nextInt();
	    Student student = null;
    	for(int i=0; i<students.length;i++) {
		    if(num==students[i].num) {
		    	student = students[i];
		    	//return students[i];
		    } 
	    }
    	return student;
	}

	
	public Student[] setStudent(Student [] students) {
		Student [] students2 = new Student[students.length+1];
		for(int i=0;i<students.length;i++) {
			students2[i] = students[i];
		}
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		student.name = sc.next();
		System.out.print("번호를 입력하세요: ");
		student.num = sc.nextInt();
		System.out.print("국어점수를 입력하세요: ");
		student.kor = sc.nextInt();
		System.out.print("영어점수를 입력하세요: ");
		student.eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요: ");
		student.math = sc.nextInt();
		student.total = student.kor+student.eng+student.math;
		student.avg = student.total / 3;
		students2[students2.length-1]=student;
		//return students2;
		students = students2;
		return students;
	}
	
	public void setAllStudents(Student[] students) {
		
		for(int i=0; i<students.length;i++) {
			Scanner sc = new Scanner(System.in);
			Student student = new Student();
			System.out.print(i+1+"번째 학생의 이름 입력: ");
			student.name = sc.next();
			System.out.print(i+1+"번째 학생의 번호 입력: ");
			student.num = sc.nextInt();
			System.out.print(i+1+"번째 학생의 국어점수 입력: ");
			student.kor = sc.nextInt();
			System.out.print(i+1+"번째 학생의 영어점수 입력: ");
			student.eng = sc.nextInt();
			System.out.print(i+1+"번째 학생의 수학점수 입력: ");
			student.math = sc.nextInt();
			student.total = student.kor+student.eng+student.math;
			student.avg = student.total/3;
			students[i]=student;
		}
	}
	
}
