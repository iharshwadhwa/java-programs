package OopsPractice;

public class Test2 {
    public static void main(String[] args) {
//        Generics gen = new Generics();
//        gen.setValue(2);
//        System.out.println((String)gen.getValue()); it will give a class cast exception error

        Generics<String, Integer> gen = new Generics<>("Harsh",21); //Generics<Integer> is a generic class
//        gen.setValue(1);    //the type parameter t is replaced by integer type which is a wrapper class
//        System.out.println(gen.getValue());
//        gen.setValue("Harsh"); it will throw an error required type integer provided string
    }
}
