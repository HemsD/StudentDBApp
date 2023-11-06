package studentApp;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		
		
		
		//Ask how many students to be present in Database
		System.out.print("Enter the number of Students: ");
		Scanner s = new Scanner(System.in);
		int numOfStudents = s.nextInt();
		
		Student[] students = new Student[numOfStudents];
		
		for(int i = 0; i < numOfStudents; i++) {
			
			students[i] = new Student();
			students[i].enroll();
			students[i].payTution();
			
		}
		
		
		for(int i = 0; i < numOfStudents; i++) {
			System.out.println(students[i].showInfo());
			
		}
		}

	}


