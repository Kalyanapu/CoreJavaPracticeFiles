package multiThreading;

public class RunnableInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("in the run method");

	}
	public static void main(String[] args) {
		RunnableInterface r=new RunnableInterface();
		Thread thread1=new Thread(r);
		thread1.start();
	}

}
