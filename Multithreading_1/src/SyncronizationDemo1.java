class Table{
	
	public  void printTable(int number){
		
		synchronized(this){
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (int i = 1; i <=5; i++) {
				System.out.println(number*i);
			}
		}
		
		for (int i = 90; i < 100; i++) {
			System.out.println(i);
		}
		
	}
}

class ThreadE extends Thread{
	
	Table table;
	
	ThreadE(Table table){
		this.table = table;
	}
	
	@Override
	public void run() {
		table.printTable(10);
	}
}

class ThreadF extends Thread{
	
	Table table;
	
	ThreadF(Table table){
		this.table = table;
	}
	
	@Override
	public void run() {
		table.printTable(100);
	}
}
public class SyncronizationDemo1 {

	public static void main(String[] args) {
		Table table = new Table();
		ThreadE threadE = new ThreadE(table);
		threadE.start();
		
		ThreadF threadF = new ThreadF(table);
		threadF.start();
	}
}
