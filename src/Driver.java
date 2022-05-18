import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
	
	public static void main(String[] args) { 
	
		Student student1 = new Student("Olivia", 23, "Software", 3.85, new ArrayList<String>(Arrays.asList("Database", "Probability and Statistics", "Deep Learning")));
		Student student2 = new Student("Noah", 26, "Cyber Security", 4.0, new ArrayList<String>(Arrays.asList("Capston Design", "Cloud Service Security")));
		Student student3 = new Student("Emma", 21, "Digital Media", 3.5, new ArrayList<String>(Arrays.asList("Data Structure", "Object Oriented Programming")));
		
		Professor professor1 = new Professor("Austin", 60, "WISE", 153, new ArrayList<String>(Arrays.asList("MLOps", "Distributed Deep Learning", "Federated Learning")));
		
		Course course1 = new Course("Object Oriented Programming",2,4.12);
		
		Stack myStack = new Stack();
		Queue<Person> myQueue = new Queue();
		System.out.println("201920667 √÷¡ÿ≈¬");
		System.out.println("-----------------------------------Queue Test--------------------------------");
		
		
		myQueue.remove();
		myQueue.add(student1);
		myQueue.add(student2);
		myQueue.add(professor1);
		myQueue.front();
		myQueue.remove();
		myQueue.back();
		myQueue.add(student3);
		myQueue.size();
		myQueue.remove();
		myQueue.remove();
		myQueue.empty();
		
		myQueue.printQueue();

		
		System.out.println("-----------------------------------Stack Test--------------------------------");
		
		
		myStack.empty();
		myStack.push(1);
		myStack.push(student1);
		myStack.push(professor1);
		myStack.pop();
		myStack.pop();
		myStack.push(course1);
		myStack.pop();
		myStack.pop();
		myStack.push(3.14);
		myStack.push("hi");
		myStack.top();
		myStack.size();
		myStack.pop();
		
		myStack.printStack();
		
	}

}
 