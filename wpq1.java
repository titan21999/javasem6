import java.util.*;

class wpq1e{

	public static void main(String args[]){
	
		LinkedList llst = new LinkedList();
		Scanner scn = new Scanner(System.in);

		int n;
		String abc,laele;
		
		System.out.print("Enter number of elements:");
		n=scn.nextInt();
		
		for(int i=0;i<n;i++)
		{
			
			System.out.print("Enter element:");
			abc =scn.next();
			llst.add(abc);
		
		}		

		System.out.println(llst);

		System.out.println("Adding element to last index of list:");
		System.out.print("Enter element:");
		laele=scn.next();
		llst.addLast(laele);
		System.out.println(llst);
		
		System.out.println("Deleting element from first index of list:");
		llst.remove(0);
		System.out.println(llst);

		System.out.println("Printing in reverse order:");
		Collections.reverse(llst);
		System.out.println(llst);

	} 	
}
