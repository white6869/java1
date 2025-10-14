package edu.kh.pratice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		int[] arr = new int[9];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.printf("%d ", arr[i]);

			if (i % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.printf("\n짝수 번째 인덱스 합 : %d", sum);
	}

	public void practice2() {
		int[] arr = new int[9];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.printf("%d ", arr[i]);

			if (i % 2 != 0) {
				sum += arr[i];
			}
		}
		System.out.printf("\n홀수 번째 인덱스 합 : %d", sum);

	}

	public void practice3() {

		System.out.print("양의 정수 : ");
		int a = sc.nextInt();

		int[] arr = new int[a];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.printf("%d ", arr[i]);
		}
	}

	public void practice4() {

		int[] arr = new int[5];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("입력 %d : ", i);
			arr[i] = sc.nextInt();
		}

		System.out.print("검색할 값 : ");
		int a = sc.nextInt();

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == a) {
				System.out.printf("인덱스 : %d\n", j);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}

	public void practice5() {

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char s = sc.next().charAt(0);

		int count = 0;

		char arr[] = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}

		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, s);

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == s) {
				System.out.printf("%d ", j);
				count++;
			}
		}

		System.out.printf("\n%c 개수 : %d\n", s, count);
	}

	public void practice6() {

		System.out.print("정수 : ");
		int i = sc.nextInt();

		int[] arr = new int[i];
		int sum = 0;
		String result = "";

		for (int j = 0; j < arr.length; j++) {

			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", j);
			arr[j] = sc.nextInt();
			sum += arr[j];
			result += arr[j] + " ";

		}
		System.out.println(result);
		System.out.printf("총 합 : %d\n", sum);

	}

	public void practice7() {

		System.out.printf("주민등록번호(-포함) : ");
		String str = sc.nextLine();

		char[] arr = new char[str.length()];
		int b = 0;

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			if (arr[i] == '-') {
				b = i;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (j >= b + 2) {
				arr[j] = '*';
			}
			System.out.print(arr[j]);
		}

	}

	public void practice8() {
		System.out.print("정수 : ");
		int i = sc.nextInt();

		int[] arr = new int[i];

		if (i < 3 || i % 2 == 0) {
			System.out.println("다시 입력하세요.");
		} else if (i >= 3 && i % 2 != 0) {
			for (int j = 0; j < i / 2; j++) {
				arr[j] = j + 1;
			}
			for (int k = i / 2; k < i; k++) {
				arr[k] = i - k;
			}
			for (int l = 0; l < i - 1; l++) {
				System.out.print(arr[l] + ", ");
			}
			System.out.print(arr[i - 1]);

		} else {
			System.out.println("다시 입력하세요.");
		}
	}

	public void practice9() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 10 + 1);
			arr[i] = random;

		}

		for (int j = 0; j < arr.length; j++) {
			System.out.printf("%d ", arr[j]);
		}

	}

	public void practice10() {
		int[] arr = new int[10];

		int max = 1;
		int min = 10;

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 10 + 1);
			arr[i] = random;

		}

		for (int j = 0; j < arr.length; j++) {
			System.out.printf("%d ", arr[j]);
			if (arr[j] > max) {
				max = arr[j];
			}
			if (arr[j] < min) {
				min = arr[j];
			}

		}
		System.out.println();

		System.out.printf("최대값 : %d\n", max);
		System.out.printf("최소값 : %d", min);
	}

	public void practice11() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 10 + 1);
			arr[i] = random;
			for (int l = 0; l < i; l++) {
				if (random == arr[l]) {
					i--;
					break;
				}
			}

		}

		for (int j = 0; j < arr.length; j++) {
			System.out.printf("%d ", arr[j]);
		}
	}

	public void practice12() {
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {

			int random = (int) (Math.random() * 45 + 1);
			lotto[i] = random;

			for (int x = 0; x < i; x++) {
				if (random == lotto[x]) {
					i--;
					break;

				}
			}
		}
		Arrays.sort(lotto);

		for (int l = 0; l < lotto.length; l++) {
			System.out.printf("%d ", lotto[l]);
		}
	}

	public void practice13() {
		// 1.사용자에게 문자열 입력받기
		System.out.print("문자열 : ");
		String str = sc.next();
		
		// 2. 해당 문자열의 문자들을 char[]에 담기
		char arr[] = new char[str.length()];
		
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			
		}
		
		//3. char 배열에서 중복값 존재할 경우 출력x
		int count = 0;
		
		System.out.print("문자열에 있는 문자  : ");
		
		for(int j = 0 ; j < arr.length; j++) {
			
			boolean flag = true; // 중복 체크용 flag 변수

			//중복값이 있는ㄴ지 검사하는 for
			for(int k =0; k < j; k++) {
				if(arr[j]== arr[k]) {
					flag = false; // 중복 발생했을 때
					break;
				}
			}
			
			if (flag) { // 중복이 발생하지 않았을 경우
				if(j == 0) { //첫번째 글자
					System.out.print(arr[j]);
				} else { //0번 인덱스가 아닌 글자
					System.out.print(", " + arr[j]);
				}
				
				count++; // 중복 아닐때만 count 갯수 늘리기
				
			}
		}
		System.out.println();
		System.out.println("문자 개수 : " + count);
		
	}

	public void practice14() {
		// 1. 첫 배열 크기 지정
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine(); //입력 버퍼에 남은 개행문자 제거
		
		String[] arr = new String[size];
		
		// 2. 첫 배열에 저장할 문자열 입력받기
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번쩨 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		// 3. 반복이 시작되는 구간부터 while 작성하여 내부에 종료조건 만들어서 break;
		while(true) {
			System.out.println("더 값을 입력하시겠습니까(Y/N) : ");
			char ch = sc.next().charAt(0);
			
			// 4.값을 더 입력할 경우
			if(ch == 'y' || ch == 'Y') {
					
				// 5. 더 입력받을 개수 입력받기
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
				
				// 6.새로 값을 입력받을 배열 생성 --> 기존 배열크기 + 추가 입력 개수
				String[] newArr = new String[arr.length + addSize];
				
				//7.배열 복사 + 새로운 문자열 입력받기
				for(int i = 0; i < newArr.length; i++) {
					if(i < arr.length) { //인덱스의 크기가 기존 배열보다 작을 경우 (깊은 복사)
						newArr[i] = arr[i]; // 기존 배열 요소 값 복사
					} else { //인덱스의 크기가 기존배열 보다 클 경우 (새로운 값 입력받기)
						System.out.print((i+1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				
				//8. 기존 배열 공간을 참조한던 변수 arr에 새로운 배열 공간의 주소 newArr 대입(얕은 복사)
				// 더입력? y
				//위코드 를 반복할떄 기존 배열인 arr의 길이를 기준으로 새 배열의 크기를 할당하기 때문에
				arr = newArr; // newArr배열이 for문 안에 있어서 arr배열에 넣어주지 않으면 밖에서 출력 할 수가 없다. 
				
			} else if(ch =='n' || ch =='N') {
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
			
		// 10.배열값 모두 출력
		System.out.println(Arrays.toString(arr));
		}

	public void practice14_1() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		String arr[] = new String[a];
		
		for(int i = 0; i < a; i++) {
			System.out.printf("%d번째 문자열 : ",i+1);
			arr[i] = sc.next();
			sc.nextLine();
		}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String val = sc.next();
			
			if(val.equals("y") || val.equals("Y")) {
				System.out.print("더 입력하고 싶은 개수 : ");
				int b = sc.nextInt();
				String arr2[] = new String[arr.length + b];
				
				for(int i = 0; i < arr2.length; i++) {
					if(i < arr.length) {
						arr2[i] = arr[i];
					} else {
						System.out.printf("%d번째 문자열 : ", i+1);
						arr2[i] = sc.next();
						sc.nextLine();
					}
				}
				arr = arr2; // -> 
			} 
			else if(val.equals("n") || val.equals("N")) {
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} 
		System.out.println(Arrays.toString(arr));
	}
	}
