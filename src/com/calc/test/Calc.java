package com.calc.test;

import java.util.Scanner;

public class Calc {

	public static Scanner Scanner;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ã¹¹øÂ° :");
		int first = scanner.nextInt();
		int rtn =0;
		
		while (true) {

			System.out.println("±âÈ£ : ");
			String symbol = scanner.next();
			System.out.println("µÎ¹øÂ° :");
			int second = scanner.nextInt();			

			if (symbol.equals("exit")) {
				break;
			}

			if(symbol.equals("+")) {
				rtn = first + second;
				System.out.println("+  ´õÇÏ±â °á °ú " + rtn);
			}else if(symbol.equals("-")) {
				rtn = first - second;
				System.out.println("-  »¬»ù °á °ú " + rtn);			
			}else if(symbol.equals("*")) {
				rtn = first * second;
				System.out.println("-  °ö¼À °á °ú " + rtn);			
			}else if(symbol.equals("/")) {
				rtn = first / second;
				System.out.println("-  ³ª´°¼À °á °ú " + rtn);			
			}

		}

	}

}
