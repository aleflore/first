// ****************************************************************
// Main.java
//
// Instantiates and starts the Sales class
//
// ****************************************************************

public class Main
{
    public static void main(String[] args)
    {
	//exception handler
	if(args.length > 0)
	{
	int aValue = Integer.parseInt(args[0]);
	Sales mySalesinfo = new Sales(aValue);
	mySalesinfo.testMe();
	}
	
	else
	{
	// instantiate the class
	Sales mySalesInfo = new Sales();
	// and start
	mySalesInfo.testMe();
	}
     }
}