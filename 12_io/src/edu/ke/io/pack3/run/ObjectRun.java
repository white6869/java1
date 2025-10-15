package edu.ke.io.pack3.run;

import edu.ke.io.pack3.model.service.ObjectService;

public class ObjectRun {

	public static void main(String[] args) {
		ObjectService service = new ObjectService();
		service.objectOutput();
		service.objectInput();

	}

}
