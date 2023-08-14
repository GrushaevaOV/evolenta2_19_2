package evolenta.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 3 числа");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        checkDivision(a,b,c);
        System.out.println("Вывести наконсоль значение от целочисленного деления a на b (результат - целое число)");
        System.out.println(a/b);
        System.out.println("Вывести на консоль значение от деления a на b (результат - число с плавающей запятой)");
        System.out.println((double) a/b);
        System.out.println("Вывести на консоль значение от деления a на b, округленного до ближайшего целого в большую сторону");
        System.out.println(Math.ceil((double) a/b));
        System.out.println("Вывести на консоль значение от деления a на b, округленного до ближайшего целого в меньшую сторону");
        System.out.println(Math.floor((double) a/b));
        System.out.println("Вывести на консоль значение от деления a на b, округленного до ближайшего целого математическим округлением");
        System.out.println(Math.round((double) a/b));
        System.out.println("Вывести на консоль остаток от деления b на c");
        System.out.println(b%c);
        System.out.println("Вывести на консоль наименьшее значение из a и b");
        System.out.println(Math.min(a,b));
        System.out.println("Вывести на консоль наибольшее значение из b и c");
        System.out.println(Math.max(b,c));
    }

    public static void checkDivision(int a, int b, int c) {
        if ((a % 5 == 0) || (b % 5 == 0) || (c % 5 == 0)) {
            if (a % 5 == 0) System.out.println("a = "+a);
            if (b % 5 == 0) System.out.println("b = "+b);
            if (c % 5 == 0) System.out.println("c = "+c);
        } else System.out.println("нет значений, кратных 5");

    }
}