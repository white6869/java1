package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {
	Scanner sc = new Scanner(System.in);
	
	private List<Animal> animals = new ArrayList<>();
	
	public Zoo() {
		// TODO Auto-generated constructor stub
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void showAnimals() {
		System.out.println("동물들의 울음소리를 들어보세요:");
		animals.get(0).sound();
		animals.get(1).sound();
	}

	public void displayMenu() {
		int menuNum = 0;
		
		do {
			System.out.println("****** KH 동물원 ******");
			System.out.println("원하는 작업을 선택하세요 :");
			System.out.println("1. 동물들의 울음소리 듣기");
			System.out.println("2. 종료");
			System.out.print("선택 : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
				case 1: showAnimals(); break;
				case 2: System.out.println("프로그램을 종료합니다."); break;
				default: System.out.println("메뉴에 있는 번호를 눌러주세요!");
			}
			
		} while (menuNum != 2);
	}
}
