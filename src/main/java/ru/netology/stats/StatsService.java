package ru.netology.stats;

public class StatsService {
    // int[] salesBase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public int amountAllSales(int[] sales) {
        int amountSales = 0;
        for (int sale : sales) {
            amountSales += sale;
        }
        return amountSales;
    }

    public int averageSales(int[] sales) {
        int amountSales = 0;
        for (int sale : sales) {
            amountSales += sale;
        }
        int amountAllSales = amountSales / sales.length;
        return amountAllSales;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int countMonthLessAverageSales(int[] sales) {
        int monthCounter = 0;
        int amountSales = 0;
        for (int sale : sales) {
            amountSales += sale;
        }
        int average = amountSales / sales.length;
        for (int sale : sales) {
            if (sale < average) {
                monthCounter++;
            }
        }
        return monthCounter;
    }

    public int countMonthMoreAverageSales(int[] sales) {
        int monthCounter = 0;
        int amountSales = 0;
        for (int sale : sales) {
            amountSales += sale;
        }
        int average = amountSales / sales.length;
        for (int sale : sales) {
            if (sale > average) {
                monthCounter++;
            }
        }
        return monthCounter;
    }
}
