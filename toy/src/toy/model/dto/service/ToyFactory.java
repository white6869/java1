package toy.model.dto.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;

import toy.model.dto.Toy;

public class ToyFactory {

	private Scanner sc = new Scanner(System.in);

	private Set<Toy> toySet = new LinkedHashSet<>(); // 장난감 목록
	private Map<Integer, String> toyMList = new HashMap<Integer, String>();
	// 장난감 재료

	/**
	 * 장난감 공장
	 */
	public ToyFactory() {
		toyMList.put(1, "면직물");
		toyMList.put(2, "플라스틱");
		toyMList.put(3, "유리");
		toyMList.put(4, "고무");

		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(1, 4)));
		toySet.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", addMaterials(1, 2)));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", addMaterials(1, 2)));
		toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", addMaterials(1, 2)));
		toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", addMaterials(1, 2, 4)));

	}

	private Set<String> addMaterials(int... materials) {

		// 1. 매개변수로 전달받은 materials 파악하기 == 배열로 정수형 데이터가 여러개
		// ex) [1,2,4]

		// 2. 재료를 저장하여 반환할 Set객체를 생성
		Set<String> addedMaterials = new HashSet<String>();

		// 3. addedMaterials 에 재료명을 추가해야함
		// -> 단, 재료는 Map에 존재하는 것만 추가 가능
		for (int materialKey : materials) {

			// Map에서 재료 고유 번호(Key)에 대응하는 재료명(Value)를 가져와서
			// addedMaterials 추가
			// map에 없는 key를 입력하여 value를 얻어왔을 때 == null
			String materialValue = toyMList.get(materialKey);

			if (materialValue != null) {
				// 재료 목록에 해당 키(재료)가 있을 때
				addedMaterials.add(materialValue);
			}
		}

		return addedMaterials; // [면직물, 플라스틱]
	}

	/**
	 * 장난감 공장 메뉴
	 */
	public void displayMenu() {
		try {
			int menuNum = 0;

			do {
				System.out.println("<<플레이 타임 공장>>");
				System.out.println("1.전체 장남감 조회하기");
				System.out.println("2.새로운 장난감 만들기");
				System.out.println("3.장난감 삭제하기");
				System.out.println("4.장난감 제조일 순으로 조회하기");
				System.out.println("5.연령별 사용 가능한 장난감 리스트 조회하기");
				System.out.println("6.재료 추가");
				System.out.println("7.재료 제거");
				System.out.println("0.종료");

				System.out.print("선택: ");
				menuNum = sc.nextInt();
				sc.nextLine();

				switch (menuNum) {
				case 1:
					read(); // 전체 장난감 목록
					break;
				case 2:
					create(); // 새로운 장난감 추가
					break;
				case 3:
					delete(); // 장난감 삭제
					break;
				case 4:
					dateRead(); // 제조년월일 순으로 정렬
					break;
				case 5:
					ageRead(); // 연령별 사용 가능한 장난감 리스트 조회하기
					break;
				case 6:
					toyMCreate(); // 재료 추가
					break;
				case 7:
					toyMDelete(); // 재료 삭제
					break;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("메뉴에 있는 번호를 입력해주세요.");

				}

			} while (menuNum != 0);

		} catch (Exception e) {
			System.out.println("예외발생");
			e.printStackTrace();

		}

	}

	/**
	 * 전체 장난감 목록 조회하기
	 * 
	 * @author 내비게이터: 백진현 , 드라이버: 박세현
	 */
	public void read() {
		List<Object> toyList = new ArrayList<>(toySet);

		System.out.println("<전체 장난감 목록>");

		for (int i = 0; i < toySet.size(); i++) {

			System.out.print(i + 1 + ". " + toyList.get(i));

		}

	}

	/**
	 * 장난감 생성하기
	 * 
	 * @author 내비게이터 박세현, 드라이버 백진현
	 */
	public void create() {

		System.out.println("<새로운 장난감 추가>");
		String nameC = null;

		for (Toy t : toySet) {
			System.out.print("장난감 이름:");
			nameC = sc.next();
			if (t.getToyName().equals(nameC)) {
				System.out.println("이미 등록된 장난감입니다.");
			} else {
				break;
			}
		}

		System.out.print("사용 가능 연령:");
		int ageC = sc.nextInt();

		System.out.print("가격:");
		int priceC = sc.nextInt();
		sc.nextLine();

		System.out.print("색상:");
		String colorC = sc.next();

		System.out.print("제조일(YYYYMMDD 형식으로 입력):");
		String manufactureDateC = sc.next();

		String input = null;
		Set<String> toyMC = new HashSet<String>();
		boolean flagC = false;

		do {
			System.out.print("재료를 입력하세요(종료하려면'q'를 입력하세요):");
			input = sc.next();

			for(Map.Entry<Integer, String> entry : toyMList.entrySet()) {
				String value = entry.getValue();
				if(value.equals(input)) {
					toyMC.add(value);
					flagC = true;
					break;
				}
			}
			if(!flagC) {
				System.out.println("존재하지 않는 재료입니다. 다시 입력해주세요!!");
			}
			

		} while (!input.equals("q"));

		toySet.add(new Toy(nameC, ageC, priceC, colorC, manufactureDateC, toyMC));
		System.out.println("새로운 장난감이 추가되었습니다.");
	}

	/**
	 * 장난감 삭제하기
	 * 
	 * @author 드라이버 백진현 내비게이터 박세현
	 */
	public void delete() {
		System.out.print("삭제할 장난감의 이름을 입력하세요:");
		String inputD = sc.nextLine();

		for (Toy t : toySet) {
			if (t.getToyName().equals(inputD)) {
				toySet.remove(t);
				System.out.println("장난감이 삭제되었습니다.");
				break;
			} else {
				System.out.println("등록된 장난감을 입력해주세요!");
				break;
			}
		}

	}

	/**
	 * 제조일 순으로 장난감 정렬
	 * 
	 * @author 드라이버 백진현 내비게이터 박세현
	 */
	public void dateRead() {
		System.out.println("<제조일 순으로 장난감을 정렬>");

		List<Toy> toyRList = new ArrayList<>(toySet);
		Collections.sort(toyRList, new Comparator<Toy>() {

			@Override
			public int compare(Toy o1, Toy o2) {
			
				return o1.getManufactureDate().compareTo(o2.getManufactureDate());
			}
		});
		int index = 1;
		for(Toy toy : toyRList) {
			System.out.println(index + ". " + toy);
			index++;
		}

	}

	/**
	 * 연령별로 사용 가능한 장난감
	 * 
	 * @author 드라이버 백진현 내비게이터 박세현
	 */
	public void ageRead() {
		System.out.println("<연령별로 사용 가능한 장난감>");
		List<Toy> ageList = new ArrayList<>(toySet);
		ageList.sort(Comparator.comparingInt(Toy::getAge));

		int a = 1; // 같은 연령일때 구분하기 위한 변수(순서)
		int b = 0; // 같은 연령인지 구분하기 위한 변수

		for (Toy t : ageList) {
			if (b != t.getAge() && b > t.getAge()) {
				System.out.println("[연령 " + t.getAge() + "세]");
				System.out.println(a + ". " + t);
				a++;
				b = t.getAge();

			} else if (t.getAge() == b) {
				System.out.println(a + ". " + t);
				a++;

			} else if (t.getAge() > b) {
				a = 1;
				System.out.println("[연령 " + t.getAge() + "세]");
				System.out.println(a + ". " + t);
				a++;
				b = t.getAge();
			}

		}
	}

	/**
	 * 재료 추가
	 * 
	 * @author 드라이버 박세현 내비게이터 백진현
	 */
	public void toyMCreate() {
		boolean flag = true;

		System.out.println("<재료 추가>");

		do {
			System.out.println("===현재 등록된 재료===");
			for (int i = 1; i <= toyMList.size(); i++) {
				System.out.println(i + ": " + toyMList.get(i));
			}

			System.out.println("==================");

			System.out.print("재료 고유 번호(key) 입력 : ");
			int keyM = sc.nextInt();
			sc.nextLine();

			System.out.print("재료명 입력: ");
			String valueM = sc.next();

			for (int i : toyMList.keySet()) {
				if (i == keyM) {
					System.out.println("해당 키에 재료가 등록되어 있습니다.");
					System.out.print("덮어쓰시겠습니까?(Y/N): ");
					char ck = sc.next().charAt(0);

					if (ck == 'y' || ck == 'Y') {
						toyMList.replace(keyM, valueM);
						System.out.println("재료가 성공적으로 덮어쓰기 되었습니다.");
					} else if (ck == 'n' || ck == 'N') {
						System.out.println("덮어쓰기를 취소했습니다.");
					}
					flag = false;
					break;
				}

			}
			toyMList.put(keyM, valueM);
			System.out.println("새로운 재료가 성공적으로 등록되었습니다.");

			flag = false;
		} while (flag);
	}

	public void toyMDelete() {
		System.out.println("<재료 삭제>");
		boolean flag = false;

		System.out.println("===현재 등록된 재료===");
		for (int i = 1; i <= toyMList.size(); i++) {
			System.out.println(i + ": " + toyMList.get(i));
		}

		System.out.println("==================");

		System.out.print("삭제할 재료명 입력 : ");
		String valueD = sc.nextLine();

		Iterator<Map.Entry<Integer, String>> itD = toyMList.entrySet().iterator();
		while (itD.hasNext()) {
			Map.Entry<Integer, String> enT = itD.next();
			if (enT.getValue().equals(valueD)) {
				itD.remove();
				flag = true;
			}
		}

		if (flag) {
			System.out.println("재료 '" + valueD + "'가 성공적으로 제거되었습니다.");
		} else {
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		}

	}
}
