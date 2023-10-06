package com.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

//import com.main.books;

class Books{
	int ISBN;
	String Title;
	String Author;
	
	public Books(int iSBN, String title, String author) {
		super();
		ISBN = iSBN;
		Title = title;
		Author = author;
	}

	@Override
	public String toString() {
		return "Books [ISBN=" + ISBN + ", Title=" + Title + ", Author=" + Author + "]";
	}
	
	
	
}
class ReferenceBook extends Books{
	
	String category;

	public ReferenceBook(int iSBN, String title, String author, String category) {
		super(iSBN, title, author);
		this.category = category;
	}

	@Override
	public String toString() {
		return "ReferenceBook [category=" + category + ", ISBN=" + ISBN + ", Title=" + Title + ", Author=" + Author
				+ "]";
	}	
	
}
class Library1{
	LinkedList<Books> bList=new LinkedList<Books>();
	Map<String, LinkedList<Books>> BLibrary=new HashMap<String, LinkedList<Books>>();
	
	Scanner sc=new Scanner(System.in);
	
	public void AddBookWithCategory() {
		System.out.println("Enter ISBN of Book :");
		int id=sc.nextInt();
		System.out.println("Enter title of book : ");
		String name=sc.next();
		System.out.println("Enter Author of Book :");
		String author=sc.next();
		System.out.println("Enter Category of Book :");
		String cat=sc.next();
		bList.add(new Books(id, name, author));
		BLibrary.put(cat, bList);
		
		
		System.out.println("Book Added successfully ");
		
	}
	public void removeBook() {
		for (Books books : bList) {
			System.out.println(books);
		}
		System.out.println("Enter book name you want to remove :");
		String name=sc.next();
		
		boolean Flag=false;
		Iterator<Books> it=bList.iterator();
		while (it.hasNext()) {
			Books books = (Books) it.next();
			if (name.equalsIgnoreCase(books.Title)) {
				it.remove();
				Flag=true;
			}
		}
		if (Flag) {
			System.out.println("Book removed"+ name+"successfull !!");
			
		}else {
			System.out.println("Book not found");
		}
		
	}
	public void Display() {
		for (Map.Entry<String, LinkedList<Books>> entry : BLibrary.entrySet()) {
	        String key = entry.getKey();
	        LinkedList<Books> bookList = entry.getValue();

	        for (Books book : bookList) {
	            System.out.println("Book details: " + book);
	        }
	        System.out.println("Books in category: " + key);
	    }
		
	}
	
}
public class Q6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		Library1 library1=new Library1();
		do {
			System.out.println("Enter 1 to add book with category :");
			System.out.println("Enter 2 to remove book with name :");
			System.out.println("Enter 3 to dispaly libray :");
			System.out.println("Enter 4 to exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				library1.AddBookWithCategory();
				break;
			case 2:
				library1.removeBook();
				break;
			case 3:
				library1.Display();
				break;
			case 4:
				
				break;

			default:
				break;
			}
			
		} while (ch!=4);
	}
}
