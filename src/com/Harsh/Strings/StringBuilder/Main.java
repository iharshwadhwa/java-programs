package com.Harsh.Strings.StringBuilder;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        Task t1= new Task(sb);
        Task t2= new Task(sb);

        //default capacity char array (16)
        // when it's full it applies the same technique of arraylist
        //mutable
        // not thread safe bcz it's mutable
        //method chaining means applying multiple methods in a single line
//        str1.append(" World").append("!");
//        System.out.println(str1);
//        String string=str1.toString();
//        System.out.println(string);

        //string buffer working is like string builder
        //thread-safe
    }
}
class Task extends Thread{
    private StringBuilder sb;
    public Task(StringBuilder sb){
        this.sb=sb;
    }
    @Override
    public void run(){
        for(int i =0;i<1000;i++){
            sb.append("a");
        }
    }
}
