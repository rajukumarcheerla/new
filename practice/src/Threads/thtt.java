package Threads;

public class thtt extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				char ch = (char) i;
				System.out.println(ch);
			}
		}
	}

}

class uuuuu extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}

class main {
	public static void main(String[] args) {
		thtt t = new thtt();
		uuuuu u=new uuuuu();
		t.start();
		u.start();
		

	}
}
