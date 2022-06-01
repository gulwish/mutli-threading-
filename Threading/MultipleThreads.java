package Threading_sw39;
import java.util.Iterator;
//Mythread
  class MusicPlayer extends Thread{
	public     void run(){
		System.out.println("  is mp3 on>>"+Thread.currentThread().isAlive());
	}
	}

//ChildThreadA
class  PalyingSongs extends MusicPlayer implements Runnable{
	public void run() {
		for (int i = 1; i < 4; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(" playing song "+i);
		}
	}
}

//ChildThreadB
class  ManagingPlaylists extends MusicPlayer implements Runnable{
	public void run() {
		for (int j = 1; j <5; j++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(" updating playlist  "+j);
		}
		System.out.println("  playlist updated >>task2 completed" );}	
	}
class  ChildThreadC extends Thread{
	public void run() {
		for (int j = 1; j <5; j++) {
		System.out.println(" downloading songs   "+j);
		}
		System.out.println("  task1 completed  >> songs downloaded" );}		
}
public class MultipleThreads {

	public static void main(String[] args) {
		MusicPlayer  mp3 = new MusicPlayer();
		mp3.start();
		System.out.println("  music palyer is  in process");
	
		ChildThreadC task1 = new ChildThreadC();
		task1.start();
		ManagingPlaylists  task2   =new ManagingPlaylists();
		task2.start();
		PalyingSongs task3= new PalyingSongs();
		task3.start();
		//task1.setPriority(Thread.MAX_PRIORITY);
/*try {
	task3.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
}
*/


System.out.println("  music palyer is  stopped");
	}

}
