package businesslogic;

public class ExampleClass {
	private int callCount = 0;
	
	public void function()
	{
		callCount++;
	}
	
	public void addN(int n)
	{
		callCount += n;
	}
	
	public int getCallCount()
	{
		return callCount;
	}
}
