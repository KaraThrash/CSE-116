
public class BetterAircraftArray {


    public Aircraft[] aircraftlist;
    public Aircraft headnode;
    public Aircraft tailnode;
    public Aircraft lastaccessed;
    public int lastaccessedindex;
    public int size;

    
    public BetterAircraftArray(int input)
    {makeheadandtail();}
    public BetterAircraftArray()
    {makeheadandtail();}
    
    public void makeheadandtail()
    {
        if(headnode == null) {
        	
        headnode = new Aircraft();
        tailnode = new Aircraft();
        headnode.after = tailnode;
        headnode.before = headnode;
        tailnode.after = tailnode;
        tailnode.before = headnode;
        aircraftlist = new Aircraft[10] ;
        aircraftlist[0] = headnode;
        aircraftlist[1] = tailnode;
        size = 2;
        lastaccessedindex = 0;
        lastaccessed = headnode;
        }
    }
    
    
    
    public int getSize()
    {return size;}
    
    public Aircraft get(int index)
    {
    
//        if(index  > size)
//        {System.out.println("No Data, size =  "+ size + "array length = " + aircraftlist.length);}
//        else
//        {
//            //System.out.println("found data at index = " + index +  " size =  "+ size + "array length = " + nodes.length);
//            //Node tempnode = nodes[index];
//            //nodes[index].get();
//            //int tempint = ( tempnode.data == 0) ? -1 : tempnode.data;
//            
//            
//        }
        //int count = 0;
        //Node tempnode = findnodeindex(index);
        Aircraft tempaircraft = headnode;
        boolean temo = false;
        int count = 0;
        while(count <= size)
        {
        	if(tempaircraft != tailnode && temo == false)
        	{
        		tempaircraft = tempaircraft.after;
        		if(tempaircraft.ID == index)
        		{ temo = true;}
        	}
        	
        	count++;
        }
        if(temo==false){
        	System.out.println("There is no aircraft with that ID");
        	tempaircraft = tailnode;
        }
        return tempaircraft;
        
        
        
    }

  
    
    public void putaircraft(Aircraft data)
    {
    	
    	if(data.ID >= aircraftlist.length - 1)
        {expandarray(data.ID);}
        
    	  aircraftlist[size-1] = data;
    	Aircraft tempac = headnode.after;
    	while(tempac.altitude < data.altitude && tempac != tailnode)
    	{tempac = tempac.after;
    	}
    	if(tempac == tailnode)
    	{
    	tailnode.before.after = data;
    	data.before = tailnode.before;
    	data.after = tailnode;
    	tailnode.before = data;
    	}else
    	{
    		tempac.before.after = data;
    	data.before = tempac.before;
    	data.after = tempac;
    	tempac.before = data;
    	}

    	
    	
      
//        data.before = tailnode.before;
//        tailnode.before.after = data;
//        tailnode.before = data;
//        data.after = tailnode;
//        data.index = size - 1;
        //save.before = temp.before;
        size++;
        
    }
    public void put(int data,int index)
    {
        if(index > aircraftlist.length - 1)
        {expandarray(index);}
        
        
        Aircraft temp = findnodeindex(index);
//
//        for (int loc = 0; loc < index - 1; ++loc)
//        {
//            temp = temp.after;
//        }

        Aircraft save = temp.after;
        Aircraft newnode = new Aircraft(data);
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
    	
        Aircraft tempnode = get(index);
        if(tempnode != headnode && tempnode != tailnode)
        {
        (tempnode.before).after = tempnode.after;
        (tempnode.after).before = tempnode.before;
        size--;
        }else
        {System.out.println("out of bounds");}

    }
    public Aircraft findnodeindex(int index)
    {
        
        int count = 0;
        Aircraft tempnode = headnode;
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
        Aircraft[] tempnode = aircraftlist;
        //System.out.println("old node length"+ nodes.length);
        aircraftlist = new Aircraft[expandto * 4];
        //System.out.println("new node length"+ nodes.length);
        aircraftlist[0] = headnode;
        Aircraft prevnode = headnode;
        Aircraft tempnewnode = headnode;
        size = 0;
        int count = 1;
        if(headnode.after == tailnode)
        {
            headnode.after = new Aircraft();
            aircraftlist[1] = headnode.after;
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
            for (Aircraft el : tempnode)
            {
                if(el == tailnode )
                {}else {
                aircraftlist[count] = el;
                size ++;
                prevnode = tempnewnode;
                tempnewnode = prevnode.after;
                count++;
                }
            }
            
            
        
        
        
        }
        while(count < aircraftlist.length - 2)
        {
            tempnewnode.after = new Aircraft();
            (tempnewnode.after).before = tempnewnode;
            tempnewnode = tempnewnode.after;
            count++;
            //size ++;
        }
        tempnewnode.after = tailnode;
        tailnode.before = tempnewnode;
        
        
        
//        for(int i = 1; i< nodes.length - 1; i++)
//        {
//            System.out.println("in the for loop "+ i);
//            if(prevnode.after == tailnode ||prevnode.after == null )
//            {
//                tempnewnode = new Node(0);
//                
//                
//            }else {
//                tempnewnode = tempnewnode.after;
//                }
//            
//            
//            prevnode.after = tempnewnode;
//            tempnewnode.before = prevnode;
//            prevnode = tempnewnode;
//        }
//        prevnode.after = tailnode;
//        tailnode.before = prevnode;
        //System.out.println("node length "+ nodes.length);
    }
    
	   public  Aircraft[]  sortArray() {
		   Aircraft[] sortedlist = new Aircraft[size];
//		   int currentalt = 0;
//		   int oldalt = 0;
//		   int count = 0;
//		   Aircraft tempcraft = headnode;
//		   while (count < size - 1)
//		   {
//			   System.out.println("low alt "+ currentalt);
//			   for(Aircraft el: aircraftlist)
//			   {
//				   System.out.println("high alt "+ currentalt);
//				   if(el.altitude < currentalt && el.altitude >= oldalt)
//				   {currentalt = el.altitude;tempcraft = el;}
//				   
//			   }
//			   currentalt++;
//			   oldalt = currentalt;
//			sortedlist[count] = tempcraft;
//			if(tempcraft != tailnode){
//			tempcraft = tempcraft.after;
//			currentalt = tempcraft.altitude;
//			count++;
//			}else{count = size;}
//			   
//			   
//		   }
		   
		   
		   
		   
//		   
//		      for(int i=1; i<sortedlist.length; i++) {
//		         int temp=0;
//		         if(sortedlist[i-1].altitude > sortedlist[i].altitude) {
//		            temp = sortedlist[i-1].altitude;
//		            sortedlist[i-1].altitude = sortedlist[i].altitude;
//		            sortedlist[i].altitude = temp;
//		            i=0;
//		         }
//		      }
//		   
	   return aircraftlist;
	   }
    
}
