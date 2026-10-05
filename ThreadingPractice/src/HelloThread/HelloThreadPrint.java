package HelloThread;

public class HelloThreadPrint extends Thread{
	@Override
	public void run() {
		System.out.println("Hello "+Thread.currentThread().getName());
	}
	public static void main(String [] args) {
		System.out.println(Thread.currentThread().getName());
		HelloThreadPrint p=new HelloThreadPrint();
		Thread t1=new Thread(p);
		t1.start();
		
	}
}
