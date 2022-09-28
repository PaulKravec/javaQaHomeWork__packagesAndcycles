package ru.netology.sqr;

public class SQRService {
    public int calculateSQR(int min, int max) {

        int score = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (min <= square && square <= max) ;
            {
                score++;
            }
        }
        return score;
    }
}
