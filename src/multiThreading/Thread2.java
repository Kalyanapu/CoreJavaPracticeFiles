package multiThreading;

public class Thread2 implements Runnable {
	
	MultiplicationTableDemo table;
	
	public Thread2(MultiplicationTableDemo table) {
		this.table=table;
	}

	@Override
	public void run() {
		table.printTable(20);

	}

}
