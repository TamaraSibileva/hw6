package ru.netology.hw6.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long averageSumSales(long[] sales) {
        long averageSum = 0;

        for (int i = 0; i < sales.length; i++) {
            averageSum = (averageSum + sales[i]) / 2;
        }
        return averageSum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int amountOfMinMonth(long[] sales) {
        int amountMinMonth = 0;
        long averageSum = averageSumSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) {
                amountMinMonth = amountMinMonth + 1;
            }
        }
        return amountMinMonth;
    }

    public int amountOfMaxMonth(long[] sales) {
        int amountMaxMonth = 0;
        long averageSum = averageSumSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) {
                amountMaxMonth = amountMaxMonth + 1;
            }
        }
        return amountMaxMonth;
    }
}
