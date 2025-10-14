package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {

	private Scanner sc = new Scanner(System.in);
	
	private SnackController scr = new SnackController();
	
	public void menu() {
		
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String a = sc.nextLine();
		System.out.print("이름 : ");
		String b = sc.nextLine();
		System.out.print("맛 : ");
		String c = sc.nextLine();
		System.out.print("개수 : ");
		int d = sc.nextInt();
		System.out.print("가격 : ");
		int e = sc.nextInt();
		
		System.out.println(scr.saveData(a, b, c, d, e));
		
		
		
		
		
		while(true) {
			System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
			char f = sc.next().charAt(0);
			
			if(f == 'y' || f == 'Y') {
				System.out.println(scr.confirmData());
				break;
			} else if (f == 'n' || f == 'N') {
				break;
				
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
			
		}
		
		
		
	}
		
}
