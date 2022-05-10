/**‘BharatOnline’ sells their product to the customer through ‘Online’ The registered user must create their wallet to purchase 
 * a product from the site. Being a Java developer, writing necessary code so that if the purchase amount is higher than the wallet 
 * amount then raising suitable exceptions so that the system does not crash and the user can carry out other activities.
 */

import java.util.*;

class ExcessException  extends Exception  
{  
    public ExcessException (String str)  
    {  
        System.out.println(str);  
    }  
}  

public class Bharatonline
{
    static void validate (int pamount , int wamount)
    {
        try{
            if(pamount > wamount)
            {
                throw new ExcessException("The purchase amount is greater than the walletamount try to buy another item");
                
            }
        }
        catch(ExcessException e){
            System.out.println(e);

        }
        
    }
    
    static int calculate(int wamount)
    {
        System.out.println("Enter the purchaseamount->");
        Scanner sc = new Scanner(System.in);
		int pamount = sc.nextInt();
		int balance = 0;
        if(pamount<=wamount)
		{
		    balance = wamount - pamount;
		    wamount = balance;
		    System.out.println("The remaining walletamount is ->" + wamount);
		}
		else{
		    validate(pamount , wamount);
		}
		return wamount;
        
    }
	public static void main(String[] args) {
		int walletamount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the walletamount->");
		walletamount = sc.nextInt();
		int choice=1;
        int call;
        while (choice==1){
            System.out.println("Enter 1 to purchase");
            System.out.println("Enter 2 to show the walletamount");
            call=sc.nextInt();
            switch (call){
                case 1:
                    walletamount=calculate(walletamount);
                    break;
                case 2:
                    System.out.println("The wallet amount is => "+ walletamount);
                    break;
                default:
                    break;
              }
		}
	    
	}
}