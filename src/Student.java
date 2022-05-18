import java.util.ArrayList;

public class Student extends Person{
	private String major;
	private double grade;
	private ArrayList <String> TakingCourses = new ArrayList <String>();
	
	public Student(String string, int i, String string2, double d, ArrayList<String> arrayList) {
		super(string,i);
		this.major = string2;
		this.grade=d;
		this.TakingCourses=arrayList;
	}
	
	public String toString() {
		return "Student ( " + super.toString() + " / " + this.major + " / " + this.grade + " / " + this.TakingCourses+" )";
	}
}
