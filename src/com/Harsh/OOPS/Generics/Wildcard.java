package com.Harsh.OOPS.Generics;

import java.util.Arrays;
//here t should be number or its subclasses
    public class Wildcard<T extends Number > {

        private T[] data;
        private static final int DEFAULT_SIZE = 10;
        private int size = 0; // also working as an index value

        @SuppressWarnings("unchecked")
        public Wildcard() {
            data = (T[]) new Object[DEFAULT_SIZE];
        }

        public void add(T num) {
            if (isFull()) {
                resize();
            }
            data[size++] = num;
        }

        private boolean isFull() {
            return size == data.length;
        }

        public T remove() {
            return data[--size];
        }

        public T get(int index) {
            return data[index];
        }

        public int size() {
            return size;
        }

        public void set(int index, T value) {
            data[index] = value;
        }

        @SuppressWarnings("unchecked")
        private void resize() {
            T[] temp = (T[]) new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        @Override
        public String toString() {
            return "CustomGenArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
        }

        public static void main(String[] args) {
            Wildcard<Integer> list3 = new Wildcard<>();
            for (int i = 0; i < 14; i++) {
                list3.add(2 * i);
            }
            System.out.println(list3);


        }
    }
