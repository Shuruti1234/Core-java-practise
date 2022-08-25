/*
Addition of matrices

*/
import java.util.Scanner;
class MatrixOperations()
{
   static void inputMatrix()
   {
	  Scanner sc = new Scanner(System.in); 
	  // creating 3 arrays
	  int [][]arr1,arr2 = new int[3][3];
	  
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
 
     System.out.println("Enter the 1st Matrix:");
	 for(int i=0;i<3;i++)
	 {
		 for(int j=0;j<3;j++)
		 {
			arr2[i][j]=sc.nextInt();
			 
		 }
			 
	 }
	 
   
   }
   
   static void addMatrix(int a[],int b[])
  
  public static void main(String ...args)
  {
      inputMatrix();
  
  }


}
