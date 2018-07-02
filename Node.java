
public class Node {

	public int data;
	public int index;
	public Node before;
	public Node after;
	public Aircraft myaircraft;
	
	public Node(int setdata)
	{data = setdata;}
	public Node( )
	{data = 0;}
	 public int get()
	{return data;}
	 public int getaircraft()
		{return data;}
	 public void setaircraft( Aircraft newaircraft)
		{myaircraft = newaircraft;}
	 public void set(int newdata)
	{data = newdata;}
	 
}
