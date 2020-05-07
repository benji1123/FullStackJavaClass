// EXAMPLE 1
// https://beginnersbook.com/2013/03/multithreading-in-java/

public class Count extends Thread {
	Count(){
		super("my extending thread");
		System.out.println("my thread created " + this);
		start();
	}
	public void run() {
		try {
			for(int i=0; i<=10; i++) {
				System.out.println("Count: " + i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {
			System.out.println("Thread interrupted");
		}
		System.out.println("Thread run over");
	}
}


class ExtendingExample{
	public static void main(String[] args) {
		Count cnt = new Count();
		try {
			while(cnt.isAlive()) {
				System.out.println("Main thread");
				Thread.sleep(1500);
			}
		} catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread over");

		// example of Thread obj
		Thead t = new Thread(obj);
		t.start();
	}
}

/*
Output:
Time		Output
-------------------------------
0			Main thread
0			Count: 0
1000		Count: 1
1500		Main thread
2000		Count: 2
3000		Main thread
3000		Count: 3
4000		Count: 4
4500		Main thread
5000		Count: 5
6000		Main thread
6000		Count: 6
7000		Count: 7
7500		Main thread
8000		Count: 8
9000		Main thread
9000		Count: 9
10,000		Count: 10
10,500		Main thread
11,000		Thread run over
12,000		Main thread over
*/



// EXAMPLE 2
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
