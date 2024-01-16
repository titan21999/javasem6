import java.util.*;

class setaq2e{

	public static void main(String args[]){
	
		LinkedList llst = new LinkedList();
		Scanner scn = new Scanner(System.in);

		int n;
		String abc;
		
		System.out.print("Enter number of friends:");
		n=scn.nextInt();
		
		for(int i=0;i<n;i++)
		{
			
			System.out.print("Enter element:");
			abc =scn.next();
			llst.add(abc);
		
		}		
	
		System.out.println(llst);
		
	

	} 	
}
