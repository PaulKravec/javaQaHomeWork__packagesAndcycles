package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @Test
    public void minMaxSQRService() {

        SQRService service = new SQRService();

        int actual = service.calculateSQR(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void minMaxSQRServiceLimitValue() {

        SQRService service = new SQRService();

        int actual = service.calculateSQR(10, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void minMaxSQRServiceLowerLimitValue() {

        SQRService service = new SQRService();

        int actual = service.calculateSQR(9, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void minMaxSQRServiceHigherLimitValues() {

        SQRService service = new SQRService();

        int actual = service. calculateSQR(11, 121);
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void minMaxSQRServiceMaximumValues() {

        SQRService service = new SQRService();

        int actual = service.calculateSQR(99 , 9801);
        int expected = 90;

        Assertions.assertEquals(expected,actual);
    }
    // Можно больше сделать случаев, квадратов ведь много:)
}

