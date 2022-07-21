package ru.eshtajee.statist.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void testGetSumSales() {
        StatsService service = new StatsService();
        int[] allSales = {1100, 2350, 3445, 1680, 2370, 3200, 1225, 2525, 3115, 1785, 2290, 3420};

        int expected = 28505;
        int actual = service.getSumSales(allSales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMiddleSales() {
        StatsService service = new StatsService();
        int[] allSales = {1100, 2350, 3445, 1680, 2370, 3200, 1225, 2525, 3115, 1785, 2290, 3420};

        int expected = 2375;
        int actual = service.getMiddleSales(allSales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetPicSalesMonth() {
        StatsService service = new StatsService();
        int[] allSales = {1100, 2350, 3445, 1680, 2370, 3200, 1225, 2525, 3115, 1785, 2290, 3420};

        int expected = 2;
        int actual = service.getPicSalesMonth(allSales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMinSalesMonth() {
        StatsService service = new StatsService();
        int[] allSales = {1100, 2350, 3445, 1680, 2370, 3200, 1225, 2525, 3115, 1785, 2290, 3420};

        int expected = 0;
        int actual = service.getMinSalesMonth(allSales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testGetMonthDown() {
        StatsService service = new StatsService();
        int[] allSales = {1100, 2350, 3445, 1680, 2370, 3200, 1225, 2525, 3115, 1785, 2290, 3420};

        int expected = 7;
        int actual = service.getMonthDown(allSales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testGetMonthHigh() {
        StatsService service = new StatsService();
        int[] allSales = {1100, 2350, 3445, 1680, 2370, 3200, 1225, 2525, 3115, 1785, 2290, 3420};

        int expected = 5;
        int actual = service.getMonthHigh(allSales);
        Assertions.assertEquals(expected, actual);
    }

}


