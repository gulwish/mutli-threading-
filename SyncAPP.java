package Threading_sw39;
class  WaterMachine implements Runnable{
	@Override
	public  synchronized  void run() {
		for (int i = 1; i < 5; i++) {
		System.out.println(Thread.currentThread().getName()+" executing  "+i+" sec"  );
		//super.run();
		}
		System.out.println( Thread.currentThread().getName()+"completed execution!!  ");
	}
}

public class SyncAPP {
	public static void main(String[] args) {
		
		WaterMachine machine= new WaterMachine();// machine a shared resource 
		//working on single object "' Machine ""
		Thread task1= new Thread(machine, "hot water ");
		Thread task2= new Thread(machine, " cold water ");
		task1.start();
		task2.start();
	}

}
