package com.calc.test;

import java.util.Scanner;

public class Calc {

	public static Scanner Scanner;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ù��° :");
		int first = scanner.nextInt();
		int rtn =0;
		
		while (true) {

			System.out.println("��ȣ : ");
			String symbol = scanner.next();
			System.out.println("�ι�° :");
			int second = scanner.nextInt();			

			if (symbol.equals("exit")) {
				break;
			}

			if(symbol.equals("+")) {
				rtn = first + second;
				System.out.println("+  ���ϱ� �� �� " + rtn);
			}else if(symbol.equals("-")) {
				rtn = first - second;
				System.out.println("-  ���� �� �� " + rtn);			
			}else if(symbol.equals("*")) {
				rtn = first * second;
				System.out.println("-  ���� �� �� " + rtn);			
			}else if(symbol.equals("/")) {
				rtn = first / second;
				System.out.println("-  ������ �� �� " + rtn);			
			}

		}

	}

}
