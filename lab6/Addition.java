import javax.swing.JOptionPane;
import java.lang.String;
public class Addition
{
	public static void main(String args[])
	{
	String SALESPEOPLE, sales[], i; 
	int sum, aValue, sales[];
	public Sales()	
	SALESPEOPLE = JOptionPane.showInputDialog("Enter the number of Salespeople ");
	SALESPEOPLE= Integer.parseInt(SALESPEOPLE);
	this.sales = new int[SALESPEOPLE];
	}
	
	public Sales(int aValue)
	{
	SALESPEOPLE = aValue;
	this.sales = new int[SALESPEOPLE];
	}
	
	public void testMe()
	{
	getSalesInput();
	provideSalesOutput();
	)
	
	public void getSalesInput()
	{
		for(int i=0; i<sales.length; i++)
		{
		i = JOptionPane.showInputDialog("Enter sales for salesperson");
		i = Integer.parseInt(i);
		sales[] = sales[i];
		}
	
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
	JOptionPane.showMessageDialog(null,"The sum is " + sum, "dollars", JOptionPane.PLAIN_MESSAGE);
	JOptionPane.showMessageDialog(null,"The average sales is " + sum/SALESPEOPLE, "dollars", JOptionPane.PLAIN_MESSAGE); 
	System.exit(0);
	}
}