
public class BetterArray {

	public Node[] nodes;
	public Node headnode;
	public Node tailnode;
	public Node lastaccessed;
	public int lastaccessedindex;
	public int size;
	
	public BetterArray(int input)
	{makeheadandtail();}
	public BetterArray()
	{makeheadandtail();}
	
	public void makeheadandtail()
	{
		if(headnode == null) {
		headnode = new Node(0);
		tailnode = new Node(0);
		headnode.after = tailnode;
		headnode.before = headnode;
		tailnode.after = tailnode;
		tailnode.before = headnode;
		 nodes = new Node[] {headnode,tailnode};
		size = 0;
		lastaccessedindex = 0;
		lastaccessed = headnode;
		}
	}
	
	
	
	public int getSize()
	{return size;}
	
	public int get(int index)
	{
	
		if(index  > size)
		{System.out.println("No Data, size =  "+ size + "array length = " + nodes.length);}
		else
		{
			//System.out.println("found data at index = " + index +  " size =  "+ size + "array length = " + nodes.length);
			//Node tempnode = nodes[index];
			//nodes[index].get();
			//int tempint = ( tempnode.data == 0) ? -1 : tempnode.data;
			
			
		}
		//int count = 0;
		//Node tempnode = findnodeindex(index);
		
		
		
		return findnodeindex(index).get();
		
		
		
	}
	
	public void putaircraft(Aircraft data,int index)
	{
		if(index > nodes.length - 1)
		{expandarray(index);}
		
		
		Node temp = findnodeindex(index);
//
//		for (int loc = 0; loc < index - 1; ++loc)
//		{
//			temp = temp.after;
//		}

		Node save = temp.after;
		Node newnode = new Node();
		newnode.setaircraft(data);
		temp.after = newnode;
		newnode.after = save;
		newnode.before = temp;
		save.before = newnode;

		//save.before = temp.before;
		size++;
		
	}
	public void put(int data,int index)
	{
		if(index > nodes.length - 1)
		{expandarray(index);}
		
		
		Node temp = findnodeindex(index);
//
//		for (int loc = 0; loc < index - 1; ++loc)
//		{
//			temp = temp.after;
//		}

		Node save = temp.after;
		Node newnode = new Node(data);
		temp.after = newnode;
		newnode.after = save;
		newnode.before = temp;
		save.before = newnode;

		//save.before = temp.before;
		size++;
		
	}
	public void insertBefore(int data,int index)
	{put(data,index - 1);}
	public void insertAfter(int data,int index)
	{
		put(data,index + 1);
		
	}
	public void remove(int index)
	{
		
		Node tempnode = findnodeindex(index);
		
		(tempnode.before).after = tempnode.after;
		(tempnode.after).before = tempnode.before;
		size--;

	}
	public Node findnodeindex(int index)
	{
		
		int count = 0;
		Node tempnode = headnode;
		while(count < index)
		{
			tempnode = tempnode.after;
			count ++;
		}
		return tempnode;
	}
	public void expandarray(int expandto)
	{
		
		//System.out.println("expanding to "+ expandto);
		Node[] tempnode = nodes;
		//System.out.println("old node length"+ nodes.length);
		nodes = new Node[expandto * 4];
		//System.out.println("new node length"+ nodes.length);
		nodes[0] = headnode;
		Node prevnode = headnode;
		Node tempnewnode = headnode;
		size = 2;
		int count = 1;
		if(headnode.after == tailnode)
		{
			headnode.after = new Node();
			nodes[1] = headnode.after;
			(headnode.after).before = headnode;
			(headnode.after).after = tailnode;
			//headnode.after = tempnewnode;
			//tempnewnode.before = headnode;
			prevnode = tempnewnode;
			count = 2;
			size ++;
		}
		else { 
			tempnewnode = prevnode.after;
			for (Node el : tempnode)
			{
				if(el == tailnode )
				{}else {
				nodes[count] = el;
				size ++;
				prevnode = tempnewnode;
				tempnewnode = prevnode.after;
				count++;
				}
			}
			
			
		
		
		
		}
		while(count < nodes.length - 2)
		{
			tempnewnode.after = new Node();
			(tempnewnode.after).before = tempnewnode;
			tempnewnode = tempnewnode.after;
			count++;
			//size ++;
		}
		tempnewnode.after = tailnode;
		tailnode.before = tempnewnode;
		
		
		
//		for(int i = 1; i< nodes.length - 1; i++)
//		{
//			System.out.println("in the for loop "+ i);
//			if(prevnode.after == tailnode ||prevnode.after == null )
//			{
//				tempnewnode = new Node(0);
//				
//				
//			}else {
//				tempnewnode = tempnewnode.after;
//				}
//			
//			
//			prevnode.after = tempnewnode;
//			tempnewnode.before = prevnode;
//			prevnode = tempnewnode;
//		}
//		prevnode.after = tailnode;
//		tailnode.before = prevnode;
		//System.out.println("node length "+ nodes.length);
	}
	
	
}
