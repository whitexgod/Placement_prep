#include<stdio.h>

#define MAX 100

struct edge {
	int u, v, w;
}edges[MAX], tmp;

int rank[MAX], parent[MAX];

int find_parent(int x)
{
	if(x != parent[x]){
		x = find_parent(parent[x]);
	}
	return x;
}

void link_nodes(int x, int y)
{
	if(rank[x] == rank[y]){
		rank[y] += 1;
	}
	if(rank[x]>rank[y]){
		parent[y] = x;
	}
	else{
		parent[x] = y;
	}
}

void sort_edges(int E)
{
	int i,j;
	for(i=0; i<E; i++){
		for(j=i+1; j<E; j++){
			if(edges[i].w>edges[j].w){
				tmp = edges[i];
				edges[i] = edges[j];
				edges[j] = tmp;
			}
		}
	}
}

int kruskal(int V)
{
	int count=0, i=0, cost=0,x,y;
	printf("\nEdges selected :- \n");
	while(count < V-1){
		x = find_parent(edges[i].u);
		y = find_parent(edges[i].v);
		if(x != y){
			printf("\n    V%d<--(%d)-->V%d\n",edges[i].u,edges[i].w,edges[i].v);
			cost += edges[i].w;
			link_nodes(x,y);
			count++;
		}
		i++;
	}
	return cost;
}

int main()
{
	int i,V,E,cost;
	printf("\nEnter the number of vertices : ");
	scanf("%d",&V);
	printf("Enter the number of Edges : ");
	scanf("%d",&E);
	printf("\nEnter the respective weights between vertix 'u' and vertex 'v'\n");
    for(i=0; i<E; i++){
        printf(" u : ");
    	scanf("%d",&edges[i].u);
        printf(" v : ");
		scanf("%d",&edges[i].v);
        printf("Weight v%d<---->v%d : ", edges[i].u, edges[i].v);
		scanf("%d",&edges[i].w);
		parent[i] = i;
        printf("\n");
    }
	sort_edges(E);
	cost = kruskal(V);
	printf("\nThe total cost is %d\n\n",cost);
}
