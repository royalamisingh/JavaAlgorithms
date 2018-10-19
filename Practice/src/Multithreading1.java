public class Multithreading1 extends Thread{
	MyName t;
	Multithreading1(MyName m){
		t=m;
	}
	public void run(){t.printTable(10);}
}