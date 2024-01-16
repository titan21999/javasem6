import java.util.*;

class wpq2e{

	public static void main(String args[]){
	
		TreeSet alst = new TreeSet();
		Scanner scn = new Scanner(System.in);

		int n,q,s;

		System.out.print("Enter number of integers:");
		n=scn.nextInt();
		
		for(int i=0;i<n;i++)
		{
			
			System.out.print("Enter element:");
			q =scn.nextInt();
			alst.add(q);
		
		}		
	
		System.out.println(alst);
		
		System.out.print("Enter element to search:");
		s=scn.nextInt();
		System.out.println("Element Present:"+alst.contains(s));

	} 	
	
}
