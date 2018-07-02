
public class Main  {
	public static multithread t1;
	public static multithread t2;
	public static void quickSort(double[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		double pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
				
			}
 
			if (i <= j) {
				double temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
}
	public static void main(String[] args) 
	{
		//t = new Thread();
		//t2 = new Thread();


		

		
//		int size = 100;
	//int size = 1000;
		int size = 10000;
		//int size = 100000;
//		int size = 1000000;
//		int size = 10000000;
		
		int low = 0;
		int high = size - 1;
		
		double[] ArrayToBeSorted = new double[size/2];
		double[] ArrayToBeSorted2 = new double[size/2];
		double[] solosortedarray = new double[size];
		
		double temparrayvalue = 0;
		double temppivot = 0.5;
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < size/2 || j < size/2)
		{
			temparrayvalue = Math.random( );
			//System.out.println(temparrayvalue);
			if(temppivot > temparrayvalue)
			{
				if(i < size/2)
				{ArrayToBeSorted[i] = temparrayvalue; i++;}
			}
			else
			{
				if(j < size/2)
				{ArrayToBeSorted2[j] = temparrayvalue;j++;}
				
			}
			if(k < size)
			{solosortedarray[k] = temparrayvalue; k ++;}
			
		}

		long time1 = System.nanoTime();
		quickSort(solosortedarray, low, high);
		
		long elapsed1 = System.nanoTime() - time1;

System.out.println(elapsed1);
		
		
long time2 = System.nanoTime();
		  t1 = new multithread(ArrayToBeSorted);
		  t2 = new multithread(ArrayToBeSorted2);
	      t1.start();
	      
	      t2.start();
	
	      while(t2.isAlive() == true)
	      {
	    	  
	      }
	      
	  	long elapsed2 = System.nanoTime() - time2;
	  	System.out.println("time with one thread " + elapsed1 );
	  	System.out.println(" two threads took " + elapsed2);
	  	if(elapsed1 > elapsed2){	System.out.println("Two threads was faster by  " + (elapsed1 - elapsed2) );}
	  	else{System.out.println("One threads was faster by  " + (elapsed2 - elapsed1) );}
		double[] sortedarray = new double[size];
	      for (i = 0; i < size; i++)
	      {
	    	  if(i < size/2)
	    	  {
	    		  sortedarray[i] = t1.myarray[i];
	    	  }else
	    	  {
	    		  sortedarray[i] = t2.myarray[i - (size/2)];
	    	  }
	    	  
	    	  
	      }
	      
	      
	      
	      for (i = 0; i < size - 1; i++)
	      {
	    	 if(sortedarray[i] > sortedarray[i + 1])
	    	 { 
	    		 System.out.println("Found an element out of order at index: " + i);
	    		 System.out.println(sortedarray[i - 1]);
	    		 System.out.println(sortedarray[i]);
	    		 System.out.println(sortedarray[i + 1]);
	    	 }
	    	  
	    	  
	      }
	}


}
