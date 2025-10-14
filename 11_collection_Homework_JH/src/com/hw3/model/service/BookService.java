package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;
import com.hw3.model.dto.BookPlus;

public class BookService extends Book {
	
	Scanner sc = new Scanner(System.in);
	
	private List<Book> bookList = new ArrayList<>();
	private int b3 = 0;
	private List<Book> bpList = new ArrayList<>();
	public BookService() {
		// TODO Auto-generated constructor stubb
		bookList.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		bookList.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		bookList.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		bookList.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		bookList.add(new Book(5555, "도둑맞은 집중력", "요한 하리",16920, "어크로스"));
	}

	public BookService(int bookNum, String title, String author, int price, String ch) {
		super(bookNum, title, author, price, ch);
	}
	public void bookBasic() {
		
	}

	public void bookMenu() {
		int bmNum = 0;
		
		do {
			System.out.println("===도서 목록 프로그램===");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8. 즐겨찾기 뽑기");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴를 입력하세요 : ");
			bmNum = sc.nextInt();
			
			switch(bmNum) {
			case 1: book1(); break;
			case 2: book2(); break;
			case 3: book3(); break;
			case 4: book4(); break;
			case 5: book5(); break;
			case 6: book6(); break;
			case 7: book7(); break;
			case 8:
			case 0:
				
			}
		} while (bmNum != 0);
	}
	
	public void book1() {
		System.out.println("=====도서 등록=====");
		
		
		System.out.print("도서 번호 : ");
		int b1Num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 제목 : ");
		String b1Title = sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String b1Author =sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int b1Price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 출판사 : ");
		String b1Ch = sc.nextLine();
		
		bookList.add(new Book(b1Num, b1Title, b1Author, b1Price, b1Ch));
		System.out.println("등록 완료");
	
		
		
	}
	
	public void book2() {
		for(Book bk : bookList) {
			System.out.println(bk);
		}
	}

	public void book3() {
		System.out.println("=====도서 수정=====");
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int b3Num = sc.nextInt();
		//sc.nextLine();
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getBookNum() == b3Num) {
				b3 = i;
				int bNum = 0;
				do {
					System.out.println("1. 도서명");
					System.out.println("2. 도서 저자");
					System.out.println("3. 도서 가격");
					System.out.println("4. 도서 출판사");
					System.out.println("0. 수정 종료");
					System.out.print("어떤 정보를 수정하시겠습니까? ");
					bNum = sc.nextInt();
					sc.nextLine();
					
					switch(bNum) {
						case 1: book3_1(); break;
						case 2: book3_2(); break;
						case 3: book3_3(); break;
						case 4: book3_4(); break;
						case 0: System.out.println("종료합니다..."); break;
						}
				
				} while (bNum != 0);
				System.out.println("==모든 수정 완료==");
				break;	
			}
		} System.out.println("일치하는 도서번호가 없습니다.");
	
			
		
	} 
		


	public void book3_1() {
		System.out.println("=====도서명 수정=====");
		System.out.print("수정할 도서명을 입력하세요 : ");
		String b3_1str = sc.nextLine();
		bookList.get(b3).setTitle(b3_1str);
	}
	public void book3_2() {
		System.out.println("=====도서 저자 수정=====");
		System.out.print("수정할 저자명을 입력하세요 :");
		String b3_2str = sc.nextLine();
		bookList.get(b3).setAuthor(b3_2str);
	}
	public void book3_3() {
		System.out.println("=====도서 가격 수정=====");
		System.out.print("수정할 가격을 입력하세요 :");
		int b3_3str = sc.nextInt();
		bookList.get(b3).setPrice(b3_3str);
		sc.nextLine();
	}
	public void book3_4() {
		System.out.println("=====도서 출판사 수정=====");
		System.out.print("수정할 출판사명을 입력하세요 :");
		String b3_4str = sc.nextLine();
		bookList.get(b3).setCh(b3_4str);
	}

	public void book4() {
		System.out.println("\n===도서 목록 프로그램===");
		book2();
		System.out.print("\n삭제할 도서의 번호를 입력하세요 : ");
		int b4Num = sc.nextInt();
		System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
		char b4C = sc.next().charAt(0);
		
		if(b4C == 'y' || b4C == 'Y') {
			for(int i = 0; i < bookList.size(); i++) {
				if(bookList.get(i).getBookNum() == b4Num) {
					bookList.remove(i);
					System.out.println("삭제가 완료되었습니다.");
					break;
			
				}
			}
		} else if(b4C == 'n' || b4C == 'N') {
			System.out.println("삭제를 진행하지 않습니다.");
		} else {
			System.out.println("잘못 입력하셨습니다. 메뉴 화면으로 돌아갑니다.");
		}
	}

	public void book5() {
		
		System.out.println("======즐겨찾기 추가======");
		System.out.print("즐겨찾기 할 도서 번호 : ");
		int b5Num = sc.nextInt();
		for(int i = 0; i < bpList.size(); i++) {
			if(bpList.get(i).getBookNum() == b5Num) {
				b3 = i;
				break;
		
			}
		}
		
		bpList.add(new Book(bookList.get(b3).getBookNum(), bookList.get(b3).getTitle(), bookList.get(b3).getAuthor(), bookList.get(b3).getPrice(), bookList.get(b3).getCh()));
		System.out.println(bpList.get(b3).getBookNum()+"번 도서가 즐겨찾기에 추가 되었습니다.");
		
	}
	
	public void book6() {
		System.out.println("\n======즐겨찾기 삭제======");
		System.out.print("\n삭제할 도서의 번호 : ");
		int b6Num = sc.nextInt();
		for(int i = 0; i < bpList.size(); i++) {
			if(bpList.get(i).getBookNum() == b6Num) {
				System.out.println(bpList.get(i).getBookNum() + "번 도서가 삭제 되었습니다.");
				bpList.remove(i);
				break;
			}
		}
	}

	public void book7() {
		for(Book bk : bpList) {
			System.out.println(bk);
		}
	}
}
