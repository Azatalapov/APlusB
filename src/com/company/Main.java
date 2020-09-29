package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //   секунды отображаются в виде hh:mm:ss
        int n = in.nextInt();// n=3602
        int hour = n/3600; // hour=1
        int minute = (n-hour*3600)/60;//
        int second = (n-hour*3600)-minute*60;
        String result = hour%24 + ":";
        if(minute < 10)
        {
            result = result + 0;
        }
        result = result + minute +":";
        if(second < 10)
        {
            result = result + 0;
        }
        result = result + second;
        System.out.println(result);

        //стоимость пирожков а - рубли, b - копейки, n - колво
        /*int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        int rub = a*n;
        int kop = b*n;

        rub +=  kop/100;
        kop = kop%100;
        System.out.println(rub + " " +kop);*/

        //следующее чётное число
        /*int x = in.nextInt();
        x = (x+2)-(x%2);
        System.out.println(x);*/

        /*int x = in.nextInt();
        int y1 = x % 10;//цифра 1ого разряда
        int a = x / 10;
        int y3 = a / 10;//цифра 3го разряда
        int y2 = a % 10;//цифра 2го разряда
        System.out.println(y1+y2+y3);*/

        /*Scanner in = new Scanner(System.in);
        String c = in.nextLine();
        String[] massivS = c.split(" ");
        int res = Integer.valueOf(massivS[0]) + Integer.valueOf(massivS[1]);
        System.out.println(res);*/
        /*int a = 27;
        if(a%2 ==0)
        {
            System.out.println("Четное");
        }
        else
        {
            System.out.println("Нечетное");
        }*/

       /* Scanner in = new Scanner(System.in);
        System.out.println("Введите Y или N: ");
        String input= in.nextLine();
        switch(input) {
            case "Y":
                System.out.println("Вы нажали букву Y");
                break;
            case "N":
                System.out.println("Вы нажали букву N");
                break;
            default:
                System.out.println("Вы нажали неизвестную букву");*/

    }
}
