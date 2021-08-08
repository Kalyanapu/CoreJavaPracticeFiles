package multiThreading;

public class ThreadDemo extends Thread {
	
	@Override
	public void run() {
		System.out.println("in the run method");
	}
	public static void main(String[] args) {
		ThreadDemo thread=new ThreadDemo();
		thread.start();
	}

}
