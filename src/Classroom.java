import java.util.ArrayList;

/**
 * represents a classroom with students
 * Each classroom has a list of students
 * and an array that represents the seats in the classroom.
 * 
 * @author user
 *
 */
public class Classroom {

	//instance vars
	
	String buildingName;
	String roomName;
	ArrayList<Student> students;
	Seat[][] seats;
	
	//constructor
	/**
	 * 
	 * @param buildingName
	 * @param roomName
	 * @param rows
	 * @param columns
	 */
	public Classroom(String buildingName, String roomName, int rows, int columns) {
		//set instance vars with given parameters : building and room name
		this.buildingName = buildingName;
		this.roomName = roomName;
        //instantiate seats array(create array object with Seat type)
		this.seats = new Seat[rows][columns];
		
		//populate seats array with instances of seat class (create Seat object)
		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				this.seats[i][j] = new Seat(i,j);
			}
		}
		//instantiate student list
		this.students = new ArrayList<Student>();	
	}
	//add the given student to student list
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	//find available seat and assign to the given student
	public void assignStudentToSeat(Student student) {
		int rows = this.seats.length;
		int columns = this.seats[0].length;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				if (this.seats[i][j].studentInSeat == null) {
					//this.seats[i][j] is Seat object variable
					this.seats[i][j].putStudentInSeat(student);
					
					//exit loop and method all at once
					return;
				}
			}
		}
	}
	
	public void printAllStudents() {
		System.out.println("Students in class: ");
		
		for(Student student : this.students) {
			System.out.println(student); //this will call the toString method in the Student class
		}
	}
	
	public String toString() {
		String s = "\n";
		int rows = this.seats.length;
		int columns = this.seats[0].length;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				s += this.seats[i][j] + "\t";  //tab
			}
			s += "\n"; //add new line at end of each row
		}
		
		return s;
	}
	
	
	public static void main(String[] args) {
		//create classroom
		Classroom myClass = new Classroom("Building A", "room 123", 5, 10);
		
		//create student
		Student Tom = new Student("tom", "tm");
		Student Judy = new Student("judy", "jd");
		Student Lily = new Student("lily", "ll");
		
		//add student to classroom (student ArrayList)
		myClass.addStudent(Lily);
		myClass.addStudent(Judy);
		myClass.addStudent(Tom);
		
		//add student to seat
		myClass.assignStudentToSeat(Lily);
		myClass.assignStudentToSeat(Judy);
		myClass.assignStudentToSeat(Tom);
		
		//print list of all students
		myClass.printAllStudents();
		
		//print classroom itself
		System.out.println(myClass);
		
		

	}

}
