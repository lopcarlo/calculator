package org.academiadecodigo.bootcamp.calculator;


public class Playground {

    public static void main(String[] args) {

        Calculator c1 = new Calculator("Texas", "Black");
        System.out.println("Original Brand is: "+ c1.getBrand() + " and color: " + c1.getColor());

        Calculator c2 = new Calculator("Casio", "Blue");
        System.out.println("Original Brand is: "+ c2.getBrand() + " and color: " + c2.getColor());

        c2.setColor("Green");

        System.out.println("Calculator is a " + c1.getBrand() + " and its " + c1.getColor());
        System.out.println("Calculator is a " + c2.getBrand() + " and its " + c2.getColor());


        System.out.println(c1.add(3, 8));
        System.out.println("Battery Level " + c1.getBatterie());
        System.out.println(c1.divide(10, 2.0));
        System.out.println("battery level " + c1.getBatterie());
        System.out.println(c2.add(20, 50) + " " + "Battery level "+ c2.getBatterie());
        System.out.println("Recharging" + c1.recharge());

        System.out.println(c1.subtract(10, 5));
        System.out.println("battery level " + c1.getBatterie());
        System.out.println(c2.add(20, 50) + " " + "Battery level " + c2.getBatterie());
        System.out.println(c1.multiply(10, 5));
        System.out.println("battery level " + c1.getBatterie());
        System.out.println("Recharging" + c1.recharge());
        System.out.println(c2.add(20, -50) + " " + "Battery level " + c2.getBatterie());

        System.out.println("battery level " + c1.getBatterie());
        System.out.println(c2.add(32, 4));

        System.out.println(c1.multiply(10.1, 5));
        System.out.println(c1.multiply(10, 5));
        System.out.println("battery level " + c1.getBatterie());
        System.out.println(c2.add(20, 50) + " " + "Battery level "+ c2.getBatterie());
    }

}
