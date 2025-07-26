package com.Harsh.OOPS.Acces;

public class ObjectDemo {

    int num;
    float gpa;
    public ObjectDemo(int num,float gpa){
        this.num=num;
        this.gpa =gpa;
    }

    //already covered these 2
    @Override
    public String toString() {
        return STR."ObjectDemo{num=\{num}}";
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
        //return num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num== ((ObjectDemo)obj).num;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34,56.8f);
//        ObjectDemo obj2 = new ObjectDemo(34);
//        ObjectDemo obj2 = obj;
        ObjectDemo obj2= new ObjectDemo(34 ,78.9f);
        if(obj == obj2){
            System.out.println("Obj is equal than obj2");
        }
        if(obj.equals(obj2)){
            System.out.println("Obj is equal to obj2");
        }
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }
}
