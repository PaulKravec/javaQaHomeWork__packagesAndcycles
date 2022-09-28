package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/value.csv")
    public void testSquareInsideMinMax (int expected, int min, int max) {
        SQRService service = new SQRService();
        int actual = service.calculateSQR(min, max);

        Assertions.assertEquals(expected, actual);
    }
}
