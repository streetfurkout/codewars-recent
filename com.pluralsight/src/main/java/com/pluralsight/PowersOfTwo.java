package com.pluralsight;

public class PowersOfTwo {
    public static long[] powersOfTwo(int n) {
        long[] result = new long[n];

        for (int i = 0; i < n; i++) {
            result[i] = (long) Math.pow(2, i);

        }

        return result;
    }
    public static void main(String[] args){
        for (int i = 0; i < 5; i++) {

        }
    }
}
