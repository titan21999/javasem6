import java.util.*;

class arrlist{

	public static void main(String args[]){
	
		ArrayList alst = new ArrayList();
		Scanner scn = new Scanner(System.in);

		int n;
		String abc;
		
		System.out.print("Enter number of elements:");
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
