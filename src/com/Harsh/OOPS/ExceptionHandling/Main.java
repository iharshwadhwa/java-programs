package com.Harsh.OOPS.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=1;
        try {
            divide(a,b);
            String name="Harsh";
            if(name.equals("Harsh")){
                throw new CustomException("name is Harsh");
            }
        } catch(CustomException e){
            System.out.println("Custom Exception "+e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
            finally{
            System.out.println("THis will always execute");
        }
    }
   static int divide(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please do not divide by 0");
        }
        return a/b;
    }
}
