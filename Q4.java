package com.exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class  StudentManager{
	ArrayList<String> sList=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	public void addStudent() {
		while (true) {
			
			System.out.println("Enter name of student you want to add or (press E to exit)");
			String name=sc.next();
			if (name.equalsIgnoreCase("e")) {
				break;
			}
			sList.add(name);
		}
		
	}
	public void removeStudent() {
		System.out.println("Enter name of student you want to remove :");
		String name=sc.next();
		boolean Flag=false;
		for (String string : sList) {
			if (name.equalsIgnoreCase(string)) {
				sList.remove(string);
				Flag=true;
			}
		}
		if (Flag) {
			System.out.println("Student remove successfully !!");
			
		}else {
			System.out.println("Student not found");
		}
		
	}
	public void Display() {
		for (String string : sList) {
			System.out.println(string);
		}
		
	}
}
public class Q4 {
	public static void main(String[] args) {
		StudentManager s1=new StudentManager();
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("Enter 1 for add Students");
			System.out.println("Enter 2 to remove Students");
			System.out.println("Enter 3 print Students detail");
			System.out.println("Enter 4 to exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				
				s1.addStudent();
				break;
			case 2:
				
				s1.removeStudent();;
				break;
			case 3:
				
				s1.Display();;
				break;
			case 4:
				
				break;

			default:
				break;
			}
			
			
		} while (ch!=4);
				
	}
}
