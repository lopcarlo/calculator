package org.academiadecodigo.bootcamp.calculator;


public class Calculator {

    private String brand;
    private String color;
    private int battery = 100;
    private int decreaseRate = 30;

    public Calculator(String brand, String color) {

        this.brand = brand;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }


    public void setColor(String color) {

       // String[] choices = {"Black", "White", "Brown", "Blue"};

        switch (color) {
            case "Black":
                this.color = color;
                break;
            case "White":
                this.color = color;
                break;
            case "Brown":
                this.color = color;
                break;
            case "Blue":
                this.color = color;
                break;
            default:
                System.out.println("Wrong Color choose another!!");

        }
    }

    public String setBrand() {
        return color;
    }

    public int getBatterie() {
        if (battery > 0) {
            return battery;
        } else {
            System.out.print("Dead Battery. Level: ");
            return 0;
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int add(int num1, int num2) {
        bateriedecrease();
        if (battery > 0) {
            System.out.print(num1 + " + " + num2 + " :");
            return num1 + num2;
        } else {
            System.out.println("System out of Battery: Please Recharche");
            return 0;
        }
    }

    public int subtract(int num1, int num2) {
        bateriedecrease();
        if (battery > 0) {
            System.out.print(num1 + " - " + num2 + " :");
            return num1 - num2;
        } else {
            System.out.print("System out of Battery, Please Recharche --Level :");
            return 0;
        }
    }

    public int multiply(int num1, int num2) {
        bateriedecrease();
        if (battery > 0) {
            System.out.print(num1 + " * " + num2 + " :");
            return num1 * num2;
        } else {
            System.out.println("System out of Battery: Please Recharche");
            return 0;
        }
    }

    public int divide(int num1, int num2) {
        bateriedecrease();
        if (battery > 0) {
            System.out.print(num1 + " / " + num2 + " :");
            return num1 / num2;
        } else {
            System.out.println("System out of Battery: Please Recharche");
            return 0;
        }
    }

    public double add(double num1, double num2) {
        bateriedecrease();
        if (battery > 0) {
            System.out.print(num1 + " + " + num2 + " :");
            return num1 + num2;
        } else {
            System.out.println("System out of Battery: Please Recharche");
            return 0;
        }
    }

    public double subtract(double num1, double num2) {
        bateriedecrease();
        if (battery > 0) {
            System.out.print(num1 + " - " + num2 + " :");
            return num1 - num2;
        } else {
            System.out.println("System out of Battery: Please Recharche");
            return 0;
        }
    }

    public double multiply(double num1, double num2) {
        bateriedecrease();
        if (battery > 0) {
            System.out.print(num1 + " * " + num2 + " :");
            return num1 * num2;
        } else {
            System.out.println("System out of Battery: Please Recharche");
            return 0;
        }
    }

    public double divide(double num1, double num2) {
        bateriedecrease();
        if (battery > 0) {
            System.out.print(num1 + " / " + num2 + " :");
            return num1 / num2;
        } else {
            System.out.println("System out of Battery: Please Recharche");
            return 0;
        }
    }

    public int recharge() {
        return battery = 100;
    }


    public int bateriedecrease() {
        battery -= decreaseRate;

        if (battery > 90) {
            System.out.println("Good Battery");
            return battery;
        }
        if (battery > 50) {
            System.out.println("Medium Battery");
            return battery;
        }
        if (battery > 25) {
            System.out.println("Low Battery");
            return battery;
        }

        if (battery > 0) {
            System.out.println("U gonna Loose the Power");
            return battery;
        } else {
            System.out.println("Dead Battery");
            return 0;

        }

    }


}
