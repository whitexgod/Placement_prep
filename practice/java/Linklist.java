import java.util.*;

public class Linklist {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        boolean L=true;
        while(L)
        {
            System.out.println(" Enter 1 to perform Insertion\n Enter 2 to perform deletion\n Enter 3 to perform Display\n Enter 4 to perform sorting\n Enter 5 to perform Search.\n");
            System.out.println(" Enter 7 to insert element at first\n Enter 8 to insert element at last\n Enter 9 to insert element at defined position\n");;
            System.out.println("Enter 6 to terminate!");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter an element to insert into the linked list :");
                    int ele = sc.nextInt();
                    ll.add(ele);
                    break;
                }
                
                case 2:
                {
                    System.out.println("Removing the last element \n After removal the link list is :");
                    ll.remove(ll.size()-1);
                    System.out.println(ll);
                    break;
                }

                case 3:
                {
                    System.out.println("The Linked list is : ");
                    for (int i = 0; i < ll.size(); i++) 
                    {
                        System.out.print(ll.get(i) + " ");
                    }
                    System.out.println();
                    break;
                }

                case 4:
                {
                    System.out.println("After sorting the link list : ");
                    Collections.sort(ll);
                    for (int i = 0; i < ll.size(); i++) 
                    {
                        System.out.print(ll.get(i) + " ");
                    }
                    System.out.println();
                    break;
                }

                case 5:
                {
                    System.out.println("Enter the element to be searched for.");
                    int ele = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < ll.size(); i++) 
                    {
                        if(ll.get(i)==ele)
                        {
                            System.out.println("The element is found in the link list!");
                            found =true;
                        }
                    }
                    if(found==false)
                    {
                        System.out.println("Element not found in the link list.");
                    }
                    break;
                }

                case 6:
                {
                    System.out.println("Terminating now...");
                    L=false;
                    break;
                }

                case 7:
                {
                    System.out.println("Enter an element to insert into the linked list :");
                    int ele = sc.nextInt();
                    ll.add(1, ele);
                    break;
                }

                case 8:
                {
                    System.out.println("Enter an element to insert into the linked list :");
                    int ele = sc.nextInt();
                    ll.add(ll.size()-1, ele);
                    break;
                }
                
                case 9:
                {
                    System.out.println("Enter the position : ");
                    int pos = sc.nextInt();
                    System.out.println("Enter an element to insert into the linked list :");
                    int ele = sc.nextInt();
                    ll.add(pos, ele);
                    break;
                }

                default:
                System.out.println("Wrong choice!");
            }
        }
    }
}