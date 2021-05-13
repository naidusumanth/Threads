package Threads;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class College implements Serializable {
	    
		String name;
	    int Rank;
	    static String number;
	    College(String n, int i, String c)
	    {
	    this.name = n;
	    this.Rank = i;
	    this.number = c;
	    }
	}


	public class Serialization {

		public static void main(String[] args) {
			
			try
	        {
	            College c1 = new College("Adityacollegeofengineering", 8, "9010621036");
	            
	            FileOutputStream fos = new FileOutputStream("data.txt");
	            
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            
	            oos.writeObject(c1);
	            
	            oos.close();
	        }
	        catch (Exception e)
	        {
	            System.out.println(e);
	            
	            
	        }

		}

}
