package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	public void pratice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int a = sc.nextInt();
		
		if (a >=1 ) {
			for (int i = 1; i <= a; i++ ) {
				System.out.printf("%d ", i);
			} System.out.println();
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void pratice2() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int a = sc.nextInt();
		
		if (a >=1 ) {
			for (int i = 1; i <= a; a-- ) {	
				System.out.printf("%d ", a);
			} System.out.println();
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void pratice3() {
		System.out.print("정수를 하나 입력하세요 : ");
		int a = sc.nextInt();
		
		int sum = 0;
		
		for (int i =1; i <= a-1; i++) {
			System.out.printf("%d + ", i);
			sum += i;
		}
		System.out.printf("%d = %d", a, sum+a);
;	}
	
	public void pratice4() {
		System.out.print("첫 번째 숫자 : ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.print("두 번째 숫자 : ");
		int b = sc.nextInt();
		sc.nextLine();
		
		int max = 0;
		int min = 0;
		
		if (a >= 1 && b >= 1) {
			if (a > b) {
				max = a;
				min = b;
			} else {
				max = b;
				min = a;
			}
			for(int i = min; i <= max; i++) {
				System.out.printf("%d ", i);
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void pratice5() {
		System.out.print("숫자 : ");
		int a = sc.nextInt();
		
		System.out.printf("===== %d단 =====\n", a);
		for(int i =1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", a, i, a*i);
		}
	}

	public void pratice6() {
		System.out.print("숫자 : ");
		int a = sc.nextInt();
		
		if (a >= 2 && a <= 9) {
			for(int j =a; j <= 9; j++) {
				System.out.printf("===== %d단 =====\n", j);
				for(int i =1; i <= 9; i++) {
					System.out.printf("%d * %d = %d\n", j, i, j*i);
				}
			}	
		} else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}
		
	}

	public void pratice7() {			
		System.out.print("자연수 하나를 입력하세요 : ");
		int a = sc.nextInt();
		
		int count = 0;
		
		
		for (int i = 1; i <= a; i++) {
			if ( i % 2 == 0  || i % 3 == 0) {
				System.out.printf("%d ", i);
				if (i % 2 == 0 && i % 3 == 0) {
					count++;
				}
			}
		}
		System.out.printf("\ncount : %d", count);
	}
}
