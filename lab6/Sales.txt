// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;

public class Sales
{
//class variables for easy access
int SALESPEOPLE, sum, sales[], aValue;
Scanner scan = new Scanner(System.in);		
	
	//Gets a number of sales people to pass to main
	public Sales()
	{
	System.out.println("Enter the number of Salespeople ");
	SALESPEOPLE = scan.nextInt();
	this.sales = new int[SALESPEOPLE];
	}
	
	//takes SALESPEOPLE and uses it for this class
	public Sales(int aValue)
	{
	SALESPEOPLE = aValue;
	this.sales = new int[SALESPEOPLE];
	}
	
	//instantiate methods
	public void testMe()
	{
	getSalesInput();
	provideSalesOutput();
	}
	
	//gets the sales values
	public void getSalesInput()
	{
		for (int i=0; i<sales.length; i++)
	   	{
		System.out.print("Enter sales for salesperson " + (i+1) + ": ");
		sales[i] = scan.nextInt();	 
		}
	 }

	//shows the sales values
	public void provideSalesOutput()
	{
	sum = 0;
	int counter = 0;
	int maxValue =0;
	int whoMax = 0;
	int whoMin = 0;
	int whoValue = 0;
	int max = sales[0]; 
	int min = sales[0];
	Scanner scan = new Scanner(System.in);
	System.out.println("\nSalesperson   Sales");
	System.out.println("--------------------");	
	
	//these loops find out who and the max and min, what the values were, and then prints that information
		for (int i=0; i<sales.length; i++)
		{    
		sum += sales[i]; 
			if(max <= sales[i])
			{
			max= sales [i];
		  	whoMax=i;				
		       }
		}
		for (int i=0; i<sales.length; i++)
	  	{   
			if(min >= sales[i])
			{ 	
			min= sales [i];
			whoMin=i;
			}
		  }
	System.out.println("\nTotal sales:" + sum  );
	System.out.println("\nAverage " + sum/SALESPEOPLE);
	System.out.println("Salesperson " + (whoMax + 1) + " had the highest sale with " + sales[whoMax] );
	System.out.println("Salesperson " + (whoMin + 1) + " had the lowest sale with " + sales[whoMin] );
	
	//these loops compare the a value with the values in the array and print the values that exceed that amount
	System.out.print("Enter a maximum value " );
	maxValue = scan.nextInt();
		for (int i=0; i<sales.length; i++)	
	  	{    
			if(maxValue <= sales[i])
			{ 
			 System.out.println("Salesperson " + i + " exceeded that value ");
			 System.out.println("Salesperson" + (i+1) + " sold " + sales[i] );
			counter++;
			}
		}
	System.out.println( counter + " people exceeded the sales");
		for (int i=0; i<sales.length; i++)	{}			
	}	
}
		