package nextstep.camp.courses;

public class GuGuMethod {
	
	  public static int[] calculate(int times) {
	      int[] result = new int[9];

	      for (int i = 0; i < result.length; i++) {
	          // 계산 결과를 배열에 저장
	    	  result[i]  = (times * (i+1));
	      }

	      return result;
	  }

	  public static void print(int[] result) {
	      for (int i = 0; i < result.length; i++) {
	          // 계산 결과를 화면에 출력
	    	  //System.out.println(result[i]);
	    	  System.out.println(result[0] + "*" + (i+1) + " = " + result[i]);
	      }
	  }

	  public static void main(String[] args) {
	      for (int j = 2; j < 10; j++) {
	          // calculate와 print 메소드 활용해 구구단 구현하기
	    	  print ( calculate(j) );
	      }
	  }
	}