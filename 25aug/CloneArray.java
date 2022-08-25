/*

*/

class CloneArray
{
	static void cloneArray(int originalArr[])
	{
		 int clarr[] =originalArr.clone();
		 int copyarr[]=originalArr;
		 
		 for(int i=0;i<originalArr.length;i++) // changing the original values of array
		 {
	        originalArr[i]+=2;			 
		 }
		 // after change
		 System.out.println("Values of Cloned Array:");// deep copy: changes are not reflected
		 for(int i:clarr)
		 {
			System.out.println(i);
			
		 }
		 //after change
		 System.out.println("Values of Copied Array:"); // shallow copy : changes will be reflected
		 for(int i:copyarr)
		 {
			System.out.println(i);
			
		 }
		
		System.out.println("// using clone -Equal:"+(clarr == originalArr));// false : deep copy
		System.out.println("Equal:"+(copyarr == originalArr));// true : shallow copy
		
		
	}
   public static void main(String...args)
   {
     
     int arr[]= {3,5,2,1,8};
	 cloneArray(arr);
      
	 
   
   }
}










