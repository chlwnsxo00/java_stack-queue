import java.util.ArrayList;
import java.util.Collection;

public class Queue<T extends Person>{
	private ArrayList<T> queue = new ArrayList<>();
	private int front;
	private int rear;
	
	public Queue() {
		ArrayList<T> queue = new ArrayList<>();
		this.rear=-1;
	}
	
	public void add(T data) {	
		queue.add(data);
		System.out.println("Added "+ queue.get(++rear) +" to the queue.");
	}

	public void remove() { 
		if(queue.isEmpty())
		{
			System.out.println("The command cannbot be performed because the stack is empty.");
		}
		else
		{
			System.out.println("Removed "+ queue.get(0)+ " from the queue");
			queue.remove(0);
			rear--;
		}
	}

	public void front() { 
		System.out.println("The front is "+ queue.get(0));
	}

	public void back() { 
		System.out.println("The back is "+ queue.get(rear));
	}

	public void empty() { 
		if(queue.isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.println("Queue is not empty");
		}
	}

	public void size() { 
		System.out.println("The size of the queue is "+ (rear+1));
	}
	
	public void printQueue() {
		System.out.println("=====================print stack========================");
		System.out.println("");
		for (int i=1;i<=rear+1;i++)
		{
			System.out.println( i + "th element is " + queue.get(i-1));
		}
		System.out.println("");
		System.out.println("=========================================================");
	}
}