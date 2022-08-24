/*
Program:
@author
*/

class ArrayDemo
{
   static void printArray(int arr[])
   {
	   
	   // printing all the elements of the array
	    for(int i:arr)
		{
			System.out.println(i);
		}
	   
	   sortArray(arr);
	   	   
	   
   }
   
   // method to sort the array
   
   static void sortArray(int myarray[])
   {
	   int len= myarray.length;
	   System.out.println("The size of the array is :"+len);
	   int temp;
	   // sorting the array in ascending order
	   
	   for(int j=0;j<len;j++)
	   {
		   for(int k=j+1;k<len;k++)
		   {
			   if(myarray[j]>myarray[k])
			   {
				   temp=myarray[j];
				   myarray[j]=myarray[k];
				   myarray[k]=temp;
				   
			   }
				   
		   }
		   
	   }
	   // ending sorting
	   
	   System.out.println("Largest element is:"+ myarray[len-1]);
	   System.out.println("Second Largest element is:"+ myarray[len-2]);
	   
   }


   public static void main(String ...args)
   {
	  //int newArray[]= new int[50];// creating an array of size 50
	  
	  // printArray(45,89,56,87,90,3,7);
	  int size =args.length;
	   //System.out.println(size);
	   
	   int newArray[]= new int[size];
	   
	   // setting array elements
	   for(int i=0;i<size;i++)
	   {
		   newArray[i]= Integer.parseInt(args[i]);
	   }
	   //printing an array
	   /* for(int i=0;i<size;i++)
	   {
		   System.out.println(newArray[i]);
	   } */
	   
	 	printArray(newArray);   
   }

  
}