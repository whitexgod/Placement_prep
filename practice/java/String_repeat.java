public class String_repeat {
    public static void main(String args[]) {
        int flag=0;
        for(int i=0;i<(args.length-1);i++)  
        {
            if(args[i].equals(args[i+1]))
            {
                flag=1;
            }
        }
        if(flag==0)
        {
            for(int i=0; i<args.length;i++)
            {
                System.out.println(args[i]); 
            }
        }
        else
        {
            System.out.println("Same elements found!");
        }
    }
}