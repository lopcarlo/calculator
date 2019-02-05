package org.academiadecodigo.bootcamp.calculator;

/**
 * Created by codecadet on 05/02/2019.
 */
public class SciCalc extends Calculator{

    public SciCalc(String brand, String color) {
        super(brand, color);
    }

    public double power(double number, double power ){
        return Math.pow(number,power);
    }

    public double log (double a){
        return Math.log(a);
    }


    public double sin (double n){
        return Math.sin(n);
    }

    public double square (double num){
        return Math.sqrt(num);
    }



}
