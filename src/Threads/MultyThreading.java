package Threads;

class MultyThread extends Thread{

		public void fun() {
			
	 for(int i=0;i<=4;i++) {
		 
	System.out.println("Threads");
	}

		}
	}

	public class MultyThreading {

		public static void main(String[] args) {
			
			
			 MultyThread t1=new MultyThread();
			 t1.fun();
			
			  for(int i=0;i<=4;i++)
			 {
			 System.out.println(" Threading");

		}

	}
	

	}
	
