#include<stdio.h>
#include<malloc.h>

struct item{
	int profit, weight, taken;
	float profit_ratio;
};

void sort_items(struct item *items, int n){
	struct item tmp;
	int swapped=0;
	int i,j;
	for(i=0; i<n-1; i++){
		for(j=0; j<n-i-1; j++){
			if(items[j].profit_ratio<items[j+1].profit_ratio){
				tmp = items[j];
				items[j] = items[j+1];
				items[j+1] = tmp;
				swapped = 1;
			}
		}
		if(swapped){
			swapped=0;
		}
		else{
			break;
		}
	}
}

int knapsack(struct item *items, int n, int bag_size){
	int max_profit=0;
	int i;
	for(i=0; i<n; i++){
		if(items[i].weight>bag_size){
			continue;
		}
		bag_size -= items[i].weight;
		max_profit += items[i].profit;
		items[i].taken = 1;
		if(bag_size==0){
			break;
		}
	}
	return max_profit;
}

int main(){
	int n,bag_size;
	printf("\nEnter the number of items : ");
	scanf("%d",&n);
	printf("Enter the size of the knapsack bag : ");
	scanf("%d",&bag_size);
	struct item *items = (struct item*)malloc(n*sizeof(struct item));

	printf("\nEnter the profit and weight of each items :- \n");
	int i;
	for(i=0; i<n; i++){
		printf("\nItem%d:-\nprofit : ",i+1);
		scanf("%d",&items[i].profit);
		printf("weight : ");
		scanf("%d",&items[i].weight);
		items[i].profit_ratio = (float)items[i].profit/items[i].weight;
		items[i].taken = 0;
	}
	sort_items(items,n);
	printf("\n\nAfter sorting in decending order of their profit ratio :- \n");
	printf("\nProfit\tweight\tprofit_ratio\n");
	for (i = 0; i < n; i++){
		printf("%d\t%d\t%f\n",items[i].profit, items[i].weight, items[i].profit_ratio);
	}
	printf("\nThe maximum profit is %d\n",knapsack(items,n,bag_size));
	printf("\nThe solution vector :- ");
	for (i = 0; i < n; i++){
		printf("%d ", items[i].taken);
	}
}
