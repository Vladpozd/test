package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hour, rate, month, year,day;
        String g ="oudge"
                ;
        hour=1;
        rate=100;
        day=hour*24;
        month=day*30;
        year=month*12;
        int hour_wages = hour * rate;

        System.out.print( hour_wages);
        System.out.println(rate* day);
        System.out.println(rate* month);
        System.out.println(rate* year);


    }
}
