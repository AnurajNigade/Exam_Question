package com.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Map<String, Integer> sList=new HashMap<String, Integer>();
		
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("Enter Name of student or(Enter O to exit)");
			String name=sc.next();
			
			if (name.equalsIgnoreCase("o")) {
				break;
			}
			System.out.println("Enter grade of student from 0 to 10");
			int grade=sc.nextInt();
			
			sList.put(name, grade);
			
		}
		
		for (Map.Entry<String, Integer> entry : sList.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("The name of student is "+key+" and grade is "+val);
			
		}
		double Average = 0;
		for (Map.Entry<String, Integer> entry : sList.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			Average+=val;
			
		}
		System.out.println("Average of all Student is : "+(Average/sList.size()));
		
	}
}
