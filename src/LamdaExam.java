
public class LamdaExam {
	
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i< 10; i++) {
					System.out.println("hello  " + i);
				}
				
			}
		}).start();
		
		//�޼��常 �����Ҽ� ������...
		// ��ü�� �����ؼ� �����ؾ߸� ��
		
		new Thread(()->{
			for(int i=0; i <11; i++) {
				System.out.println("lamda " + i);
			}
		}).start();
	}

}
