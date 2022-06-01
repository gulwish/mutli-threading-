package multithreading_SW39;
 class  ChildThread extends Thread { 
	//override run() 
	    public void run(){
	     System.out.println("MyClass running");
	   }
	}
public class ThreadDemo2 { 
		public static void main (String args[]) {
		//main thread
		//Create object  of  child thread
		ChildThread  A = new ChildThread();
		//invoke start() using the obj 
		A.start();
		}
}


