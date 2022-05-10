#include<stdio.h>

#define INF 9999
#define MAX 100

int graph[MAX][MAX];

void dijkstra(int V, int E, int source)
{
	int i;
	int visited[V+1], dist[V+1];
	for(i=1; i<=V; i++){
		dist[i] = graph[source][i];
		visited[i] = 0;
	}
	dist[source] = 0;
	visited[source] = 1;

	int count=1,next=0;
	while(count++<V-1){
		int min = INF,i;
		for(i=1; i<=V; i++){
			if(dist[i]<min && !visited[i]){
				min = dist[i];
				next = i;
			}
		}
		visited[next] = 1;
		for(i=1; i<=V; i++){
			if(!visited[i]){
				if(min+graph[next][i]<dist[i]){
					dist[i] = min + graph[next][i];
				}
			}
		}
	}

	printf("\nThe distances from the source vertex :- \n\n");
	for(i=1; i<=V; i++){
		printf("	V%d --> V%d : %d\n",source,i,dist[i]);
	}
	printf("\n");
}

int main()
{
	int V,E,source,i,j;
	printf("\nEnter the number of Vertices : ");
	scanf("%d",&V);
	printf("\nEnter the number of Edges : ");
	scanf("%d",&E);

	for(i=1; i<=V; i++){
		for (j=1; j<=V; j++){
			graph[i][j] = INF;
		}
	}
	printf("\nEnter the respective weights from vertix 'u' to vertex 'v'\n");
    for(i=0; i<E; i++){
        int u,v;
        printf("u : ");
        scanf("%d",&u);
        printf("v : ");
        scanf("%d",&v);
        printf("Weight v%d--->v%d : ",u,v);
        scanf("%d",&graph[u][v]);
        printf("\n");
    }
    printf("Enter the source vertex number : ");
    scanf("%d",&source);

    dijkstra(V,E,source);

}
