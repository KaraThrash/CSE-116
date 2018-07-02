import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;


public  class Aircraft {

	 public int index;
	    public Aircraft before;
	    public Aircraft after;
	      public String name = "";
	        public int altitude = 0;;
	        public int speed = 0;

	        public int ID = 0;
	       
	       
	       
	        public Aircraft(int id){
	        	  ID = 0;speed = 0; altitude=0;name = "";
	        }  
	        public Aircraft(){
	  ID = 0;speed = 0; altitude=0;name = "";
	        }

	        public void setID(int id){
	            ID = id;
	        }
	       
	       
	       
	        public String getName(int id){
	            return name;
	        }
	       
	       
	       
	        public void setName(String n){
	            name = n;
	        }
	       
	       
	       
	        public void setAlt(int a){
	            altitude = a;
	        }
	       
	       
	       
	        public void setSpeed(int s){
	            speed = s;
	        }
	       
	        public String get(){
	        	String tempstring = "This plane has an altitude of " + altitude + ", a speed of " + speed + ", and is called " + name;
	        	if(ID == 0){tempstring = "No plane";}
	            return tempstring;
	        }        
	    }
