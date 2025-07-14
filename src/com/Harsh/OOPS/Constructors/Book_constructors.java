package com.Harsh.OOPS.Constructors;
import java.util.*;
public class Book_constructors {
    public static void main(String[] args) {
        Book b1= new Book();
        Book b2= new Book("Wings of fire","APJ Abdul kalam");
        b1.display();
        b2.display();
    }
}

class Book{
    String title;
    String author;

    Book(){
        title="Two paths";
        author="Robert frost";
    }
    Book(String title,String author){
       this.title=title;
       this.author=author;
    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("--------------------");
    }
}
