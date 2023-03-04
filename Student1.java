package student;
import java.util.*;

public class Student1{
	public int rollNumber,marks1,marks2,marks3;
 	public String name,course;
	
 	
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int calculateTotal(int marks1, int marks2, int marks3){

		return marks1+marks2+marks3;
	}
	
	public double calculateAverage(int marks1, int marks2, int marks3){
		double avg;
		return avg=calculateTotal(marks1,marks2,marks3)/3;
		
	}
	
	public char grade(int marks1, int marks2, int marks3){
                int percentage = (calculateTotal(marks1,marks2,marks3)*100)/300;
               switch(percentage/10){
		case 9:return 'A';
		case 8:return 'B';
		case 7:return 'C';
		case 6:return 'D';
		case 5:return 'E';
                default: return 'F';
               
  		}
	}

	public String toString() {
		return "Student [name=" + name + ", marks1=" + marks1 + ", marks2=" + marks2 + ", marks3=" + marks3
				+ ", rollNumber=" + rollNumber+ ", course=" + course + "]";
	}
	}
	