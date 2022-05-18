
public class Course {
	private String name;
	private int targetGrade;
	private double rating;
	
	public Course(String string, int i, double d) {
		this.name = string;
		this.rating =d;
		this.targetGrade = i;
	}

	public String toString() {
		return "Course ( " + this.name + " / " + this.targetGrade + " / " + this.rating + " )";
	}
	//Course ( (name) / (targetGrade) / (rating) )

	
}
