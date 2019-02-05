package org.academiadecodigo.bootcamp.calculator;


public class Playground {

    public static void main(String[] args) {

        Calculator c1 = new Calculator("Texas", "Black");
        System.out.println("Original Brand is: "+ c1.getBrand() + " and color: " + c1.getColor());

        SciCalc s1= new SciCalc("Casio", "Blue");




        System.out.println("Calculator is a " + c1.getBrand() + " and its " + c1.getColor());

        System.out.println("--------------SCICALC---------------");

        System.out.println(s1.power(2,3));
        System.out.println(s1.add(5, 10));
        System.out.println(s1.log(5));


    }

}
