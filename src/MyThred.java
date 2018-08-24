
public class MyThred extends Thread {
	
	public void run() {
		
		for (int i=0; i < 5; i++) {
			System.out.println("my thred = " + i);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
	
	

}
