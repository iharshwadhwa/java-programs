package com.Harsh.OOPS.Generics;
import java.util.*;
public class forEach_with_lambdas {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Harsh","Amit","Riya");
        names.forEach(name-> System.out.println("Hello "+name));
    }
}
