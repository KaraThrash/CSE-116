
public class multithread extends Thread
{
	public double[] myarray;
	public multithread(double[] arrtorun)
	{
		myarray = arrtorun;
	}
	public void run()
    {
        try
        {
        	int low = 0;
    		int high = myarray.length - 1;
        	Main.quickSort(myarray, low, high);
        	

           // System.out.println(myarray[0]);
  	     // System.out.println(myarray[1]);
//  	      System.out.println(myarray[2]);
//  	      System.out.println(myarray[3]);
//  	      System.out.println(myarray[4]);
//  	      System.out.println(myarray[5]);
//
//	      System.out.println(myarray[495]);
//	      System.out.println(myarray[496]);
//	      System.out.println(myarray[497]);
	   //   System.out.println(myarray[498]);
	     // System.out.println(myarray[499]);
//            for (int i=0; i<20; i++)
//            {
//            	   //System.out.println (i);
//            	   System.out.println ("Thread " +
//                           Thread.currentThread().getId() +
//                           " is running" + i);
//            	   Thread.sleep(300);
//            }
 
        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception! could not start thread");
        }
        
    }
}