
public class Seat {
	//instance vars
	int row;
	int column;
	Student studentInSeat;  //studen assigned to this seat, otherwise null
	
	public Seat(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public void putStudentInSeat(Student student) {
		this.studentInSeat = student;	
	}
	
	//Returns the row, column and student for this seat
	public String toString() {
		return this.row + "," + this.column + ": " + this.studentInSeat;//this will also call the toString method in the student class
	}
	
	

}
