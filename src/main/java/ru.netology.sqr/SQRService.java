package ru.netology.sqr;

public class SQRService {
    public int numberInSquareCalculator(int lowLimit, int highLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
                if ((i * i >= lowLimit) && (i * i <= highLimit)){
                     counter = counter + 1;
            }
        }
        return counter;
    }
}

