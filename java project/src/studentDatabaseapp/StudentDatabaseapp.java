//Scenario:you are database administrator for a university and need to create an application to manage student 
//enrollments and balance.
//Application Should:
//	1.Ask the user how many student added to the database
//	2.The user should prompt to enter the name and year of each student
//	3.The student should have 5-digit unique id,with first name being thr=eir grade level
//	4.The student can enroll in the following courses:
//		*History
//		*Mathematics
//		*English
//		*Chemistry
//		*Computer Science
//	5.Each course cost 600
//	6.The student Should able to view their balance and pay the tuition fee
//	7.To see the Status of the Student,We should See their name id,Courses enrolled and balance
package studentDatabaseapp;

import java.util.Scanner;

public class StudentDatabaseapp {

	public static void main(String[] args) {
			
//		Student S2=new Student();
//		S2.enroll();
//		S2.payTuition();
//		System.out.println(S2.showInfo());	
//		Student S3=new Student();
//		S3.enroll();
//		S3.payTuition();
//		System.out.println(S3.showInfo());
		
		
	//Ask how many new users we want to add
		System.out.println("Enter the no of student to enroll");
		Scanner sc=new Scanner(System.in);
		int numofStudent=sc.nextInt();
		Student[] students=new Student[numofStudent];
		
		//create n numbers of new student
		for(int n=0;n<numofStudent;n++) {
			students [n]=new Student();
			students [n].enroll();
			students [n].payTuition();
			//System.out.println(students [n].showInfo());	
			
		}
		for(int n=0;n<numofStudent;n++) {
			
			System.out.println(students [n].showInfo());	
			
		}
	}

}
