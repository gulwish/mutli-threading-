package Threading_sw39;
class TestMultiPriority1 extends Thread{  
	 public void run(){  
	   System.out.println("running thread name is:"+Thread.currentThread().getName());  
	   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
	  
	  }  }
public class ThreadPrior {
	 public static void main(String args[]){  
		  TestMultiPriority1 m1=new TestMultiPriority1();  
		  m1.setName(" doc1");
		  m1.start();  
		 
		  TestMultiPriority1 m2=new TestMultiPriority1();  
		  m2.setName(" doc2");
		  m2.start();  
		  m1.setPriority(Thread.MIN_PRIORITY);  
		  m2.setPriority(Thread.MAX_PRIORITY);  //run first   
		   
		 }  
}
