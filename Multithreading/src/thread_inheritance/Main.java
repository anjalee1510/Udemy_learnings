package thread_inheritance;

public class Main {
	public static void main(String[] args) {
		// Creating the first athlete thread
//		Thread firstAthlete=new Thread(()->
//		{
//			int bibNumber=84921;
//			runRace(bibNumber);
//		});
//		
//		// Creating the second athlete
//		Thread secondAthlete =new Thread(()->{
//			int bibNumber=224455;
//			runRace(bibNumber);
//		});
//		
		AthleteThread firstAthlete=new AthleteThread("Tony Stark",Thread.MAX_PRIORITY,84921);
		AthleteThread secondAthlete=new AthleteThread("Pepper Potts",Thread.MIN_PRIORITY,22445);
		
		firstAthlete.start();
		secondAthlete.start();
	}

//	private static void runRace(int bibNumber) {
//		// TODO Auto-generated method stub
//		double distanceKM=10;
//		double steps=0.00000001;
//		
//		for(double i=0;i<=distanceKM;i+=steps) {
//			if(Math.abs(i-distanceKM)<steps) {
//				System.out.println("\nAthlete number "+bibNumber+" has finished the race.\n");
//				break;
//			}
//		}
//		
//	}

}
