package Lab2_3;

public class Student {
		private String studentid;
		private String name;
		private static int studentcount = 0; 
		
	 Student(String studentid, String name) {
	     this.studentid = studentid;
	     this.name = name;
	     studentcount++;
	 }
	}

