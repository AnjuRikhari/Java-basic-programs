class OverFlow extends Exception
{
	int topValue;
	public
	OverFlow(int s)
	{
		topValue=s;
	}
	public String toString()
	{
		return "Stack Overflow Exception has occured: top is: "+topValue;
	}
}

class UnderFlow extends Exception
{
	int topValue;
	public
	UnderFlow(int s)
	{
		topValue=s;
	}
	public String toString()
	{
		return "Stack Underflow Exception has occured: top is: "+topValue;
	}
}

class Stack
{
	int top,size,arr[];
	
	public
	
	Stack(int s)
	{
		top=-1;
		size=s;
		arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=0;
	}
	
	void push(int n) throws OverFlow
	{
		if(top>=size-1)
			throw new OverFlow(top);
		else
			arr[++top]=n;
	}
	
	int pop() throws UnderFlow
	{
		if(top==-1)
			throw new UnderFlow(top);
		else
			return arr[top--];
	}
	
	void print()
	{
		System.out.println("The Values onto the stack are: ");
		for(int i=0;i<size;i++)
			System.out.println(arr[i]);
	}
}

public class StackException {

	public static void main(String args[])
	{
		Stack s=new Stack(3);
		try
		{
			s.push(9);
			s.push(8);
			s.push(7);
			s.push(6);
			s.push(5);
			s.push(4);
			
		}catch(OverFlow e) {
			System.out.println("Caught: "+e);
		}
		
		try
		{
			System.out.println("popped value is : "+s.pop());
			System.out.println("popped value is : "+s.pop());
			System.out.println("popped value is : "+s.pop());
			System.out.println("popped value is : "+s.pop());
			
		}
		catch(UnderFlow e) {
			System.out.println("Caught :"+e);
		}
		
		finally
		{
			s.print();
		}
	}
}
