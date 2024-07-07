package thread_priority;

public class ThreadPriority {
	//Priority=Order+Length+Age+Urgency
	// Urgency=static- described in code
	
	public static void main(String[] args) {
		Thread t1=new Thread(()->count(), "Thread-1");
		Thread t2=new Thread(()->count(), "Thread-2");
		Thread t3=new Thread(()->count(), "Thread-3");
		//using code we manipulate the urgency factor to influence the priority of each thread
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		//setting priority merely influences priority. It does not guarantee anything
		t1.start();
		t2.start();
		t3.start();
	}
	
	public static void count() {
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+": "+i);
			if(!Thread.currentThread().getName().equals("Thread-1")) {
				Thread.yield();
				//Thread-2 & Thread-3 yield surrenders its CPU time in favor of Thread-1 execution
			}
					
		}
	}

}
