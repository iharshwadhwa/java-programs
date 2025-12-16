package OopsPractice;

public class Employee implements Comparable<Employee>{
    private String name;
    private int age;

    public Employee(String name, int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public int compareTo(Employee other){
        return Integer.compare(this.age,other.age);
    }
}
