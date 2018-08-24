
public class ThreadA {
	
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		
		b.start();
		
		synchronized (b) {
			
			try {
				System.out.println("b 가 완료될때 까지 기다립니다.");
				b.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("TOTAL is : " +b.total);
		}
	}

}
