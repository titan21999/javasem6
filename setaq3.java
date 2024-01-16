import java.util.*;

class setaq3e{

	public static void main(String args[]){
	
		TreeSet alst = new TreeSet();
		Scanner scn = new Scanner(System.in);

		int n;
		String abc;
		
		System.out.print("Enter number of colours:");
		n=scn.nextInt();
		
		for(int i=0;i<n;i++)
		{
			
			System.out.print("Enter element:");
			abc =scn.next();
			alst.add(abc);
		
		}		
	
		System.out.println(alst);

	} 	
}                                                                                                                                                                    
