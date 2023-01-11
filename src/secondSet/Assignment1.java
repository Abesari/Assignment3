package secondSet;

public class Assignment1 {
	private volatile static Assignment1 Singleton;
	
	private Assignment1() {}
	
	public static Assignment1 getSingleton() {
		if(Singleton == null) {
			synchronized (Assignment1.class) {
				if (Singleton == null) {
					Singleton = new Assignment1();
				}
			}
		}
		return Singleton;
	}
	
}