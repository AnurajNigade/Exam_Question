package com.exam;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Book{
	String title;
	int AvailableCopies;
	public Book(String title, int availableCopies) {
		super();
		this.title = title;
		AvailableCopies = availableCopies;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", AvailableCopies=" + AvailableCopies + "]";
	}
	
	
}
class Library
{
	Scanner sc=new Scanner(System.in);
	LinkedList<Book> bList=new LinkedList<Book>();
	
	public void addBook() {
		System.out.println("Enter title of book you want to add: ");
		String book=sc.next();
		System.out.println("Enter Number of books you want to add :");
		int copy=sc.nextInt();
		
		bList.add(new Book(book, copy));
	}
	
	public void loanBook() throws BookUnavailableException {
		System.out.println("Enter book name you want to loan :");
		String bookString=sc.next();
		
		Iterator<Book> it=bList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			
			if (bookString.equalsIgnoreCase(book.title) && book.AvailableCopies>0) {
				System.out.println("Book given to user on loan successfully");
				book.AvailableCopies--;
			}
			else {
				throw new BookUnavailableException("The book you want to lend is not available");
			}
		}
		
	}
	public void Display() {
		for (Book book : bList) {
			System.out.println(book);
		}
	}
	public void returnBook() throws  BookNotFoundException {
		System.out.println("Enter name of you want to return :");
		String name=sc.next();
		
		Iterator<Book> it2=bList.iterator();
		while (it2.hasNext()) {
			Book book = (Book) it2.next();
			
			if (name.equalsIgnoreCase(book.title)) {
				System.out.println("Book return successfully !!");
				book.AvailableCopies++;
				
			}else {
				System.out.println("Enter valid book to return");
				throw new BookNotFoundException("Book not found you want to return");
			}
		}
		
	}
}
class BookUnavailableException extends Exception{
	public BookUnavailableException(String str) {
		super(str);
	}
}
class BookNotFoundException extends Exception{
	public BookNotFoundException(String str) {
		super(str);
	}
}
public class Q1 {
	public static void main(String[] args) throws BookUnavailableException, BookNotFoundException {
		
		Library l1=new Library();
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("Enter 1 to add new book");
			System.out.println("Enter 2 to loan a book");
			System.out.println("Enter 3 to return a book");
			System.out.println("Enter 4 to show books in library");
			System.out.println("Enter 5 to exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				l1.addBook();
				break;
				
			case 2:
				l1.loanBook();
				break;
				
			case 3:
				l1.returnBook();
				break;
			
			case 4:
				l1.Display();
				break;
				
			case 5:
				break;
			default:
				break;
			}
		} while (ch!=5);
	}
}
