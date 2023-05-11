package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int digit, sum = 0;
        while (number>0){
            digit = number%10;
            number /= 10;
            sum += digit;
        }
        System.out.println(sum);
    }


}
