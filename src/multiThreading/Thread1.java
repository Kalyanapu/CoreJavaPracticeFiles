package multiThreading;

public class Thread1 implements Runnable {

	MultiplicationTableDemo table;

	public Thread1(MultiplicationTableDemo table) {
		this.table = table;
	}

	@Override
	public void run() {
		table.printTable(10);

	}

}
