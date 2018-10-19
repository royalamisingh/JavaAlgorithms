
public class TestSynchronization {

	public static void main(String[] args) {
		MyName name = new MyName();
		MyName name1 = new MyName();
		Multithreading m = new Multithreading(name);
		Multithreading m2 = new Multithreading(name);
		Multithreading1 m1 = new Multithreading1(name);
		m.start();

		m2.start();
		m1.start();
	}

}
