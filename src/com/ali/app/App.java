package com.ali.app;

public class App {
    public static void main(String[] args) {
        int trials = 100000;
        int wins = 0;

        for (int t = 0; t < trials; t++)
            if (Craps.winsPassBet()) wins++;
        System.out.println("Winning percentage = " + 1.0 * wins / trials);
    }
}
class Craps{
    public static int uniformInt(int n) {
        return (int) (Math.random() * n);
    }
    public static int sumOfTwoDice() {
        int x = 1 + uniformInt(6);
        int y = 1 + uniformInt(6);
        return x + y;
    }
    public static boolean winsPassBet() {
        int x = sumOfTwoDice();
        if (x == 7 || x == 11)
            return true;
        if (x == 2 || x == 3 || x == 12)
            return false;

        while (true) {
            int y = sumOfTwoDice();
            if (y == 7)
                return false;
            if (y == x)
                return true;
        }
    }
}


