package nextstep.camp.courses;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		System.out.println("������ �� ����� ����? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("number : " + number);
		if (number < 2) {
			System.out.println("2 ���ϰ��� ��� �Ұ�");
		} else if (number > 10) {
			System.out.println(" 10 �̻� ���� �������� �ƴմϴٿ�");
		} else {
			for (int i = 1; i <= 9; i++) {
				System.out.println(number + " * " + i + "= " + number * i);
			}
		}

		// int result = number * 1;
		// ������ ����ϴ� ���� ����
	}

}
