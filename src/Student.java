
public class Student {

	String name;
	String ID;
	
	public Student (String name, String ID) {
		this.name = name;
		this.ID =ID;
	}
	
	//tell java how to represent a student as a string
	public String toString() {
		return this.name;
	}
}
