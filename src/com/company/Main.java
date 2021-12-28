package com.company;

public class Main {

    public static void main(String[] args) {
        double[] nums = {2.4, 4.2, 5.4, -4.5, 6.2, -8.4, 8.6, -7.4, 4.5, 5.6, -6.7, 8.9, 1.2, 2.3, 4.5};
        boolean checkNegativeNumber = false;
        double number = 0;
        int amount = 0;
        for (double num : nums) {
            if (num < 0) {
                checkNegativeNumber = true;
            } else if (checkNegativeNumber) {
                number = num + number;
                amount++;
            }
        }
        System.out.println(number);
        System.out.println(amount);
        System.out.println(number / amount);
    }
}

