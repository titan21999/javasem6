#include<stdio.h>
#include<stdlib.h>
int main()
{
	int heads[100],i,tnh,total=0,start,count=0;

	printf("Enter the number of Requests\n");
	scanf("%d",&tnh);

	printf("Enter the Requests sequence\n");
	for(i=0;i<tnh;i++)
		scanf("%d",&heads[i]);
	
	printf("Enter initial head position\n");
	scanf("%d",&start);
	//sstf disk scheduling
	
	while(count!=tnh)
	{
		int min=1000,d,index;
		for(i=0;i<tnh;i++)
		{
			d=abs(heads[i]-start);
			if(min>d)
			{
				min=d;
				index=i;
			}
		}
	
		total=total+min;
		start=heads[index];
	
	// 1000 is for max
	// you can use any number
		heads[index]=1000;
		count++;
	}
	printf("Total head movement is %d",total);

	return 0;
}
