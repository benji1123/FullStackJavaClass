/*
Class
Door.java
*/
public class Door {
	private Lock lock;
	public Door() {
		this.lock = new Lock(true);		
	}
	public void checkOpen() {
		if(this.lock.getLock()) {
			System.out.println("Shop is closed");
		} else {
			System.out.println("Shope is open");
		}
	}
	// Inner Class
	private class Lock {
		private boolean lock;
		public Lock(boolean lock) {
			this.lock = lock;
		}
		public boolean getLock() {
			return this.lock;
		}
		public void setLock(boolean lock) {
			this.lock = lock;
		}
	}
}

/*
Demo
*/
public class Main {
	public static void main(String[] args) {
		Door frontdoor = new Door();
		frontdoor.checkOpen();
	}
}
/*  Output: 
 *  Shop is closed
 */