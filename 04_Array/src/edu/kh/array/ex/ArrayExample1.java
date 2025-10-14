package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	Scanner sc = new Scanner(System.in);
	/*
	 * 배열(Array)
	 * 
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것. - 묶여진 변수들은 하나의 배열명으로 불려지고 구분은 index를 이용함
	 * (index는 0부터 시작하는 정수)
	 * 
	 */

	public void ex1() {
		// 변수 vs 배열

		// 변수 선언
		int num;
		// stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 할당하고 그 공간에
		// num이라는 이름을 부여

		// 변수 대입
		num = 10;
		// 생성된 num이라는 변수공간에 10이라는 정구값 대입

		// 변수 사용
		System.out.println("num에 저장된 값 : " + num);

		// -------------------------

		// 배열 선언
		int[] arr;
		// int arr[];
		// stack영역에 int4[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr 이라는 이름을 부여
		// 해당 변수는 참조형으로 주소값만을 저장할 수 있다

		// 배열 할당
		arr = new int[3];
		// new : "new 연산자" 라고하며
		// Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당

		// int[3] : int 자료형 변수 3개를 하느이 묶음으로 나타내는 배열

		// new int[3] : Heap 영역에 int 형 변수 3칸짜리 intp[]을 생성(할당)

		System.out.println("arr : " + arr); // 주소값 출력

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// -> Heap 영역에 생성된 공간은 절대 비어있을 수 없다
		// -> JVM 기본값이 들어가져 있다
		// 나머지 : 0
		// 참조형 : null

		// 배열 요소 값 대입
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 100;
		// arr[3] = 500; -> 런타임 에러 발생
		// 배열 범위 벗어나 예외 발생

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		// [10, 50, 100] 출력하고 싶을 때
		// 실제로 배열이 가진 모든 요소의 값을 알고 싶을때
		// Arrays.toString(배열명); -> String 형
		// "[10, 50, 100]"

		System.out.println(Arrays.toString(arr));

	}

	public void ex2() {
		// 배열 선언 및 할당
		int[] arr = new int[4];

		// arr[0~3] 전부 JVM에 의해 0으로 초기화 되어있는 상태

		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		// arr[4] = 500;
		// 배열의 인덱스 범위를 벗어남: 길이를 4칸짜리로 만든 배열인데, 없는 인덱스 번호인 4에 접근했다

		// 배열과 for문
		// 배열의 길이(몇칸 인가) : 배열명.length
		System.out.printf("배열의 길이 : %d\n", arr.length);

		for (int i = 0; i < arr.length; i++) {
			// i -> 0, 1, 2, 3
			arr[i] = i * 100; // fordmf 이용한 초기화 방법
			System.out.printf("arr[%d]에 저장된 값: %d\n", i, arr[i]);
			// arr[0]에 저장된 값: 100
			// arr[1]에 저장된 값: 200
			// ..
		}

		// 선언과 동시에 초기화
		int[] arr2 = { 1, 2, 3, 4, 5 };
		// stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr2 라는 이름 부여
		// Heap 메모리 영역에 int 5칸짜리 배열을 생성하고
		// 0번 인덱스 부터 각 요소에 1~5까지 정수값을 대입.
		// int[] 주소값을 arr2 참조변수가 참조함.

		System.out.println(Arrays.toString(arr2));

	}

	public void ex3() {
		// 5명의 키(cm)를 입력받고 평균 구하기
		// 1번키 입력 :
		// ..
		// 평균 : 177.02cm

		Scanner sc = new Scanner(System.in);

		double[] height = new double[5];
		double sum = 0;

		for (int i = 0; i < height.length; i++) {
			System.out.printf("%d번키 입력 : ", i + 1);
			height[i] = sc.nextDouble();
			sum += height[i];
		}
		System.out.printf("\n평균 : %.2fcm", sum / height.length);
	}

	public void ex4() {
		// 입력 받은 인원수 만큼의 점수를 입력받아 배열에 저장
		// 입력이 완료되면 점수 합계, 평균 출력
		//
		// 입력 받을 인워 수 : 4
		// 1번 점수 입력 : 100
		// ..
		// 합계 : 100
		// 평균: 20.2

		System.out.print("입력 받을 인원 수 : ");
		int i = sc.nextInt();

		int arr[] = new int[i];
		int sum = 0;

		for (int j = 0; j < i; j++) {
			System.out.printf("%d번 점수 입력 : ", j + 1);
			arr[j] = sc.nextInt();

			sum += arr[j];
		}
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", (double) sum / arr.length);
	}

	public void ex5() {
		// 점심 메뉴 뽑기 프로그램
		String[] arr = { "김밥", "서브웨이", "햄버거", "백반", "국밥", "짜장면" };
		int random = (int) (Math.random() * 6);

		System.out.println("오늘 점심 메뉴 : " + arr[random]);
		// Math.random(): 0.0 ~1,0
		// 0.0 <= x <1.0
		// 0.0 <= x < 6.0
		// 0 <= x <6
		// 0 1 2 3 4 5
	}

	public void ex6() {
		// 배열을 이용한 검색

		// 입력받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇번 인덱스에 존재하는지 출력

		// 정수 입력 : 200
		// 1번째 인덱스에 존재

		// 정수 입력:
		// 존재하지 않음

		int arr[] = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };

		System.out.print("정수 입력 : ");
		int i = sc.nextInt();

		// 찾음 여부를 표시하기 위한 변수
		boolean flag = false; // 검사전에는 못찾았다고 가정

		// int a= 0;

		for (int j = 0; j < arr.length; j++) {
			if (i == arr[j]) {
				System.out.printf("%d번째 인덱스에 존재", j);
				flag = true; // 일치하는 값을 찾았으므로 true로 변경
				// a++;
			}
		}
		if (!flag) {
			System.out.println("존재하지 않음");
		}

//		if(a == 0) {
//			System.out.println("존재하지 않음");
//		}

	}

	public void ex7() {
		// 입력받은 값과 일치하는 값이 있으면 인덱스 번호 출력
		// 없으면 "존재하지 않음" 출력

		String[] arr = { "사과", "딸기", "바나나", "키위", "멜론", "아보카도" };

		System.out.print("과일 입력 : ");
		String i = sc.next();

		int a = 0;

		for (int j = 0; j < arr.length; j++) {
			if (i.equals(arr[j])) {
				System.out.printf("%d번째 인덱스에 존재", j);
				a++;
			}
		}
		if (a == 0) {
			System.out.println("존재하지 않음");
		}
	}

	public void ex8() {
		// ex)
		// 문자열 입력 : hello
		// h, e,l , l, o
		// 검색할 문자 입력: l
		// 2개 있음/ 존재하지않음

		// 1. 문자열을 입력바당 한 글자씩 잘라내어 char 배열에 순서대로 저장
		// 2. 문자하나를 입력받아 일치하는 문자가 cahr배열에 몇개 존재하는지 확인
		// 3. 단, 일치하는 문자가 없을 경우 "존재하지 않습니다"

		// 사용해야하는 기술, 기능
		// 1) 배열 검색
		// 2) 문자열의 길이 구하기 : String.lenth()
		// ex) "hello".length() -> 5 반환
		// 3) String.chatAt(index) : 문자열에서 특정 index에 위치한 문자 하나를 얻어옴.
		// ex) "hello",charAt(1) -> 'e'

		int count = 0;

		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		// 입력받은 문자열을 한글자씩 잘라내어 char배열에 순서대로 저장
		// 입력받은 문자열 길이만큼의 char 배열 선언 및 할당하기

		char[] arr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);

		}
		System.out.print("검색할 문자 입력 : ");
		char c = sc.next().charAt(0);
		
		// String.charAt(index) -> 문자형
		// "e".charAt(0); -> 'e'
		// -> Scanner 에는 cahr 형태를 입력받을 수 있는 메서드가 없다
		// -> String으로 우선 입력받고 입력받은 String에서
		// charAt(index) 메서드를 이용하여 해당 index번째 존재하는 문자 하늘 뗴어 char 자료형 형태로 반환함

		// arr 배열에 입력한 문자가 몇개 존재하는지
		// 0번 index부터 마지막 index까지 순회하며 검색하기 위함
		
		for (int j = 0; j < str.length(); j++) {
			if (c == arr[j]) {
				count++;
			}
		}
		if (count != 0) {
			System.out.printf("%d개 있음\n", count);
		} else {
			System.out.println("존재하지 않음");
		}

	}

}
