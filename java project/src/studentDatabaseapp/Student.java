package studentDatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstname;
	private String lastname;
	private String Year;
	private String StudentId;
	private String courses ="";
	private int tutionbalance =0;
	private  static int costOfCourses=600;
	private static int id=1000;
	
	//constructor prompt user to enter name and year
	public Student()
	{
		Scanner in = new Scanner(System.in);
         System.out.print("Enter Student first name:");
         this.firstname=in.nextLine();
         
         System.out.print("Enter Student last name:");
         this.lastname=in.nextLine();
         
         System.out.print("1-First Year \n2-Second Year \n3-Third Year \n4.Final Year\nEnter Student class level");
         this.Year=in.nextLine();
         
         setStudentId();
         
        // System.out.println(firstname+""+lastname+""+Year+""+StudentId);
         
         
        
	}
	//Generate Id
	private void setStudentId() {
		//Gradelevel+Id
		id++; 
		this.StudentId= Year+id;
	}
	
	//Enroll to courses
	public void enroll() {
		//Get inside a loop
		do {
		System.out.print("Enter course to enroll(Q to quit):");
		Scanner sc=new Scanner(System.in);
		String course=sc.nextLine();
		if(!course.equals("Q")) {
			courses = courses+"\n"+course;
			tutionbalance=tutionbalance + costOfCourses;
		  }
		
		else {
			//System.out.println("Break!");
			break;
			}
		}while(1 != 0);
	//	System.out.println("Entrolled In:"+courses);
		//System.out.println("Tuition balance:"+ tutionbalance);
 
	  
	}


	//view balance
	public void viewbalance() {
		System.out.println("your balance is rs"+tutionbalance);
	}
	//Pay Tuition
	public void payTuition() {
		viewbalance();
		System.out.print("Enter your payment: rs");
		Scanner sc=new Scanner(System.in);
		int payment=sc.nextInt();
		tutionbalance=tutionbalance-payment;
		System.out.println("Thank you for your payment of rs"+payment);
		viewbalance();
	}
	//show Status
  public String showInfo() {
	  return "Name:"+firstname+" "+lastname+"\nYear: "+Year+"\n StudentId="+StudentId+
	  	 "\nCourses Enrolled:"+courses+"\n Balance:rs"+tutionbalance;
			  
  }
}
