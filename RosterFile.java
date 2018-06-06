package Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.util.Scanner;

public class RosterFile extends RandomAccessFile{
	public int ID;
	public String name;
	public String team;
	public int skill;
	public String date;
	public static Scanner sc;
	public static byte[] filebytes;
	public RosterFile(int a, String b, String c, int d, String e) throws FileNotFoundException{
		super("filename.txt", "Read");
		ID = a;
		name = b;
		team = c;
		skill = d;
		date = e;
	}
	
	public static int getID(){
		String IDinput = sc.next();
		try{
			int IDtemp = Integer.parseInt(sc.next());
			RandomAccessFile raf = new RandomAccessFile("textfile.txt","x");
			if(0<IDtemp && IDtemp<21){
				int lineID = IDtemp+2+(IDtemp*73);
				raf.seek(lineID);
				byte[] tempbytes = new byte[5];
				int xx = raf.read(tempbytes,0,5);
				System.out.println("this is a byte I think" + xx);
				if(xx == 1){}
			}
		}catch(Exception name){
			
		}
	}
	
	public static void scan(){
		sc = new Scanner(System.in);
		String in = sc.next();
		File file = new File("TestData2_1.txt");
		if(in.equals("new")){
			if(file.exists()){
				getID();
				
			}
		}else if(in.equals("old")){
			
		}else if(in.equals("end")){
			
		}else{
			
		}
	}
}