package sample;

public class NullPoint {
	
	String ptr = null;
	{
	try
	{
	if(ptr.equals("gfg"))
	System.out.println("it is same");
	else
	System.out.println("It is not same");
	}
	catch(NullPointerException e)
	{
	System.out.println("Null point exception caught");
	}
	}
	}

