
public class JoinExam {

	public static void main(String[] args) throws InterruptedException {
		MyThred myThred = new MyThred();
		
		myThred.start();
		
		System.out.println("���� ������ ���� ");
		
		
		myThred.join(); //�����尡 ���⶧ ����
		
		
		System.out.println("���� ������ ���� ");
	}
}
