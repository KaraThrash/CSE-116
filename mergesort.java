
import java.util.Random;
public class mergesort {


	
	 public static void mergeSort(double[] inputArray) {
	        int size = inputArray.length;
	        if (size < 2)
	            return;
	        int mid = size / 2;
	        int leftSize = mid;
	        int rightSize = size - mid;
	        double[] left = new double[leftSize];
	        double[] right = new double[rightSize];
	        for (int i = 0; i < mid; i++) {
	            left[i] = inputArray[i];

	        }
	        for (int i = mid; i < size; i++) {
	            right[i - mid] = inputArray[i];
	        }
	        mergeSort(left);
	        mergeSort(right);
	        merge(left, right, inputArray);
	    }

	    public static void merge(double[] left, double[] right, double[] arr) {
	        int leftSize = left.length;
	        int rightSize = right.length;
	        int i = 0, j = 0, k = 0;
	        while (i < leftSize && j < rightSize) {
	            if (left[i] <= right[j]) {
	                arr[k] = left[i];
	                i++;
	                k++;
	            } else {
	                arr[k] = right[j];
	                k++;
	                j++;
	            }
	        }
	        while (i < leftSize) {
	            arr[k] = left[i];
	            k++;
	            i++;
	        }
	        while (j < rightSize) {
	            arr[k] = right[j];
	            k++;
	            j++;
	        }
	    }
		public static void main(String[] args) 
		{
			
			long time1 = System.nanoTime();

			

			
//			int size = 100;
//			int size = 1000;
			int size = 10000;
//			int size = 100000;
//			int size = 1000000;
//			int size = 10000000;
			
			int low = 0;
			int high = size - 1;
			
			double[] ArrayToBeSorted = new double[size];
			
			for (int i = 0; i < size; ++i)
			{
				ArrayToBeSorted[i] = ( Math.random( ));
			}
			
			mergeSort(ArrayToBeSorted);
			
			for (int i = 0; i < size-1; ++i)
			{
				if (ArrayToBeSorted[i] >= ArrayToBeSorted[i+1])
			{
				System.out.println(" Array out of order.");
			break;
			}
			}
			
			long elapsed = System.nanoTime() - time1;

			System.out.println(elapsed);
	}
}
