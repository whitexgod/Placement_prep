public class Prime_or_not {
    boolean isprime(int n)
        { 
            int count=0;
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            if (count==2)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    public static void main(String args[]) {
        Prime_or_not obj = new Prime_or_not();
        for(int i=0; i<args.length;i++)
        {
            if(obj.isprime(Integer.parseInt(args[i])))
            {
                System.out.println("Prime : "+args[i]);
            }
            else
            {
                System.out.println("Not Prime : "+args[i]);
            }
        }
    }
}