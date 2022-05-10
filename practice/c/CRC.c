// CRC bit finding program from sender side (working for 6bits data)

#include <stdio.h>

int main()
{
    //initial variables
    int length,length_div,length_data;
    
    //taking divisor as input
   printf("Enter the divisor length : \n");
   scanf("%d\n",&length_div);
   int divisor[length_div];
   for(int i=0;i<length_div;i++)
   {
        scanf("%d",&divisor[i]);   
   }
   
   //taking data as input
   printf("Enter the data length : \n");
   scanf("%d\n",&length);
  length_data=length+(length_div-1);
  int data[length_data];
  for(int i=0;i<(length_data);i++)
  {
      if(i<length)
      {
            scanf("%d",&data[i]); 
            continue;
      }
      data[i]=0;
  }
  
  //Given inputs
  printf("Data : ");
  for(int i=0;i<length;i++)
  {
      printf("%d",data[i]);
  }
  printf("\nModified Data : ");
  for(int i=0;i<length_data;i++)
  {
      printf("%d",data[i]);
  }
  printf("\nDivisor : ");
  for(int i=0;i<length_div;i++)
  {
      printf("%d",divisor[i]);
  }
  
   //programming logic
  int rem[length_div];
  int temp[length_div];
  for(int i=0;i<length_div;i++)
  {
      rem[i]=data[i];
  }
   for(int i=0;i<length;i++)
   {
        if(rem[0]!=0)
        {
            for(int j=0;j<length_div;j++)
            {
                temp[j]=rem[j]^divisor[j];
            }
            for(int j=0;j<length_div;j++)
            {
                if(j<length_div-1)
                {
                    rem[j]=temp[j+1];
                    continue;
                }
                rem[j]=data[i+length_div];
            }
            continue;
        }
        if(rem[0]==0)
        {
            for(int j=0;j<length_div;j++)
            {
                if(j<length_div-1)
                {
                    rem[j]=rem[j+1];
                    continue;
                }
                rem[j]=data[i+length_div];
            }
        }
   }
   
   //CRC bits sender side
   printf("\nThe CRC is : ");
  for(int i=0;i<length_div-1;i++)
  {
      printf("%d",rem[i]);
  }
  
  //sender side data
  int send[length_data];
  for(int i=0;i<length_data;i++)
  {
        if(i<length)
        {
            send[i]=data[i];
            continue;
        }
        send[i]=rem[i-length];
  }
  printf("\nThe sender side data bit is : ");
  for(int i=0;i<length_data;i++)
  {
      printf("%d",send[i]);
  }
  
  //Receiver side
  for(int i=0;i<length_div;i++)
  {
      rem[i]=send[i];
  }
  for(int i=0;i<length;i++)
   {
        if(rem[0]!=0)
        {
            for(int j=0;j<length_div;j++)
            {
                temp[j]=rem[j]^divisor[j];
            }
            for(int j=0;j<length_div;j++)
            {
                if(j<length_div-1)
                {
                    rem[j]=temp[j+1];
                    continue;
                }
                rem[j]=send[i+length_div];
            }
            continue;
        }
        if(rem[0]==0)
        {
            for(int j=0;j<length_div;j++)
            {
                if(j<length_div-1)
                {
                    rem[j]=rem[j+1];
                    continue;
                }
                rem[j]=send[i+length_div];
            }
        }
   }
   
   //CRC bits receiver side
   printf("\nThe Receiver side CRC calculation result is : ");
   int flag=0;
  for(int i=0;i<length_div-1;i++)
  {
      printf("%d",rem[i]);
      if(rem[i]!=0)
      {
          flag=1;
      }
  }
  
  //Checking module
  if(flag==0)
  {
      printf("\n\nSUCCESS!");
  }
  else
  {
      printf("\n\nFAILURE!");
  }
}

