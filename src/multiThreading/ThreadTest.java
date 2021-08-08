package multiThreading;

public class ThreadTest {

	public static void main(String[] args) {
		MultiplicationTableDemo d=new MultiplicationTableDemo();
		Thread1 t=new Thread1(d);
		Thread th=new Thread(t);
		th.start();
		Thread2 t2=new Thread2(d);
		Thread th2=new Thread(t2);
		th2.start();

	}

}
