
public class threadPriority extends Thread{

	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
	}
	
	public static void main(String[] args) {
		
		ThreadGroup grp = new ThreadGroup(null);
		threadPriority p1 = new threadPriority();
		
		Thread the =new Thread(new threadPriority());
		
		threadPriority p2 = new threadPriority();
		
		p1.setPriority(Thread.MAX_PRIORITY);
		p2.setPriority(Thread.MIN_PRIORITY);
		
		p2.start();
		p1.start();
	}
	
	
}
