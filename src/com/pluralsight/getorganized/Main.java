package com.pluralsight.getorganized;

public class Main {

    public static void main(String[] args) {
        double number = Math.random() * 10;
        if (number != 0 && 5/number == 1) {
	        System.out.println(number);
        } else {
            System.out.println("oops");
        }
    }
}
