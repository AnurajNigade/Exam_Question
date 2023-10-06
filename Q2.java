package com.exam;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student 
{
	static String name;
	int studentId;
	Integer[] marks;
	float Average;
	char grade;
	
	public Student(String name, int studentId, Integer[] marks) {
		
		this.name = name;
		this.studentId = studentId;
		this.marks = marks;
	}
	
	public void GradesAssign()
	{
		
		if(Average > +80 && Average <+100)
		{
			grade = 'A';
		}
		else if(Average > +50 && Average <+80)
		{
			grade = 'B';
		}
		else
		{
			grade = 'C';
		}
	}
	public void CalculateAvgScore() 
	{
		Q2 Gb = new Q2();
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        
        Average = sum/Gb.noOfsubjects;
	}
}

public class Q2 
{	

	static int noOfsubjects;
	static Scanner sc = new Scanner (System.in);
	
	static List<Integer> Marklist = new ArrayList<Integer>();
	
	public static  Student getStudentDetails()
	{
		
		System.out.println("Enter the student Id");
		int StudentId = sc.nextInt();
		
		System.out.println("Enter the name");
		String name = sc.next();
		
		System.out.println("Enter the number of subject");
		noOfsubjects= sc.nextInt();
		if(noOfsubjects<0) {
			
			System.out.println("Invalid number of subjects");
			System.out.println("Enter the number of subjects");
			noOfsubjects=sc.nextInt();
		}
		
		
		for(int i =0; i<noOfsubjects; i++)
		{
		int t = i+1;
		System.out.println("Enter marks for subject:" +t);
		int m = sc.nextInt();
		Marklist.add(m);
		}
		
		Integer[] marks = new Integer[Marklist.size()];
		
		for (int i =0; i<Marklist.size(); i++)
		{
			marks[i] = Marklist.get(i);
		}	
		for (Integer x :marks )
		{	
		}
			
		Student S = new Student(name, StudentId, marks );
		return S;	
	}
	public static void main(String[] args) 
	{
		
		Student S2 = getStudentDetails();
		System.out.println("Id: " + S2.studentId);
		System.out.println("Name: " + Student.name);
		
		S2.CalculateAvgScore();
		System.out.println("Average " + S2.Average);
		
		S2.GradesAssign();
		System.out.println("Grade is:" + S2.grade);
			
	}

}