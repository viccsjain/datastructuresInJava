
public class SynchronizedMethod extends Thread {

	synchronized public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			try {
				wait();
				Thread.sleep(400);
				notifyAll();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		SynchronizedMethod obj = new SynchronizedMethod();
		Thread thread1 = new Thread(obj);
		Thread thread2 = new Thread(obj);

		thread1.start();
		thread2.start();
		

	}

}
