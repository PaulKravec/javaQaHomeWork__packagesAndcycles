package ru.netology.sqr;

public class SQRService {
    public int calculateSQR(int min, int max) {

        int score = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min){
                if (i * i <= max) {
                    score++;
                }
            }
        }
        return score;
    }
}
