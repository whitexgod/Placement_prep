#include<stdio.h>

#define MAX 99
#define INF 9999

int edge_weight_mat[MAX][MAX] = {INF};
int distance_mat[MAX];
int V,E,source;

void bellman_ford()
{
    for(int z=1; z<V; z++){
        
        for(int u=1; u<=V; u++){
            for(int v=1; v<=V; v++){
                if(distance_mat[u]+edge_weight_mat[u][v] < distance_mat[v]){
                    distance_mat[v] = distance_mat[u]+edge_weight_mat[u][v];
                }
            }
        }
    }
}

int main(int argc, char const *argv[])
{
    printf("\nEnter the number of vertices : ");
    scanf("%d",&V);
    printf("Enter the number of edges : ");
    scanf("%d",&E);

    for(int i=1; i<=V; i++){
        for(int j=1; j<=V; j++){
            edge_weight_mat[i][j] = INF;
        }
        distance_mat[i]=INF;
    }
    printf("\nEnter the respective weights from vertix 'u' to vertex 'v'\n");
    for(int i=0; i<E; i++){
        int u,v;
        printf("u : ");
        scanf("%d",&u);
        printf("v : ");
        scanf("%d",&v);
        printf("Weight v%d--->v%d : ",u,v);
        scanf("%d",&edge_weight_mat[u][v]);
        printf("\n");
    }
    printf("\nEnter the source vertix : ");
    scanf("%d",&source);
    distance_mat[source] = 0;

    bellman_ford();

    printf("\nRespective distances from source vertix to all vertices\n");
    for(int i=1; i<=V; i++){
        printf("    V%d ---> V%d  :  %d\n",source,i,distance_mat[i]);
    }
    return 0;
}
