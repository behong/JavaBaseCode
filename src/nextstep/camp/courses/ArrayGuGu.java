package nextstep.camp.courses;

public class ArrayGuGu {
    public static void main(String[] args) {
        int[] result = new int[9];
        //2 단 출력
        int two = 2;
        for(int i=1; i <= result.length; i++) {
            // 계산 결과를 배열에 저장
        	result[i-1] = (two * i);
        	//System.out.println(result[i-1] = (two * i) );
        }

        for(int i=0; i < result.length; i++) {
           // 계산 결과를 화면에 출력
        	System.out.println(two + " * " + (i+1) + "= " + result[i]);
        }
    }
}
