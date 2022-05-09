import java.io.*;
class pushpa_raj
{
    int maximus(int arr[],int max, int n)
    {
        int flag=1;
        int temp[]=new int[n];
        for (int j = 0; j < n; ++j)     
            temp[j] = arr[j]; 
        while(flag==1)
        {
            for(int k=0;k<n;++k)
                if (k!=max)
                    temp[k] = temp[k]+1;    
            for (int k = 0; k < n; ++k)
            {
                if(temp[k]==(temp[max]+1))
                {
                    max=k;
                    break;
                } 
                else
                    flag=0;
            }
        }
        return temp[max];
    }
}
class pushpa
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        pushpa_raj obj = new pushpa_raj();
        int N = Integer.parseInt(in.readLine());
        while(N>0)
        {
            int n=Integer.parseInt(in.readLine());
            String input[] = new String[n];
            input = in.readLine().split(" ");
            int h[]=new int[n];
            for(int i=0;i<n;++i)
                h[i]=Integer.parseInt(input[i]);
            int answer=0;
            for(int i=0;i<n;++i)
            {
                int res=obj.maximus(h, i, n);
                if(res>answer)
                    answer=res;
            }
            System.out.println(answer);
            --N;
        }
    }
}