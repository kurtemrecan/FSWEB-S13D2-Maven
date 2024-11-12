package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number){

        int orgNumber = number;
        int reversedNumber = 0;

        while(number != 0){
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            number /= 10;
        }
        return orgNumber == reversedNumber;
    }

    public static boolean isPerfectNumber(int number){
        if(number <= 0){
            return false;
        }
        int bolenlerToplami = 0;

        for (int i = 1; i < number; i ++){
            if(number % i == 0) {
                bolenlerToplami += i;
            }
        }
        return bolenlerToplami == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        char[] digits = String.valueOf(number).toCharArray();
        String numToText = "";
        for (char digit : digits) {
            switch (digit) {
                case '0':
                    numToText += "Zero ";
                    break;
                case '1':
                    numToText += "One ";
                    break;
                case '2':
                    numToText += "Two ";
                    break;
                case '3':
                    numToText += "Three ";
                    break;
                case '4':
                    numToText += "Four ";
                    break;
                case '5':
                    numToText += "Five ";
                    break;
                case '6':
                    numToText += "Six ";
                    break;
                case '7':
                    numToText += "Seven ";
                    break;
                case '8':
                    numToText += "Eight ";
                    break;
                case '9':
                    numToText += "Nine ";
                    break;
            }
        }

        return numToText.trim();
    }

}
