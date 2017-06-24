
public class IncrementSynchronize {
	
	private int value = 0;
	
	public synchronized int getNextValue() {
		return value++;
	}
	
	
	public int getNextValue() {
		synchronized (this) {
			return value++;
		}
	}
	
	private final Object lock = new Object();
	public int getNextValue() {
		synchronized (lock) {
			return value++;
		}
	}
	
}
