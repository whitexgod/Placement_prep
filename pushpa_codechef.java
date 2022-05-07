import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class pushpa_raj
{
    void pushpa_raj_func(int arr[], int max, int n)
    {
        for(int i=0;i<n;++i)
        {
            if (i!=max)
                arr[i] = arr[i]+1;    
        }
        for (int i = 0; i < n; i++)
        {
            if(arr[i]==(arr[max]+1))
                pushpa_raj_func(arr,i,n);
        }
        System.out.println(arr[max]);
    }
}
public class pushpa_codechef {
    public static void main(String args[]) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        while (N>0)
        {
            int n = Integer.parseInt(in.readLine());
            int h[] = new int[n];
            String input[] = new String[3];
            input = in.readLine().split(" ");
            int max=0;
            for(int i=0; i<n; ++i)
            {
                h[i]=Integer.parseInt(input[i]);
                if (h[i]>h[max])
                    max=i;
            }
            pushpa_raj obj = new pushpa_raj();
            obj.pushpa_raj_func(h, max, n);
            --N;
        }
    }
}
