package com.Ayush;

public class SameNumber {
    public static void main(String[] args) {
        int num= 265626467;

        int count = 0;
        while (num > 0) {
            int Rem = num % 10;
            if(Rem == 6) {
                count++;
            }
            num = num / 10; // n /=10
        }

        System.out.println(count);
    }
}
