package com.Harsh.OOPS.Final;

public class Bank {
    static class Loan{
        void info(){
            System.out.println("prints something");
        }
    }

    public static void main(String[] args) {
        Bank.Loan l1= new Loan();
        l1.info();
    }
}

