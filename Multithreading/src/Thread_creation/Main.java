package Thread_creation;

public class Main {
//	public static class ChildThreadTask implements Runnable{
//
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			count();
//			
//		}
//		
//	}
	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getName()+ " thread");
//		Thread childThread=new Thread(new ChildThreadTask());
		Thread childThread=new Thread(()-> count(), "child");
		childThread.start();
		count();
		
	}
	public static void count() {
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	}
	
	//output shows concurrency: how threads are switched bw main and child

}
