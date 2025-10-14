package edu.kh.poly.ex2.model.dto;

public abstract class Animal {
	// 추상클래스(abstract class)
	// 1. 미완성 클래스라고 부를 수 있음
	// 2. 미완성 메서드(추상 메서드)를 보유하고 있는 클래스
	// 3. 객체로 만들 수 없는 클래스
	// -> 여러 타입들을 관리하기 위한 상위 타입의 목적.(부모타입 참조변수)
	// 객체로 생성하셔 사용하기 위한 목적이 아님.
	
	// 속성
	private String type; // 종/ 과
	private String eatType;

	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	//동물의 공통 기능 추출(추상화)
	// -> 동물은 공통적으로 먹고, 쉼수고, 움직이지만
	// 어떤 동물이냐에 따라 그 방법이 다 다름!
	//-> 해당 클래스
	//동물으
	
	//먹다
	public abstract void eat();
	// 숨쉬다
	public abstract void breath();
	//움직이다
	public abstract void move();

	public Animal(String type, String eatType ) {
		super();
		this.type = type;
		this.eatType = eatType;
	}

	@Override
	public String toString() {
		return  type + " / " + eatType;
	}
	
	// 추상 메서드가 하나라도 있다면 해당 클래스는 반드시 추상 클래스 여야함 
	// 추상 클래스는 일반 멤버(필드, 메서드도 작성가능); // 필드, 메서드도 작성 가능
	
	
}

