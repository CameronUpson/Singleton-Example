/**
 * @author Cameron Upson
 */
public class Singleton implements Runnable {

	public static volatile Singleton instance = null;
	
	private Singleton() {
		System.out.println("First");
	}
	
	@Override
	public void run() {
		System.out.println("Second");
	}
	
	public static synchronized Singleton getInstance() {
		return instance != null ? instance : (instance = new Singleton());
	}
	
	public static void main(String... args) {
		new Thread(getInstance()).start();
	}

}
