package OopsPractice;

import com.Harsh.OOPS.Final.Bank;

public class BankAccount {
    public void divide(int a,int b){
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("arithmetic exception ");
        }
        finally{
            System.out.println("execution successfully;");
        }
    }

    public static void main(String[] args) {
        BankAccount A1= new BankAccount();
        A1.divide(3,0);
    }
}
