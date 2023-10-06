package com.exam;
//OrderItem interface
interface OrderItem {
 double calculateTotalPrice();
}

//Electronics class
class Electronics implements OrderItem {
 private String itemName;
 private int quantity;
 private double unitPrice;

 public Electronics(String itemName, int quantity, double unitPrice) {
     this.itemName = itemName;
     this.quantity = quantity;
     this.unitPrice = unitPrice;
 }

 @Override
 public double calculateTotalPrice() {
     double totalPrice = quantity * unitPrice;
     double tax = totalPrice * 0.05;
     return totalPrice + tax;
 }
}

//Book class
class Book1 implements OrderItem {
 private String itemName;
 private int quantity;
 private double unitPrice;

 public Book1(String itemName, int quantity, double unitPrice) {
     this.itemName = itemName;
     this.quantity = quantity;
     this.unitPrice = unitPrice;
 }

 @Override
 public double calculateTotalPrice() {
     double totalPrice = quantity * unitPrice;
     if (quantity >= 5) {
         totalPrice -= totalPrice * 0.10; // 10% discount for 5 or more books
     }
     return totalPrice;
 }
}

//Clothing class
class Clothing implements OrderItem {
 private String itemName;
 private int quantity;
 private double unitPrice;

 public Clothing(String itemName, int quantity, double unitPrice) {
     this.itemName = itemName;
     this.quantity = quantity;
     this.unitPrice = unitPrice;
 }

 @Override
 public double calculateTotalPrice() {
     double totalPrice = quantity * unitPrice;
     if (totalPrice < 50) {
         totalPrice += 2; // $2 shipping fee for orders under $50
     }
     return totalPrice;
 }
}

public class Q8 {
 public static void main(String[] args) {
     OrderItem[] items = new OrderItem[3];

     // Create instances of each product type
     Electronics electronics = new Electronics("Smartphone", 2, 499.99);
     Book1 book = new Book1("Java Programming", 7, 29.99);
     Clothing clothing = new Clothing("T-Shirt", 4, 12.99);

     // Store instances in the array
     items[0] = electronics;
     items[1] = book;
     items[2] = clothing;

     // Calculate and print the total price for each product type
     for (OrderItem item : items) {
         System.out.println("Item: " + item.getClass().getSimpleName());
         System.out.println("Total Price: $" + item.calculateTotalPrice());
         System.out.println();
     }
 }
}
