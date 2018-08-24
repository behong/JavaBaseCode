
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
		
		//메서드만 전달할수 없을까...
		// 객체를 생성해서 전달해야만 함
		
		new Thread(()->{
			for(int i=0; i <11; i++) {
				System.out.println("lamda " + i);
			}
		}).start();
	}

}
