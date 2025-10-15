package edu.ke.io.pratice;

import java.io.Console;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Pratice {

	public void method1() {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void method2() {
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			while ((i = System.in.read()) != '\n') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void method3() {
		Console console = System.console();
		
		System.out.println("이름 :");
		String name = console.readLine();
		System.out.println("직업 :");
		String job = console.readLine();
		System.out.println("비밀번호 :");
		char[] pass = console.readPassword();
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}

	public void method4() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (NullPointerException e2) {
				System.out.println(e2);
			} catch (IOException e2) {
				System.out.println(e2);
			}
		}
		System.out.println("end");
	}

	public void method5() {
		try (FileInputStream fis = new FileInputStream("input.txt")) {
			int i;
			while ((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			System.out.println("end");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void method6() {
		FileOutputStream fis = null;
		
		try {
			fis = new FileOutputStream("/io_test/20251015/input2.txt");
			StringBuilder sb = new StringBuilder();
			sb.append("ABCDEFGHIJ");
			sb.append("KLMNOPQRST");
			sb.append("UVWXYZ");
			String content = sb.toString();
			byte[] bs = new byte[10];
			int i;
			while ((i = content.read(bs) != -1)) {
				for(byte b : bs) {
					System.out.println((char)b);
				}
				System.out.println(": " + i + "바이트 읽음");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
		
	}
}
