
public class inValue {

	String myvalue;
	double mult;
	double ad;
	public inValue(String n){
		myvalue = n;
	}
	//public inValue multiply(inValue n) {
		//mult = n.getValue()*myvalue;
		//return toIntValue(mult);
	//}
	
	public inValue add(inValue n) {
		String mytempstring = myvalue;
		String otherstring = n.getValue();
		while(otherstring.length() < mytempstring.length())
		{
			otherstring = "0" + otherstring;
	
		}
		while(otherstring.length() > mytempstring.length())
		{
			mytempstring = "0" + mytempstring;
			
		}
		char[] stringsplit = mytempstring.toCharArray();
		char[] stringsplit2 = otherstring.toCharArray();
		
		String newstring = "";
		int carry = 0;
		//int tempint = Integer.parseInt(String.valueOf(stringsplit[stringsplit.length - 1])) + Integer.parseInt(String.valueOf(stringsplit2[stringsplit2.length - 1])) ;
		int tempint2 = 0;
		int place = 0;
		for ( int i = 0  ; i < stringsplit.length; i++)
		{
			
			
			
			
			
			
			tempint2 = (Integer.parseInt(String.valueOf(stringsplit[i ])) + Integer.parseInt(String.valueOf(stringsplit2[i ])) + carry);	
			newstring = "" + newstring + tempint2;
			
			
			if(tempint2 > 9){carry = 1;}else {carry = 0;}
			//tempint += tempint2;
		}
	if(carry == 1){newstring = "1" + newstring; }
		System.out.println(newstring);
		return new inValue(newstring);
	}
	
//
	public inValue mult(inValue n)  {
		

		String mytempstring = myvalue;
		String incomingstring = n.getValue();
		char[] thisstring = mytempstring.toCharArray();
		char[] otherstring = incomingstring.toCharArray();
		char[] smallstring = new char [1];
		char[] largestring = new char[1];
		int i = 0;
		if(otherstring.length < thisstring.length)
		{
			 largestring = new char[thisstring.length];
			for( char el: thisstring)
			{largestring[(thisstring.length - 1) - i] = el;i++; }
			i = 0;
			smallstring = new char[otherstring.length];
			for( char el: otherstring)
			{smallstring[(otherstring.length - 1) - i] = el;i++; }
			i = 0;
		}
		else
		{
			 smallstring = new char[thisstring.length];
			for( char el: thisstring)
			{smallstring[(thisstring.length - 1) - i] = el;i++; }
			i = 0;
			 largestring = new char[otherstring.length];
			for( char el: otherstring)
			{largestring[(otherstring.length - 1) - i] = el;i++; }
			i = 0;
		}

		
		String newstring = "";
		int carry = 0;
		int tempint = 0;
		int tempint2 = 0;
		int placeholder = 0;
		int count = 0;
		
		
		
		
		String place = "";
		String finishedString = "";
		for ( char el: smallstring)
		{
			for ( char el2: largestring)
			{
				if(placeholder == 0){
					tempint2 += (Integer.parseInt(String.valueOf(el)) * Integer.parseInt(String.valueOf(el2)));
					placeholder = 10;
					}
				else
					{
					tempint2 += ((Integer.parseInt(String.valueOf(el)) * Integer.parseInt(String.valueOf(el2))) * placeholder);
					placeholder *= 10;
					
					}
			
			}
			placeholder = 0;
			
			newstring = "" + tempint2 + place;
			tempint2 = 0;
			if(finishedString.length() > 0)
			{finishedString = addmultiplication(finishedString,newstring);}
			else { finishedString = newstring;}
			place = place + "0";
		
			
			
		
		
		}
		System.out.println(finishedString);
		return new inValue(finishedString);
	}
	public String addmultiplication(String a, String b) {
		String mytempstring = a;
		String otherstring = b;
		while(otherstring.length() < mytempstring.length())
		{
			otherstring = "0" + otherstring;
	
		}
		while(otherstring.length() > mytempstring.length())
		{
			mytempstring = "0" + mytempstring;
			
		}
		char[] stringsplit = mytempstring.toCharArray();
		char[] stringsplit2 = otherstring.toCharArray();
		
		String newstring = "";
		int carry = 0;
		//int tempint = Integer.parseInt(String.valueOf(stringsplit[stringsplit.length - 1])) + Integer.parseInt(String.valueOf(stringsplit2[stringsplit2.length - 1])) ;
		int tempint2 = 0;
		int place = 0;
		for ( int i = 0  ; i < stringsplit.length; i++)
		{
			
			
			
			
			
			
			tempint2 = (Integer.parseInt(String.valueOf(stringsplit[i ])) + Integer.parseInt(String.valueOf(stringsplit2[i ])) + carry);	
			newstring = "" + newstring + tempint2;
			
			
			if(tempint2 > 9){carry = 1;}else {carry = 0;}
			//tempint += tempint2;
		}
	if(carry == 1){newstring = "1" + newstring; }
		System.out.println(newstring);
		return newstring;
	}
	public String getValue(){
		return myvalue;
	}
}
