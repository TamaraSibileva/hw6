package ru.netology.hw6.stats;

public class StatsService {

    public int sumSales(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + (int) sales[i];
        }
        return sum;
    }

    public int averageSumSales(long[] sales) {
        int averageSum = 0;

        for (int i = 0; i < sales.length; i++) {
            averageSum = (averageSum + (int) sales[i]) / 2;
        }
        return averageSum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if ((int) sales[i] >= (int) sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if ((int) sales[i] <= (int) sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int amountOfMinMonth(long[] sales) {
        int amountMinMonth = 0;
        int averageSum = averageSumSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if ((int) sales[i] < averageSum) {
                amountMinMonth = amountMinMonth + 1;
            }
        }
        return amountMinMonth;
    }

    public int amountOfMaxMonth(long[] sales) {
        int amountMaxMonth = 0;
        int averageSum = averageSumSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if ((int) sales[i] > averageSum) {
                amountMaxMonth = amountMaxMonth + 1;
            }
        }
        return amountMaxMonth;
    }
}
