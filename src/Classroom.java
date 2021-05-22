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
        //initialize seats array
		this.seats = new Seat[rows][columns];
		
		//populate seats array with instances of seat class
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
