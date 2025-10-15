package edu.ke.io.pack2.run;

import edu.ke.io.pack2.model.service.ByteService;

public class ByteRun {

	public static void main(String[] args) {
		// 불변성(Immutable)의 String
		
//		// 1. new 연산자
//		String str1 = new String("Hllo");
//		String str2 = new String("hell0");
//		System.out.println(System.identityHashCode(str1)); // 925858445
//		System.out.println(System.identityHashCode(str2)); // 798154996
//
//		// 2. 리터럴 표기법
//		String str3 = "Hello";
//		String str4 = "Hello";
//		System.out.println(System.identityHashCode(str3)); // 681842940
//		System.out.println(System.identityHashCode(str4)); // 681842940
//		// String 성수 풀
//		
//		str3 = str3 + "world";
//		System.out.println(System.identityHashCode(str3)); //468121027
//		
//		
//		// 가변성(Mutable)의 StringBuilder, StringBuffer
//		StringBuilder sb = new StringBuilder();
//		System.out.println(System.identityHashCode(sb)); // 1804094807
//		
//		sb.append("Hello world!");
//		sb.append("12345");
//		System.out.println(sb);
//		System.out.println(System.identityHashCode(sb)); // 1804094807
		
		ByteService service = new ByteService();
		//service.fileByteOutput();
		//service.bufferedFileOutput();
		//service.fileByteInput();
		service.fileCopy();
		
		
	}

}
