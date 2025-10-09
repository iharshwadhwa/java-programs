package com.Harsh.Strings;
import java.util.*;
public class Stringbuffer {
    public static void main(String[] args) {

        //constructor 1
        StringBuffer sb = new StringBuffer(); // it will create an empty string buffer (constructo 1)
        System.out.println(sb.capacity());
        //constructor 2
        StringBuffer sb2= new StringBuffer("Harsh Wadhwa"); //it will create a string buffer object with string intialized

        //constructor 3
        StringBuffer sb3 = new StringBuffer(30); // we define the capacity of the object by default its 16

        sb.append("We make devs"); //append method to add string it modifies that object only
        sb.append(" is nice");
       // sb.insert(2," Rahul"); //to insert
        sb.replace(1,5,"Wadhwa "); //last index is not included
        sb.delete(1,5);
        //sb.reverse();

        String str = sb.toString();
        System.out.println(str);
    }
}
