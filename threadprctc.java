import java.util.*;
import java.io.*;

class abc extends Thread{
	
	public void run(){
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a string:");
		String atr = scn.next();
		String ltr= atr.toLowerCase();
		lgth=ltr.length();

		try{
			for(int i=0;i<lgth;i++){

				if(ltr.charAt(i)=='a' || ltr.charAt(i)=='e' || ltr.charAt(i)=='i' || ltr.charAt(i)=='o' || ltr.charAt(i)=='u'){
			
					System.out.println(ltr.charAt(i));
					Thread.sleep(3000);
			
				}
			}
		}
		catch(Exception e){

			System.out.println(e);
		
		}
	}
}

class threadprctce{

	public static void main( String args[] ){
	
		abc a = new abc();
		a.start();
	
	}

}
