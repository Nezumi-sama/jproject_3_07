package ru.netology.stat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

class statisticsServiceTest {
    statisticsService statistic = new statisticsService();
    int[] salesOfMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void testSumOfAllSales() {
        long expected = 180;
        long result = statistic.sumOfAllSales(salesOfMonth);
        Assertions.assertEquals(result, expected);
    }

    @Test
    void testAverageAmount() {
        long expected = 15;
        long result = statistic.averageAmount(salesOfMonth);
        Assertions.assertEquals(result, expected);
    }

    @Test
    void testNumberMaxMonth() {
        long expected = 8;
        long result = statistic.numberMaxMonth(salesOfMonth);
        Assertions.assertEquals(result, expected);
    }

    @Test
    void testNumberMinMonth() {
        long expected = 9;
        long result = statistic.numberMinMonth(salesOfMonth);
        Assertions.assertEquals(result, expected);
    }

    @Test
    void testLessAverageAmount() {
        long expected = 5;
        long result = statistic.lessAverageAmount(salesOfMonth);
        Assertions.assertEquals(result, expected);
    }

    @Test
    void testMoreAverageAmount() {
        long expected = 5;
        long result = statistic.moreAverageAmount(salesOfMonth);
        Assertions.assertEquals(result, expected);
    }
}