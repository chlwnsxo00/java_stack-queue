
public class Stack<E>{

	private int top;
	private int stackSize=100;
	private Object[] stackArr;
	public Stack()
	{
		top=-1;
		this.stackSize=100;
		stackArr = new Object[this.stackSize];	
	}
	
	public E push(E p) {
		if(top == 99)
		{
			System.out.println("Stack is full!");
		}
		else
		{
			stackArr[++top]=p;
			System.out.println("Added "+ p + " to the stack.");
		}
		return p;
	}
	public void pop() {
		if(top == -1)
		{
			System.out.println("The command cannot be performed because the stack is empty.)");
		}
		else 
		{
			System.out.println("removed "+ stackArr[top--] + " from the stack.");
		}
	}
	public void top() {
		System.out.println("The top is "+ stackArr[top]);
	}
	public void empty() {
		if(top == -1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Stack is not empty");
		}
	}
	public void size() {
		System.out.println("The size of the stack is " + (top+1));
	}
	public void printStack() {
		System.out.println("=====================print stack========================");
		System.out.println("");
		for (int i=1;i<=top+1;i++)
		{
			System.out.println( i + "th element is " + stackArr[i-1]);
		}
		System.out.println("");
		System.out.println("=========================================================");
	}
}
