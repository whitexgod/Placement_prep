#include<stdio.h>

#define MAX 100
#define INF 9999

int graph[MAX][MAX],visited[MAX],city,cost=0;

int minimum_node(int node)
{
	int next_node=INF, min_cost_two_way=INF,min_cost_one_way=0;
	for(int i=1; i<=city; i++){
		if(graph[node][i] && !visited[i]){
			if(graph[node][i]+graph[i][node]<min_cost_two_way){
				min_cost_two_way = graph[node][i]+graph[i][node];
				min_cost_one_way = graph[node][i];
				next_node = i;
			}
		}
	}
	if(min_cost_two_way!=INF){
		cost += min_cost_one_way;
	}
	return next_node;
}

void travelling_sellsperson(int node)
{
	visited[node] = 1;
	printf("V%d ---> ",node);
	int next_node = minimum_node(node);
	if(next_node==INF){
		printf("V%d",1);
		cost += graph[node][1];
		return;
	}
	travelling_sellsperson(next_node);
}

int main()
{
	printf("\n\nEnter the number of cities : ");
	scanf("%d",&city);
	printf("\nEnter the corresponding distances of the cities :\n");
	for(int i=1; i<=city; i++){
		for(int j=1; j<=city; j++){
			if(i==j){
				graph[i][j] = 0;
				continue;
			}
			printf("V%d---->V%d : ",i,j);
			scanf("%d",&graph[i][j]);
		}
		printf("\n");
		visited[i] = 0;
	}

	printf("\nVisiting order of the cities : \n");
	travelling_sellsperson(1);
	printf("\n\nThe total cost : %d\n\n",cost);

	return 0;
}