package edu.kh.oaarr.run;

import edu.k.oaarr.model.service.MemberService;

public class MemberRun {

	public static void main(String[] args) {
		
		MemberService service = new MemberService();
		service.displayMenu();
		
	}

}
