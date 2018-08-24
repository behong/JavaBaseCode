package nextstep.camp.courses;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("number : " + number);
		if (number < 2) {
			System.out.println("2 이하값은 계산 불가");
		} else if (number > 10) {
			System.out.println(" 10 이상 값은 구구단이 아닙니다요");
		} else {
			for (int i = 1; i <= 9; i++) {
				System.out.println(number + " * " + i + "= " + number * i);
			}
		}

		// int result = number * 1;
		// 구구단 출력하는 예제 구현
	}

}
