package com.Harsh.OOPS.InnerClasses;

public class Computer {
    private String brand;
    private String model;
    private OperatingSystem os;

    public Computer(String brand, String model,String osname) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osname);
    }

    private class OperatingSystem{
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }
        public void displayInfo(){
            System.out.println("Computer Model: "+model+", OS: "+osName);
        }
    }
}
