package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args){
        Computer computer = new Computer(1024, 16, "Lenovo");
        Laptop laptop = new Laptop(2000, 8,"HP", false);
        SmartPhone smartPhone = new SmartPhone(1900, 16, "Apple", "314-520-6962");

        System.out.println(computer.getIdField());

        System.out.println(laptop.getIdField());

        System.out.println(smartPhone.getIdField());
    }
}
