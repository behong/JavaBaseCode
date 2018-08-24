
public class JoinExam {

	public static void main(String[] args) throws InterruptedException {
		MyThred myThred = new MyThred();
		
		myThred.start();
		
		System.out.println("메인 스레드 시작 ");
		
		
		myThred.join(); //스레드가 멈출때 까지
		
		
		System.out.println("메인 스레드 종료 ");
	}
}
