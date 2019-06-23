package com.dsimon;

public class NumberToWords {
    public static int getDigitCount(int number) {
        int digitCount = 0;
        if (number == 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            while (number > 0) {
                number /= 10;
                digitCount++;
            }
            return digitCount;
        }
    }

    public static int reverse(int number) {
        int newNumber = 0;
        while (number != 0) {
            newNumber *= 10;
            newNumber += number % 10;
            number /= 10;
        }
        return newNumber;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int digitCount = getDigitCount(number);

            number = reverse(number);

            int newDigitCount = getDigitCount(number);

            if (number == 0) {
                System.out.println("Zero");
            } else {
                while (number > 0) {
                    int currentDigit = number % 10;
                    switch(currentDigit) {
                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                    }
                    number /= 10;
                }
                while(digitCount > newDigitCount) {
                    System.out.println("Zero");
                    digitCount--;
                }
            }
        }

    }
}
