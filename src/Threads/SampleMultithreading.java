package Threads;

public class SampleMultithreading {
	public static void main(String[] args) {

		 thread1 a=new thread1();
		 thread2 a1=new thread2();
		 thread3 a2=new thread3();
		 
		 a.start();
		 a1.start();
		 a2.start();
		 
		 for(int i=0;i<3;i++) {
		 System.out.println("surya");
		 }
	  }
	}
		class thread1 extends Thread {
		public void run() {
		
			for(int i=0;i<3;i++) {
				
		 System.out.println("sumanth");
		 }
	  }
	}
		class thread2 extends Thread {
		public void run() {
			
		for(int i=0;i<3;i++) {
			
		 System.out.println("raju");
		 }
	  }
	}
		class thread3 extends Thread {
		public void run() {
			
		for(int i=0;i<3;i++) {
			
		 System.out.println("Sumanth");
		 }

	}

}


