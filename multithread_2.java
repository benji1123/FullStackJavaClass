package udemy_oop.main;

public class Count implements Runnable{
	public void run() {
		try {
			for(int i=0; i<=10; i++) {
				System.out.println("Count: " + i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e){
			System.out.println("count-thread interruptted");			
		}
		System.out.println("count-thread terminated");
	}
	public static void main(String args[]) {
		Count obj = new Count();
		Thread t = new Thread(obj);
		t.start();
		
		try {
			while(t.isAlive()) {
				System.out.println("main thread");
				Thread.sleep(2000);
			}
		} catch(InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		System.out.println("main thread terminated");
	}
}

/*
Output:
Time		Output
-------------------------------
0			main thread
0			Count: 0
1000		Count: 1
2000		main thread
2000		Count: 2
3000		Count: 3
4000		main thread
4000		Count: 4
5000		Count: 5
6000		main thread
6000		Count: 6
7000		Count: 7
8000		main thread
8000		Count: 8
9000		Count: 9
10,000		main thread
10,000		Count: 10
11,000		count-thread terminated
12,000		main thread terminated
*/
