package Practice;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        // Линейныe программы 1. Найти значение функции z = ( (a – 3 ) * b / 2) + c.
    double a = 1;
    double b = 2;
    double z = ((a - 3) * b / 2);
        System.out.println(z);

        // 2. Вычислить значение выражения по формуле

    double b1 = 1;
    double a1 = 2;
    double c1 = 3;
    double z1 = (b1 + Math.sqrt(Math.pow(b1,2) + 4 * a1 * c1)) / 2 * a1 - Math.pow(a1,3) + Math.pow(b1,-2);
        System.out.printf("Значение выражения: %.2f \n", z1); // форматирование строк: %.2f - оставляет 2 цифры после запятой, округляет

       // 3. Вычислить значение выражения по формуле (𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦) /(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦) ∗ 𝑡𝑔 𝑥𝑦
        double x = 15;
        double y = 50;
        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.printf("Результат равен %.3f\n ", result);

        /* 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
         Поменять местами дробную и целую части числа и вывести полученное значение числа.*/
    double R = 222.555;
    double res = (R * 1000) % 1000 + (double) ((int) (R)) / 1000; //  555 + 0,222
        System.out.println(res);

        /* 5.	Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
        Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
        ННч ММмин SSc */
    int T = 9876;
    int H = T / 3600;
    int M = (T - (H * 3600)) / 60;
    int Sec = T - H * 3600 - M * 60;
        System.out.println(H + "ч " + M + "мин " + Sec + "с ");

        /* 6.	Для данной области составить линейную программу, которая печатает true, если точка с координатами
         (х, у) принадлежит закрашенной области, и false — в противном случае: */
    double x1 = 2;
    double y1 = 1;
    int Xmax = 4;
    int Xmin = -4;
    int Ymax = 4;
    int Ymin = -3;
        if (x1 >= Xmin && x1 <= Xmax && y1 >= Ymin && y1 <= Ymax) {
        System.out.println("true");
    } else {
        System.out.println("false");
    }
       /* Ветвления 1. Даны два угла треугольника (в градусах).Определить, существует ли такой треугольник,
       и если да, то будет ли он прямоугольным. */
    double t = 70; // 1-й угол равен t градусов
    double t2 = 20; // 2-й угол равен t2 градусов
        if (180 - t - t2 > 0 && t > 0 && t2 > 0) {
        System.out.print("triangle exists, ");
        if (t + t2 == 90 || t == 90 || t2 == 90)
            System.out.println("rectangular triangle");
    } else
            System.out.println("triangle doesn't exists");

        // 2. Найти max{min(a, b), min(c, d)}.

    int a2 = 1, b2 = 2, c2 = 3, d2 = 4;
    int minAB = Math.min(a2, b2);
    int minCD = Math.min(c2, d2);
    int max = Math.max(minAB, minCD);
        System.out.println(max);

        // 3.	Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
        int X1 = 8, X2 = 2, X3 = 3;
        int Y1 = 2, Y2 = 4, Y3 = 6;
        if (Math.abs((X3 - X1) / (X2 - X1) - (Y3 - Y1) / (Y2 - Y1)) == 0)

            System.out.println("points belong to a line");
        else
            System.out.println("points not belong to a line");

        // 4.	Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич
        // через отверстие.
        double A = 12.3, B = 4.6;
    double X = 15, Y = 3, Z = 17.4;
           if ((X < A) && (Y < B)
            || (X < A) && (Z < B)
            || (Z < A) && (Y < B)
            || (Y < A) && (X < B)
            || (Z < A) && (X < B)
            || (Y < A) && (Z < B)) {
        System.out.println("brick will");
    } else
            System.out.println("brick will not");

           // 5.	Вычислить значение функции...
        double x3 = -5.6;
        double function;
        if (x3 <= 3) {
        function = Math.pow(x3, 2) - 3 * x3 + 9;
    } else {
        function = 1 / (Math.pow(x3, 3) + 6);
    }
        System.out.printf("Значение функции равно %.3f \n", function); // %.3f - 3 знака после запятой и перенос на новую строку

        /*Циклы 1.	Напишите программу, где пользователь вводит любое целое положительное число.
         А программа суммирует все числа от 1 до введенного пользователем числа.
          System.out.println("Введите целое положительное число: ");
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    int sum = 0;
    int count = 0;
        for (int i = 1; i <= number; i++) {
        count++;
        sum += count; //
    }
        System.out.println(sum); */



        System.out.println("8. Вычислить значения функции на отрезке [а,b] c шагом h");

        int a3 = -3;
        int b3 = 16;
        int h = 2;
        int y4;

        for (int i = a3; i <= b3; i += h) {
            if (i > 2) {
                y4 = i;
            } else {
                y4= -1*Math.abs(i); // в данном случае х это и есть i ясно
            }
            System.out.println("При х = " + i + " у = " + y4);
        }

        System.out.println();
    }


      /*  int a3,b3;
        a3=1;
        b3=10;
        double y4,x4,h;
        x4 = 33;
        h=2.5;
        for (x4 =a3; x4<=b3;  x4+=h) {
         if (x4 > 2) {
            y4 = x4;
        } else
            y4 = -x4;
        } System.out.println("y ="+y4);

    /*int sum1 = 0;
    int j;
        for (j = 1; j <= 100; j++) {
        sum1 = sum1 + j * j;
    }
        System.out.println(sum1);

    long multi = 1;
    int e;
    int e1;
        for (e = 1; e <= 200; e++) {
        e1 = e * e;
        multi *= e1;
    }
        System.out.println(multi);

    double sum2 = 0;
    int e2 = 5;
    int n = 1;
    double a7 = (1 / (Math.pow(2, n))) + (1 / (Math.pow(3, n)));
        while (Math.abs(a7) >= e2) {
        sum2 += a7;
        n++;
    }
        System.out.println(sum2);
*/
}
