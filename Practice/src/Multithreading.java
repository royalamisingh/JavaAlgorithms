

public class Multithreading extends Thread{
	MyName t;
	Multithreading(MyName m){
		t=m;
	}
	public void run(){
		t.printTable(5);
	}


}