class ThreadA extends Thread{

	@Override
	public void run() {//Runnable state
		
		/*try {
			Thread.sleep(1000);//1seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
}

class ThreadB extends Thread{

	@Override
	public void run() {//Runnable state
		
		/*try {
			Thread.sleep(10000);//10seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		for (int i = 5; i < 10; i++) {
			System.out.println(i);
		}
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
		ThreadA threadA = new ThreadA();//new state
		//threadA.run();
		//threadA.setName("Manasi");//5
		
		threadA.start();
		//threadA.setPriority(2);
		//threadA.join();//
		//System.out.println(threadA.getName());
		
		//System.out.println("ThreadA pro : "+threadA.getPriority());
		//threadA.start();//starting thread in second time is not possible
		ThreadB thread1 = new ThreadB();//new state
		thread1.setDaemon(true);//LOW priority
		//thread1.setName("Dhatrika");
		thread1.start();// Join which allows to wait threadB until threadA completed the task
		System.out.println("Is thread Daemon? "+thread1.isDaemon());
		//thread1.setPriority(6);

		//System.out.println(thread1.getName());
		//System.out.println("ThreadB pro : "+thread1.getPriority());

		//threadA = null;//terminate//Thread-0,Thread-1, Thread-2
	}
}
