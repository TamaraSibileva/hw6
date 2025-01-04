package ru.netology.hw6.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSumSales(int[] sales) {
        int averageSum = 0;

        for (int i = 0; i < sales.length; i++) {
            averageSum = (averageSum + sales[i]) / 2;
        }
        return averageSum;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int amountOfMinMonth(int[] sales) {
        int amountMinMonth = 0;
        int averageSum = averageSumSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) {
                amountMinMonth = amountMinMonth + 1;
            }
        }
        return amountMinMonth;
    }

    public int amountOfMaxMonth(int[] sales) {
        int amountMaxMonth = 0;
        int averageSum = averageSumSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) {
                amountMaxMonth = amountMaxMonth + 1;
            }
        }
        return amountMaxMonth;
    }
}
