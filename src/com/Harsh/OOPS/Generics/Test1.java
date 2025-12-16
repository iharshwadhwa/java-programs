package com.Harsh.OOPS.Generics;

public class Test1 {
    interface printable {
        void print();
    }

    static class Mynumber extends Number implements printable {
        private final int value;

        public Mynumber(int value) {
            this.value = value;
        }

        @Override
        public void print() {
            System.out.println("MyNumber: " + value);
        }

        @Override
        public int intValue() {
            return value;
        }

        @Override
        public long longValue() {
            return value;
        }

        @Override
        public float floatValue() {
            return value;
        }

        @Override
        public double doubleValue() {
            return value;
        }
    }

    static class Boxx<T extends Number & printable> {
        private T item;

        public Boxx(T item) {
            this.item = item;
        }

        public void display() {
            item.print();
        }

        public T getItem() {
            return item;
        }

    }

    public class Test {
        public static void main(String[] args) {
            Mynumber mynumber= new Mynumber(12);
            Boxx<Mynumber> box = new Boxx<>(mynumber);
            box.display();
        }
    }

}