package edu.kh.exception.run;

import edu.kh.exception.mdoel.service.ExceptionService;
import edu.kh.exception.mdoel.service.UserException;

public class ExceptionRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new ExceptionService().ex1();
		//new ExceptionService().ex2();
		//new ExceptionService().ex3();
		//new ExceptionService().ex4();
		
		
		try {
			new ExceptionService().ex5();
		} catch (UserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
