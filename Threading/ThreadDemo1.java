package Threading_sw39;
class MyThread extends Thread{
	public     void run(){
	
		System.out.println("==status  of== "+Thread.currentThread().getName()+Thread.currentThread().isAlive());
		 System.out.println("saving ..."+Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getName()+" saved ");}
	}
public  class ThreadDemo1 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread(); //create 
		t1.start();// start 
		t1.setName("file1:");// name 
		MyThread t2 =new MyThread();//same 
	//	t2.start();
		t2.setName("file2:");
		MyThread t3 = new MyThread(); //create 
		//t3.start();// start 
		t3.setName("file3:");// name 
			
		try
		{
			t1.join();
			
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage()+" stop");
		}
		t2.start();
		t3.start();
		System.out.println("==is  == "+t1.getName()+ "alive "+t2.isAlive());
		System.out.println("==is  == "+t2.getName()+ "alive "+t2.isAlive());
		System.out.println("==is  == "+t3.getName()+ "alive "+t2.isAlive());
		
		}}
	
	
	
	
	
	
	
	
	
	
	
	
	