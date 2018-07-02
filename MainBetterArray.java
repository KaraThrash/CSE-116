import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class MainBetterArray {
	
	   private static BetterAircraftArray planeArray = new BetterAircraftArray();
	    public static void listen(){
	        Scanner sc = new Scanner(System.in);
	        String newinput = sc.next();
	        
	        if(newinput.toLowerCase().substring(0,1).equals("e")){
	            //(entering) one aircraft will be added to your problem
	            System.out.println("What is the ID number?");
	            int ID = sc.nextInt();
	            Aircraft tempAircraft = new Aircraft();
	            tempAircraft.setID(ID);
	            System.out.println("What is the plane's altitude?");
	            int altitude = sc.nextInt();
	            tempAircraft.setAlt(altitude);
	            System.out.println("What is the plane's speed?");
	            int speed = sc.nextInt();
	            tempAircraft.setSpeed(speed);
	            System.out.println("What is the name of the plane?");
	            String name = sc.next();
	            tempAircraft.setName(name);
	            planeArray.putaircraft(tempAircraft);
	            
	            System.out.println("What would you like to do?");
	            listen();
	        }else if(newinput.toLowerCase().substring(0,1).equals("l")){
	        
	            System.out.println("What is the ID of the plane leaving the air space?");
	            int temp = sc.nextInt();
	            if(planeArray.size <= temp)
	            {System.out.println("The ID you entered is outside the system size.");}
	            else {
	           
	                planeArray.remove(temp);
	                System.out.println("remved plane");
	            }
	            
	            
	            System.out.println("What would you like to do?");
	            listen();
	        }else if(newinput.toLowerCase().substring(0,1).equals("s")){
	            //(show) all information for that aircraft will be displayed
	            System.out.println("What is the plane's ID?");
	            int tempint = sc.nextInt();
	            System.out.println(planeArray.get(tempint).get());

	         
	            
	            
	            System.out.println("What would you like to do?");
	            listen();
	        }else if(newinput.toLowerCase().substring(0,1).equals("d")){
	        	
	        	
	        	Aircraft tempace = planeArray.headnode.after;
	        	while(tempace != planeArray.tailnode)
	        	{
	        	      System.out.println(tempace.get());
	        	      tempace = tempace.after;
	        	}
	        	
	            //(display) all aircraft in your problem will be displayed in a list
	         //   int size = planeArray.getSize();

	           // System.out.println(planeArray.sortArray());
	           // Aircraft[] sortedarray = new Aircraft[planeArray.size];
	            		
	           // sortedarray = planeArray.sortArray();
	           // System.out.println(sortedarray[0].get());
	           // System.out.println("that should have been 0");
	        //	System.out.println(planeArray.tailnode.before.get());
//	            for(Aircraft el: planeArray.sortArray()){
//	            	
//	                System.out.println(el.get());
//	                
//	            }
	            
	     
	            
	            
	            System.out.println("What would you like to do?");
	            listen();
	        }else if(newinput.toLowerCase().substring(0,1).equals("t") || newinput.toLowerCase().substring(0,1).equals("q")){
	            //(terminate) end the program
	        }else if(newinput.toLowerCase().substring(0,1).equals("h")){
	            System.out.println("Type entering to add a plane.");
	            System.out.println("Type leaving if a plane has left the airspace.");
	            System.out.println("Type show to get the information of a specific plane.");
	            System.out.println("Type display to see the information of all planes in the airspace.");
	            System.out.println("Type terminate or quit to end the program.");
	     
	            
	            System.out.println("What would you like to do?");
	            listen();
	        }else{
	            //invalid input, entered (variable type), expected string
	            //or: invalid input, String not 
	            
	        }
	        
	    }
	    

	    public static void main(String[] args){
	        System.out.println("What would you like to do?");
	        listen();
	        
	        
	        
	    }
	}