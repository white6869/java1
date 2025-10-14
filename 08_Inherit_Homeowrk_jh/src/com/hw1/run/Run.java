package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		Student[] st = new Student[3];
		st[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		st[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		st[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과");
		
		//반복문을 통해 출력
		// 향상된 for문
		/* 
		 * 자바에서 배열, 컬렉션과 같은 데이터를 순차적으로
		 * 간단하게 반복할 수 있는 구조를 제공
		 * 
		 * 일반적인 for문 보다 코드가 더 간결하고 가독성이 좋아서
		 * 반복작업을 더 쉽게 작서할 수있다
		 * 
		 * for(자료형 변수명 : 배열 또는 컬렉션) {
		 * 			반복해서 실행할 코
		 * }
		 * */
		for(int i =0; i < st.length; i++) {
			System.out.println(st[i].information());
		}
		System.out.println("================================================================================");
		
		Employee[] ep = new Employee[10];
		
		int count = 0;
		while(true) {
			for(int i = 0; i < ep.length; i++) {
				ep[i] = new Employee(sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextDouble(), sc.nextInt(), sc.next());
				
				System.out.println("더 추가 하시겠습니까? :");
				char c = sc.next().charAt(0);
				if(c == 'y' || c == 'Y') {
					count++;
					continue;
					
				} else if(c == 'n' || c == 'N') break;
				else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					
				}
				
			} for(int i = 0; i <= count; i++) {
				System.out.println(ep[i].informatio());
			}
			
		}
		

	}

}
