package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
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

        Scanner in = new Scanner(System.in);
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
                System.out.println("Вы нажали неизвестную букву");
        }
    }
}
