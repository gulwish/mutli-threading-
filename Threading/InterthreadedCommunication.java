package Threading_sw39;

import java.util.Scanner;
class Machine{  
boolean button=true;  
  
synchronized void start(boolean b ){  
System.out.println("going to start machine ...");  
  
if(this.button!=true){  
//System.out.println("no electricity  waiting for current ...");  
System.out.println(" waiting ;to on ");
try{wait();}catch(Exception e){}  
}  
this.button=true;  
System.out.println("machine satrted ..");  
}  
  
synchronized void deposit(boolean True){  
System.out.println("going to on   ...");  
this.button= True;  
System.out.println("button on now  ... ");  
notify();  
}  
}  

/*class CofffeeMaker{  
 private int timer;
 
 public int  set_get_Timer(int Elapsed_time) {//setters
		this.timer =Elapsed_time ;
		return timer;
	}  
synchronized void IsTimeSet(int entered_time){  
System.out.println("going to start making coffee");  
int t = 0 ;
if(this.timer!=set_get_Timer(t)){  
	System.out.println(" no time has set ; waiiting to start making coffee");
try{
	wait();
}
catch(Exception e){}  
}  

System.out.println("coffee is ready ...");  
}  
  


synchronized void SetTimer(int Elapsed_time ){  
System.out.println("going to set time...");  
this.timer=Elapsed_time;  
System.out.println("time  has been set... ");  
notify();  
}

}  
*/
public class InterthreadedCommunication {
	public static void main(String args[]){  
	/*	Scanner sc = new Scanner(System.in);
		 int time_entry=sc.nextByte();
		System.out.println(" set time>>  "+time_entry)
		final CofffeeMaker maker1=new CofffeeMaker();  
		new Thread(){  
		public void run()
		{maker1.set_get_Timer(time_entry);}  
		}.start();  
		new Thread(){  
		public void run(){maker1.SetTimer(60);}  
		}.start();  
		*/
		Machine machine1 new Machine();
		Thread t1= new Thread();
}}
