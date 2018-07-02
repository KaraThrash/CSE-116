
public class HisMain {

	private static BetterArray testArray = new BetterArray();

	public static void main(String [] args)
	{
		
		// Use array as it was designed
		for (int i = 0; i < 10; ++i)
		{
			testArray.put(i+1, i);
		}
		display();

		// Now go beyond current array bounds
		for (int i = 0; i < 20; ++i)
		{
			testArray.put(i+1, i);
		}
		display();
		
		System.out.println("removing element #9");
		testArray.remove(9);
		
		System.out.println("removing element #16");
		testArray.remove(16);
		
//		testArray.remove(29);
		display();

		System.out.println("Storing 65 into element 32");		
		testArray.put(65, 32);
		System.out.println("Storing 95 into element 33");		
		testArray.put(95, 33);
		System.out.println("Storing 38 into element 27");		
		testArray.put(38, 27);
		display();
				
		System.out.println("removing element #27");
		testArray.remove(27);
		display();
		
		System.out.println("Inserting element before #20");
		testArray.insertBefore(88, 20);
		display();
		
		System.out.println("Inserting element after #20");
		testArray.insertAfter(89, 20);
		display();
	}
	
	private static void display()
	{
		System.out.println("Array contains " + testArray.getSize() + " values.");
		for (int i = 0; i < testArray.getSize(); ++i)
		{
			System.out.print(testArray.get(i) + "  ");
		}
		System.out.println();		// Terminate the line.
		System.out.println();		// skip a line
	}
}
