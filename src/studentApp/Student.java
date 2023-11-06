package studentApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String course="";
	private static int costOfCourse = 600;
	private int tutionBalance = 0;
	private static int id = 1000;

	//Constructor - prompt student's name and gradYear
	
	public Student() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Student's firstname: ");
		this.firstName = s.nextLine();
		
		System.out.print("Enter Student's lastname: ");
		this.lastName = s.nextLine();
		
		System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student's level: ");
		this.gradeYear = s.nextInt();
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear+ " " + studentID);
		
		
	}
	
	//Generate student ID
	
	public void setStudentID() {
		
		//grade year + ID
		id++;
		this.studentID = gradeYear + "" + id;
		
		
	}
	
	//Enroll courses
	
	public void enroll() {
		
		do {
		
		System.out.print("Enter course name (Q to quit): ");
		
		Scanner s = new Scanner(System.in);
		
		String courseName = s.nextLine();
			
		if (!courseName.equals("Q")) {
			course = course + "\n" +courseName;
			//System.out.println(course);
			tutionBalance = tutionBalance + costOfCourse;
		}
		else {
			break;
		}
		
		
		}while(1 != 0);
		
		//System.out.println("Course name is " + courseName);
		//System.out.print("Enrolled Courses:" + course);
		//System.out.println("tution balance: " + tutionBalance);
		
	
			
	}
	
	
	//show balance
	
	public void viewBalance() {
		
		System.out.println("Your Tution balance is $"+tutionBalance);
	}
	
	//pay tution
	
	public void payTution() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner s = new Scanner(System.in);
		int payment = s.nextInt();
		tutionBalance = tutionBalance-payment;
		//System.out.println("Your balance is $"+tutionBalance);
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
		
	}
	
	//Show status
	
	public String showInfo() {
		
		return "Name: " + firstName + lastName +
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nEnrolled Courses: " + course +
				"\nTution Balance: " + tutionBalance;
				
	}
	
}
