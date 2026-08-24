package OopsPractice;

public class GenericMethodExample {
    public <T,U> void printTwoItems(T item1, U item2){
        System.out.println(item1+" and "+item2);
    }

    public static void main(String[] args) {
        GenericMethodExample example = new GenericMethodExample();
        example.printTwoItems("Harsh","Zainab");
        example.printTwoItems("Harsh",21);
    }
}
