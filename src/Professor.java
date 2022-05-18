import java.util.ArrayList;

public class Professor extends Person{
	private String Lab;
	private int NumOfPaper;
	private ArrayList <String> ResearchTopic = new ArrayList <String>();
	
	public Professor(String string, int i, String string2, int j, ArrayList<String> arrayList) {
		super(string,i);
		this.Lab=string2;
		this.NumOfPaper=j;
		this.ResearchTopic=arrayList;
	}
	
	public String toString() {
		return "Professor ( " + super.toString() + " / " + this.Lab + " / " + this.NumOfPaper + " / " + this.ResearchTopic + " )";
	}
}
