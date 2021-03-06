package nextstep.camp.courses;

public class GuguClass {

	public static int[] calculate(int times) {
		int[] result = new int[9];

		for (int i = 0; i < result.length; i++) {
			// 계산 결과를 배열에 저장
			result[i] = (times * (i + 1));
		}

		return result;
	}

	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			// 계산 결과를 화면에 출력
			// System.out.println(result[i]);
			System.out.println(result[0] + "*" + (i + 1) + " = " + result[i]);
		}
	}

}
