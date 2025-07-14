package com.Harsh.OOPS.Constructors;
import java.util.*;
public class Copy_constructor {
    public static void main(String[] args) {
        Book1 book= new Book1();
        Book1 b2 = new Book1("Wings of fire","APj",200);
        Book1 b3= new Book1(b2);
        book.display();
        b2.display();
        b3.display();
    }
}
class Book1{
    String title;
    String author;
    int price;

    Book1() {
        this("untitled","Unknown",0);
    }
    Book1(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    Book1(Book1 other){
        this.title=other.title;
        this.author=other.author;
        this.price=other.price;
    }
   void display(){
       System.out.println("Book title: "+title+" author is: "+author+ " price is: "+price);
   }

}

