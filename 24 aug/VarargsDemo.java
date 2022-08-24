/*
Program: varargs in array
*/

class VarargsDemo
{
	static void printArrayValues(int []arr)
	{
		System.out.println();
		System.out.println("Printing array elements :");
		for(int i:arr)
		{
			System.out.print(i+ "  ");
		}
		
	}
	
	static void betterPrint(int ... x)// ellipse operator
	
	{
		System.out.println();
		System.out.println("in ints");
		System.out.println("Printing array elements :");
		for(int i:x)
		{
			System.out.print(i+ "  ");
		}
	}
	
	static void betterPrint(String ...x,String ...y)
	
	{   System.out.println();
		System.out.println("in strings");
		System.out.println("Printing array elements :");
		for(String i:x)
		{
			System.out.print(i+ "  ");
		}
	}
	static void betterPrint2(float f1,String ...x)
	
	{   System.out.println(" Vlaue of fl is:"+f1);
		System.out.println("in strings");
		System.out.println("Printing array elements :");
		for(String i:x)
		{
			System.out.print(i+ "  ");
		}
	}
	
	/* static void betterPrint2(float f1,String ...x,int p)// pass any argument after the varargs
	
	{   System.out.println(" Vlaue of fl is:"+f1);
		System.out.println("in strings");
		System.out.println("Printing array elements :");
		for(String i:x)
		{
			System.out.print(i+ "  ");
		}
	} */
	
  public static void main(String args[])
  {
    int r1[]={};
	int r2[]={3,4};
	int r3[]={45,34,90,35};
	
	/* printArrayValues(r1);
	printArrayValues(r2);
	printArrayValues(r3);
	printArrayValues(5,6,7,5); // *///or as we cannot pass values in array as ints
  
    
	/*  betterPrint(7,3,4);
	 betterPrint(45,78,90,35);
	 betterPrint(5,6,7,9);
	 betterPrint("Shruti","Tanay","Payal"); */
	 
	  //betterPrint(); // ambiguity
	
	 betterPrint2(5.46f,"Arvind");
	 betterPrint2(7.8f,"Shuruti","Kaustabh","Royston",7);
    
	
  }

}



// Varargs is used to send many parameters

/* Rules:
1. We can overload varargs but then we cannot call it empty argument as it will be ambiguity.
2. Varaargs has to always the last argument
3. we cannot have more than 1 varargs in am method. */






