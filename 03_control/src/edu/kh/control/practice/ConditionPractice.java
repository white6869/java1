package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in);

	public void pratice1() {

		System.out.print("숫자를 한 개 입력하세요 : ");
		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("짝수입니다.");
		} else if (a % 2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		sc.nextLine();

	}

	public void pratice2() {

		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		sc.nextLine();
		System.out.print("수학점수 : ");
		int mat = sc.nextInt();
		sc.nextLine();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		sc.nextLine();

		int sum = kor + mat + eng;
		double avg = sum / 3.0;

		if (kor >= 40 && mat >= 40 && eng >= 40 && avg >= 60) {
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("수학 : %d\n", mat);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("합계 : %d\n", sum);
			System.out.printf("평균 : %.1f\n", avg);
			System.out.println("축하합니다, 합격입니다!");

		} else {
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("수학 : %d\n", mat);
			System.out.printf("영어 : %d\n", eng);
			System.out.println("불합격입니다.");
		}
		sc.nextLine();

	}

	public void pratice3() {
		System.out.printf("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();

		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println(month + "월은 31일까지 있습니다");
			break;
		case 4, 6, 9, 11:
			System.out.println(month + "월은 30일까지 있습니다");
			break;
		case 2:
			System.out.println(month + "월은 28일까지 있습니다");
			break;
		default:
			System.out.println(month + "월은 잘못 입력된 달입니다.");

		}
		sc.nextLine();
	}

	public void pratice4() {

		System.out.print("키(m) 입력해 주세요 : ");
		int m = sc.nextInt();
		sc.nextLine();
		System.out.print("몸무게(kg) 입력해 주세요 : ");
		int kg = sc.nextInt();
		sc.nextLine();
		double bmi = kg / (m * m);
		System.out.printf("BMI 지수 : %f\n", bmi);

		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (18.5 <= bmi || bmi < 23) {
			System.out.println("정상체중");
		} else if (23 <= bmi || bmi < 25) {
			System.out.println("과체중");
		} else if (25 <= bmi || bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도 비만");
		}
	}

	public void pratice5() {

		System.out.printf("중간 고사 점수 : ");
		int ms = sc.nextInt();
		sc.nextLine();

		System.out.printf("기말 고사 점수 : ");
		int fs = sc.nextInt();
		sc.nextLine();

		System.out.printf("과제  점수 : ");
		int hs = sc.nextInt();
		sc.nextLine();

		System.out.printf("출석 횟수 : ");
		int cs = sc.nextInt();
		sc.nextLine();

		double ms2 = ms * 0.2;
		double fs2 = fs * 0.3;
		double hs2 = hs * 0.3;
		double cs2 = ms * 0.2;
		double sum = ms2 + fs2 + hs2 + cs2;
		System.out.println("========== 결과 ==========");

		if (cs <= 20 * 0.7) {
			System.out.printf("Fail [출석 횟수 부족 (%d/20)]\n", cs);
		} else {
			if (sum >= 70) {
				System.out.printf("중간 고사 점수(20) : %.1f\n", ms2);
				System.out.printf("기말 고사 점수(30) : %.1f\n", fs2);
				System.out.printf("과제 점수(30) : %.1f\n", hs2);
				System.out.printf("출석 점수(20) : %.1f\n", cs2);
				System.out.printf("총점 : %.1f\n", sum);
				System.out.println("PASS");

			} else {
				System.out.printf("중간 고사 점수(20) : %.1f\n", ms2);
				System.out.printf("기말 고사 점수(30) : %.1f\n", fs2);
				System.out.printf("과제 점수(30) : %.1f\n", hs2);
				System.out.printf("출석 점수(20) : %.1f\n", cs2);
				System.out.printf("총점 : %.1f\n", sum);
				System.out.println("Fail [점수 미달]");
			}
		}
	}

	public void pratice6() {
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		if (age < 0 || age > 100) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.print("키 입력 : ");
			int zl = sc.nextInt();

			if (zl >= 140) {
				if (age >= 12) {
					System.out.println("탑승 가능");
				} else {
					System.out.println("적정 연령이 아닙니다");
				}
			} else {
				System.out.println("적정 키가 아닙니다.");

			}
		}
	}

	public void pratice7() {

		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		sc.nextLine();

		if (age > 0 && age < 100) {

			System.out.print("키 입력 : ");
			int zl = sc.nextInt();
			sc.nextLine();

			if (zl > 0 && zl < 250.0) {
				if (age >= 12) {
					if (zl >= 140) {
						System.out.println("탑승 가능!!!");
					} else {
						System.out.println("나이는 적절하나, 키가 적절치 않음");
					}

				} else {
					if (zl >= 140) {
						System.out.println("키는 적절하나, 나이가 적적치 않음");
					} else if (zl < 140) {
						System.out.println("나이와 키 모두 적절치 않음");
					}
				}

			} else {
				System.out.println("키를 잘못 입력 하셨습니다");
			}

		} else {
			System.out.println("나이를 잘못 입력 하셨습니다");
		}

	}

	
}
