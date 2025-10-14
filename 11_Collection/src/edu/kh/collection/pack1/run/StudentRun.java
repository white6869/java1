package edu.kh.collection.pack1.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.kh.collection.pack1.model.service.StudentService;

public class StudentRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new StudentService().ex();
		
		StudentService service = new StudentService();
		service.displayMenu();
		
//		List<Integer> numberList = new ArrayList<>();
//		
//		numberList.add(5); // 0
//		numberList.add(3); // 1
//		numberList.add(1); // 2
//		numberList.add(4); // 3
//		numberList.add(2); // 4
//		// [5, 3, 1, 4, 2]
		
		// Integet는 이미 Comparable을 상속받아 comparerTo() 정의함
//		Collections.sort(numberList);
//		
//		System.out.println(numberList);
	}

}
