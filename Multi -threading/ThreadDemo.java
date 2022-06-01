package multithreading_SW39;
public class ThreadDemo extends Thread{
	public static void main(String[] args) {
		
		Thread t=Thread.currentThread();
		System.out.println("Name is:"+t.getName() );
		
		System.out.println(" ===application started===");	
		for (int i = 1; i < 4; i++) {
			System.out.println(" downloading file "+i+"from server");	}
		System.out.println(" ===job 1 compeleted execution ===");	
		System.out.println(" === job 2 started ===");	
		for (int i = 1; i < 4; i++) {
			System.out.println(" uploading  file "+i+"from server");	}
		System.out.println(" ===application ended ===");}}
