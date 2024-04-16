#include<stdlib.h>
#include<stdio.h>

int main(){	

	int tnh,start,i,total=0;
	
	printf("Enter total number of heads:");
	scanf("%d",&tnh);
	
	int heads[tnh];
	
	printf("Enter Start head:");
	scanf("%d",start);

	for(i=0;i<tnh;i++){
	
		printf("Enter head no %d:",i);
		scanf("%d",&heads[i]);
	
	}
	for(i=0;i<tnh;i++){

		total=total+abs(heads[i]-start);
		start=heads[i];
	
	}
	printf("\n\n Total = %d",total);
	
	return 0;

}
