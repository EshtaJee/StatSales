package ru.eshtajee.statist.services;

public class StatsService {

    public int getSumSales(int[] allSales) {
        int sumSales = 0; // Сумма всех продаж

        for (int i = 0; i < allSales.length; i++) {
            sumSales = sumSales + allSales[i];
        }
        return sumSales;
    }

    public int getMiddleSales(int[] allSales) {
        int sumSales = getSumSales(allSales); // Сумма всех продаж
        int middleSales = 0; // Средняя сумма продаж в месяц

        for (int i = 0; i < allSales.length; i++) {
            middleSales = sumSales / allSales.length;
        }
        return middleSales;
    }

    public int getPicSalesMonth(int[] allSales) {
        int picSalesMonth = 0; // Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)

        for (int i = 0; i < allSales.length; i++) {
            if (allSales[i] >= allSales[picSalesMonth])
                picSalesMonth = i;
        }
        return picSalesMonth;

    }

    public int getMinSalesMonth(int[] allSales) {
        int minSalesMonth = 0; // Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)

        for (int i = 0; i < allSales.length; i++) {
            if (allSales[i] <= allSales[minSalesMonth])
                minSalesMonth = i;
        }
        return minSalesMonth;
    }

    public int getMonthDown(int[] allSales) {
        int monthDown = 0; // Кол-во месяцев, в которых продажи были ниже среднего

        for (int i = 0;  i < allSales.length; i++) {
            if (allSales[i] < getMiddleSales(allSales))
                monthDown = monthDown + 1;
        }
        return monthDown;
    }

    public int getMonthHigh(int[] allSales) {
        int monthHigh = 0; // Кол-во месяцев, в которых продажи были выше среднего

        for (int allSale : allSales) {
            if (getMiddleSales(allSales) < allSale)
                monthHigh = monthHigh + 1;
        }
        return monthHigh;
    }
}

