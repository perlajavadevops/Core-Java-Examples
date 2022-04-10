
class RunnableA implements Runnable{
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
}
public class RunnableDemo1 {

	public static void main(String[] args) {
		RunnableA runnableA = new RunnableA();
		Thread th1 = new Thread(runnableA);
		th1.start();
	}
}
