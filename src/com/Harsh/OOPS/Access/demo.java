package com.Harsh.OOPS.Access;
public class demo {
    public class objectdemo {

        int num;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
        }
    }

    public void main(String[] args) {

        objectdemo obj = new objectdemo();

    }
}
