#include <stdio.h>

#define MAX 99

int v, m, solutions = 0;
int g[MAX][MAX];
int x[MAX] = {0};

int NextValue(int k)
{
	while (1)
	{
		x[k] = (x[k] + 1) % (m + 1);
		if (x[k] == 0)
		{
			return 0;
		}
		int j;
		for (j = 1; j <= v; j++)
		{
			if (g[k][j] && (x[k] == x[j]))
			{
				break;
			}
		}
		if (j == v + 1)
		{
			return 0;
		}
	}
}

void print_solution_matrix()
{   
	printf("    ");
	for (int i = 1; i <= v; i++)
	{
		printf("%d ", x[i]);
	}
	printf("\n");
}

int mcoloring(int k)
{
	while (1)
	{
		NextValue(k);
		if (x[k] == 0)
		{
			return 0;
		}
		if (k == v)
		{
			solutions++;
			print_solution_matrix();
		}
		else
		{
			mcoloring(k + 1);
		}
	}
}

int main()
{
	printf("\n\nEnter the number of vertices : ");
	scanf("%d", &v);
	printf("\nEnter the adjacency matrix :\n");
	printf("If edge present enter 1 else 0\n\n");
	printf("   \\");

	for (int i = 1; i <= v; i++)
	{
		printf(" %d", i);
	}
	printf("\n");
	for (int i = 1; i <= v; i++)
	{
		printf(" %d | ", i);
		for (int j = 1; j <= v; j++)
		{
			scanf("%d", &g[i][j]);
		}
	}
	printf("\n\n");
	for (m = 1; m <= v; m++)
	{
		if (solutions)
		{
			printf("\n\nMinimum %d colours needed to colour the graph.\n", m - 1);
			printf("\nTotal number of solutions = %d\n\n", solutions);
			return 0;
		}
		else
		{
			mcoloring(1);
		}
	}

	return 0;
}