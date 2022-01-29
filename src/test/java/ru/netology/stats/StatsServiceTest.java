package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    int[] salesBase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void amountAllSales() {
        StatsService service = new StatsService();
        int actual = service.amountAllSales(salesBase);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void averageSales() {
        StatsService service = new StatsService();
        int actual = service.averageSales(salesBase);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        int actual = service.minSales(salesBase);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        int actual = service.maxSales(salesBase);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void countMonthLessAverageSales() {
        StatsService service = new StatsService();
        int actual = service.countMonthLessAverageSales(salesBase);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void countMonthMoreAverageSales() {
        StatsService service = new StatsService();
        int actual = service.countMonthMoreAverageSales(salesBase);
        int expected = 5;
        assertEquals(expected, actual);
    }
}