package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		//Employee employee = new Employee();
		Employee[] empArr = new Employee[3];
		empArr[0] = new Employee();
		empArr[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		empArr[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		
		for(int i = 0; i < empArr.length; i++) {
			System.out.print("emp[" + i + "] : " + empArr[i].information()+"\n");
		}
		System.out.println("=================================================================");
		
		empArr[0].setEmpNo(0);
		empArr[0].setEmpName("김말똥");
		empArr[0].setDept("영업부");
		empArr[0].setJob("팀장");
		empArr[0].setAge(30);
		empArr[0].setGender('M');
		empArr[0].setSalary(3000000);
		empArr[0].setBonusPoint(0.2);
		empArr[0].setPhone("01055559999");
		empArr[0].setAddress("전라도 광주");
		
		empArr[1].setDept("기획부");
		empArr[1].setJob("부장");
		empArr[1].setSalary(4000000);
		empArr[1].setBonusPoint(0.3);
		
		System.out.print("emp[" + 0 + "] : " + empArr[0].information()+"\n");
		System.out.print("emp[" + 1 + "] : " + empArr[1].information()+"\n");
		
		System.out.println("=================================================================");
		
		int sum = 0;
		
		for(int i = 0; i < empArr.length; i++) {
			int total = (int)(empArr[i].getSalary() * (1 + empArr[i].getBonusPoint()) * 12); 
			sum += total;
			System.out.printf("%s의 연봉 : %d원\n", empArr[i].getEmpName(), total);
		}
		
		System.out.println("=================================================================");

		System.out.println("직원들의 연봉의 평균 : " + sum / 3 + "원");
		
		

	}

}
