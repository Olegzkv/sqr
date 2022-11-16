package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;

public class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void CalculateSqrMiddle() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calcSqrt(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void CalculateSqrNot() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSqrt(0, 99);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void CalculateSqrAll() {
        SQRService service = new SQRService();
        int expected = 85;
        int actual = service.calcSqrt(50, 9_000);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void CalculateSqrLast() {
        SQRService service = new SQRService();
        int expected = 15;
        int actual = service.calcSqrt(7_000, 11_000);
        Assertions.assertEquals(expected, actual);
    }
}