package OopsPractice;

public class Pair {

//    public <A extends Number,B extends String> Pair(A first, B second){
//        System.out.println("First: "+first+", second: "+second);
//    }
    public <T> void printArray( T[] array){
        for(T element:array){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pair pair = new Pair();
        Integer [] array = {1,2,3,4,5};
        String[] str= {"H","A","R","S","H"};
        pair.printArray(array);
        pair.printArray(str);
    }
}
