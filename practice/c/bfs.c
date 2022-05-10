#include<stdio.h>

#define MAX 100

int graph[MAX][MAX], visited[MAX];
int queue[MAX],front=0,end=0;
int pushed[MAX] = {0};

void push(int elem){
	if(front==0 && end==0){
		front = end = 1;
		queue[end] = elem;
	}
	else{
		queue[++end] = elem;
	}
}

int pop()
{
	if(front<=end){
		return queue[front++];
	}
}

void BFS(int V, int E, int root)
{	
	printf("\nVertices are visited in the following sequence :- \n    ");
	push(root);
	pushed[root]=1;
	while(front<=end){
		int u = pop();
		visited[u]=1;
		printf("V%d ",u);
		for(int v=1; v<=V; v++){
			if(graph[u][v] && !visited[v] && !pushed[v]){
				pushed[v]=1;
				push(v);
			}
		}
	}
	printf("\n\n");
}

int main()
{	
	int V,E,root;
	printf("\n  Enter the number of Vertices : ");
	scanf("%d",&V);
	printf("\n  Enter the number of Edges : ");
	scanf("%d",&E);
	printf("\n  Enter the root vertex number : ");
	scanf("%d",&root);
	printf("\n  Enter the all the unique edges (u <----> v) :\n");
	for(int i=1; i<=E; i++){
		int u,v;
		printf("  Edge %d:\n",i);
		printf("  u : ");
		scanf("%d",&u);
		printf("  v : ");
		scanf("%d",&v);
		printf("\n");
		graph[u][v] = graph[v][u] = 1;
	}
	printf("\nThe adjacency matrix of the graph :\n");
	for(int i=1; i<=V; i++){
	    printf("\t");
		for(int j=1; j<=V; j++){
			printf("%d ",graph[i][j]);
		}
		printf("\n");
	}
	BFS(V,E,root);

	return 0;
}