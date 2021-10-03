package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldCalculateNumberInSquare() {
        SQRService sqrService = new SQRService();
        int expected = 3;
        int actual = sqrService.numberInSquareCalculator(200, 300);
        assertEquals(expected, actual);

    }
}