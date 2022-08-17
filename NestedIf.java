/*
 Program: Nested If
 @author: Shuruti Singhal
 @Date: 17 august 2022
*/

class NestedIf
{
	static void takeAdmission()
	{
		float totalMarks=73.9f;
		float pcmMarks=87.9f;
		if(totalMarks>75)
		{
			if(pcmMarks>85)
				System.out.println("---You are eligible for our college(B.tech)----");
			else
				System.out.println("---You are eligible for our college(BCA)----");
				
		}
		else
			System.out.println("---You are not eligible for our college---------");
		System.out.println("---Thank You !----");
		
		
	}	
	public static void main(String args[])
	{
		takeAdmission();
		
	}
	
}
