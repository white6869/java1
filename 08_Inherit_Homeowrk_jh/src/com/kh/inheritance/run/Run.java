package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone("Samsung", "Galaxy S20", 2020, 1200000, "Android", 128);
		
		sp.printInfo();
		BasicPhone bs = new BasicPhone();
		bs = new BasicPhone("Nokia", "3310", 2000, 1000000, true);

	}

}
