import java.util.*;
import java.util.regex.Pattern;

class StringChecking extends Exception 
{
    StringChecking(String message) 
    {
        super(message);
    }
} 

public class Tuhin_p3 {

    /**Part C Solution */

    /**Dealing with Exceptions in the User Entered String*/
    void Checking_String_Mukherjee(String name1, String name2) 
    {
        Pattern Exception_Found = Pattern.compile("[^a-zA-Z ]+?");
        try 
        {
            if (Exception_Found.matcher(name1).find() || Exception_Found.matcher(name2).find()) {
                throw new StringChecking("Found EXCEPTION!\nPerforming necessary exception handling to see that there is no"+
                "Dpresence of 'punctuations, special characters, or numbers.\n By removing Exceptions.");
            }
        } 
        catch (StringChecking error) 
        {
            System.out.println(error);
        }         
     }

     /** Part C Solution Ending here...................................................... */


     /** Part B Solution */

    /**Mehtod to convert string to binary 
     * First converting each character to ASCII value
     * then converting ASCII values to Binary */
    static String strToBinary_Mukherjee (String s )
    {
        String S =""; 
        for (int i =0; i <s .length(); i ++)
        {
            int val  = Integer.valueOf(s .charAt(i ));
            String bin  = "";
            while (val  > 0)
            {
                if (val  % 2 == 1)
                {
                    bin  += '1';
                }
                else
                    bin  += '0';
                val  /= 2;
            }
            bin  = reverse_Mukherjee (bin );
            S =S +bin ; // S contains the converted binary string
        }
        return S ;
    }
    static String reverse_Mukherjee (String input )
    {
        char[] a =input.toCharArray();
        int l , r =0;
        r  = a .length - 1;
        for (l  = 0; l <r ; l ++, r --)
        {
            char temp  = a [l ];
            a [l ] = a [r ];
            a [r ] = temp ;
        }
        return String.valueOf(a );
    }
    /**Method to insert padding if both the strings are not equal after 
     * converting to their respective binary string*/
    static String addZerosPadding_Mukherjee (String str , int n )
    {
        for (int i =0; i <n ; i ++)
        {
            str ="0"+str ;
        }
        return str ;
    }
    /**Method to perform Bitwise XOR operation */
    static String getXOR_Mukherjee (String a , String b )
    {
        int aLength  = a .length();
        int bLength  = b .length();
        //checking if padding of Binary Strings is reqired
        if (aLength  > bLength ) 
        {
            a  = addZerosPadding_Mukherjee (b , aLength  - bLength );
        }
        else if (bLength  > aLength )
        {
            a  = addZerosPadding_Mukherjee (a , bLength  - aLength );
        }
        //performing Bitwise XOR here.
        int len  = Math.max(aLength , bLength );
        String res  = "";
         
        for (int i =0; i <len ; i ++)
        {
            res  += a .charAt(i ) ^ b .charAt(i );
        }
        return res ;
    }

    /** Part B Solution ending here............................................................ */

    //Main Preogram body
    public static void main(String args[])
    {

        /** Part A Solution */

        String word  = "FLAMES";

        /**Taking inputs of two names*/
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter first name : ");
        String name1  = scan .nextLine();
        System.out.println("Enter Second name : ");
        String name2  = scan .nextLine();

        Tuhin_p3 obj = new Tuhin_p3();
        obj.Checking_String_Mukherjee(name1, name2);

        /**Performing necessary exception handling to see that there is no presence of 
        'punctuations, special characters, or numbers '*/
        name1 =name1 .replaceAll("[^a-zA-Z ]", "");
        name2 =name2 .replaceAll("[^a-zA-Z ]", "");

        /**Removal of common letters from both the words*/
        String common ="";
        for(int i =0; i <name1 .length();i ++)
        {
            for(int j =0; j <name2 .length();j ++)
            {
                if(name1 .charAt(i ) == name2 .charAt(j ))
                {
                    common  += name1 .charAt(i );
                }
            }
        }
        for(int i =0; i <common .length();i ++)
        {
            String ch  = common .charAt(i )+"";
            name1  = name1 .replace(ch , "");
            name2  = name2 .replace(ch , "");
        }

        /**Finding the correct position*/
        int name1_length =name1 .length();
        int name2_length =name2 .length();
        int word_length =word .length();
        int position =(name1_length +name2_length )%word_length ;
        char ch =word .charAt(position );

        /**searching word FLAMES for correct match*/
        if(ch =='F')
        {
            System.out.println("Friend");
        }
        else if(ch =='L')
        {
            System.out.println("Love");
        }
        else if(ch =='A')
        {
            System.out.println("Affection");
        }
        else if(ch =='M')
        {
            System.out.println("Marriage");
        }
        else if(ch =='E')
        {
            System.out.println("Enemy");
        }
        else if(ch =='S')
        {
            System.out.println("Serious");
        }

        /** Part A Solution Ending here......................................... */

        String S1 =strToBinary_Mukherjee (name1 );
        String S2 =strToBinary_Mukherjee (name2 );
        String X_O_R =getXOR_Mukherjee (S1 , S2 );
        int flag =0;
        for(int i =0; i <X_O_R .length()-1; i ++)
        {
            if(X_O_R .charAt(i ) == X_O_R .charAt(i +1))
            {
                flag  = 0;
            }
            else
            {
                flag  = 1;
            }
        }
        if(flag ==0)
        {
            System.out.println("Perfect match");
        }
        else
        {
            System.out.println("Not a perfect match");
        }
    }
}