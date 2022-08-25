/*
Addition of matrices

*/
import java.util.Scanner;
class MatrixOperations
{
   static void inputMatrix()
   {
	  int ch;
	  Scanner sc = new Scanner(System.in); 
	  // creating 2 arrays
	  int arr1[][] = new int[3][3];
	   int arr2[][] = new int[3][3];
	  
	  // entering the details of 1 matrix
     System.out.println("Enter the 1st Matrix:");
	 for(int i=0;i<3;i++)
	 {
		 for(int j=0;j<3;j++)
		 {
			arr1[i][j]=sc.nextInt();
			 
		 }
			 
	 }
	 
	 // entering the details of 2 matrix
 
     System.out.println("Enter the 2nd Matrix:");
	 for(int i=0;i<3;i++)
	 {
		 for(int j=0;j<3;j++)
		 {
			arr2[i][j]=sc.nextInt();
			 
		 }
			 
	 }
	 
	  System.out.println("Enter your choice to perfom any operation( 1 for add, 2 for subtract:");
	  ch=sc.nextInt();
	  switch(ch)
	  {
		  case 1 : addMatrix(arr1,arr2);
		           break;   
		  case 2 : subMatrix(arr1,arr2);
		            break;
          default : System.out.println("Wrong input");	  
	  }
	  
	 
   
   }
   
   static void addMatrix(int a[][],int b[][])
   
   {
	   int[][] resMatrix= new int[3][3];
	   
	   System.out.println("Addition of 2 matrices:");
	  for(int i=0;i<3;i++)
	  {
		 for(int j=0;j<3;j++)
		 {
			resMatrix[i][j]=a[i][j]+b[i][j];
			 
		 }
		 
				 
	 }
	  display(resMatrix);
	   
   }
    static void subMatrix(int a[][],int b[][])
   
   {
	   int[][] resMatrix= new int[3][3];
	   
	   System.out.println("Subtraction of 2 matrices:");
	  for(int i=0;i<3;i++)
	  {
		 for(int j=0;j<3;j++)
		 {
			resMatrix[i][j]=a[i][j]-b[i][j];
			 
		 }
			
	 }
	 display(resMatrix); 
	   
   }
   
   static void display(int dArray[][])
   {
	   System.out.println("Resultant matrix is :");
	  for(int i=0;i<3;i++)
	  {
		 for(int j=0;j<3;j++)
		 {
			System.out.print(dArray[i][j]+ " ");
		 }
		System.out.println();	 
	 }
	   
   }
  
  public static void main(String ...args)
  {
      inputMatrix();
  
  }


}
