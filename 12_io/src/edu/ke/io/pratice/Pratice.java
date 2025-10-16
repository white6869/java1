package edu.ke.io.pratice;

import java.io.Console;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Iterator;

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
		
		try (FileInputStream fis = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];
			int i;
			
			while ((i = fis.read(bs)) != -1) {
				for(byte b : bs) {
					System.out.print((char)b);
				}
				System.out.println(": " + i + "바이트 읽음");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
		
	}

	public void method7() {
		try (FileOutputStream fos = new FileOutputStream("output.txt")) {
			fos.write(65);
			fos.write(66);
			fos.write(67);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
	
	public void method8() throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("output2.txt", true);
		try (fos) {
			byte[] bs = new byte[26];
			byte data = 65;
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
	
	public void method9() {
		try(FileOutputStream fos = new FileOutputStream("output3.txt")) {
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 24);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
