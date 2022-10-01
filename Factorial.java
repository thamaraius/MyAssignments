package week1.day1.assigments;

public class Factorial {
	
		public static void main(String[] args) {
			
		 // Declare an integer variable fact as 1
		int i,fact=1;
		int num=5;
		for(i=1; i<=num;i++)
		 // Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)		
		{	
			  fact=fact*i;
		}
			 System.out.println("Factorial of "+num+" is: "+fact);    
			
		
		}

	}


		

		  

