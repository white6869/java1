package edu.kh.server.run;

import edu.kh.server.model.service.SeverService;

public class SeverServiceRun {

	public static void main(String[] args) {
		SeverService ss = new SeverService();
		ss.serverStart();
	}

}
