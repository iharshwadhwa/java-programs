package com.Harsh.OOPS.InnerClasses.MemberInnerClass;

public class School {
    void announce(){
        class Teacher{
            void teach(){
                System.out.println("Teacher is teaching inside.");
            }
        }
        Teacher t1= new Teacher();
        t1.teach();
    }

    public static void main(String[] args) {
        School s1= new School();
        s1.announce();
    }
}

