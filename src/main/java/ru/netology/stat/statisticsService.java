package ru.netology.stat;

public class statisticsService {
    public long sumOfAllSales(int[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageAmount(int[] sales) {
        return sumOfAllSales(sales) / sales.length;
    }

    public int numberMaxMonth(int[] sales) {
        int max = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max]) {
                max = i;
            }
        }
        return max + 1;
    }

    public int numberMinMonth(int[] sales) {
        int min = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[min]) {
                min = i;
            }
        }
        return min + 1;
    }

    public int lessAverageAmount(int[] sales) {
        long medium = averageAmount(sales);
        int count = 0;

        for (int sale : sales) {
            if (sale < medium) {
                count++;
            }
        }
        return count;
    }

    public int moreAverageAmount(int[] sales) {
        long medium = averageAmount(sales);
        int count = 0;

        for (int sale : sales) {
            if (sale > medium) {
                count++;
            }
        }
        return count;
    }

}
