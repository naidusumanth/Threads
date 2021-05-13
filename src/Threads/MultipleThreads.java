package Threads;

class Threads implements Runnable {
	

	@Override
	public void run() {
	 
		for(int i=0;i<=4;i++) {
			
	System.out.println("Threads");

	}
	  }
	    }
	
   

	public class MultipleThreads  {

		public static void main(String[] args) {
			
			MultyThread a1=new MultyThread();
			 
			 Thread a2=new Thread(a1);
			 
			 a2.start();
			 
			 for(int i=0;i<=4;i++)
			 {
			 System.out.println("Threading");
			 }

		}

}
