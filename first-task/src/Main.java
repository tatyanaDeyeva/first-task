import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

public class Main {
    public static void main(String[] args) throws IOException {
        byte b = 13;
        short sh = 1834;
        int i = 382694;
        long l = sh * i;
        float fl = 63.70f;
        double d = 6.94289;
        char ch = 1064;
        boolean bool = true;

        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
    }

    public static void exercise3() {
        System.out.println("Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;");
        int a = 15;
        int b = 5;
        int c = 8;
        float d = 5;

        float result = a * (b + (c / d));
        System.out.println(result);
    }

    public static void exercise4() throws IOException {
        System.out.println("4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), \nесли да – вернуть true, в противном случае – false;");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (a + b >= 10 && a + b <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void exercise5() throws IOException {
        System.out.println("5. Написать метод, которому в качестве параметра передается целое число, \nметод должен напечатать в консоль положительное ли число передали, или отрицательное;");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if (a >= 0) {
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }
    }

    public static void exercise6() throws IOException {
        System.out.println("6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if (a < 0) {
            System.out.println("true");
        }
    }

    public static void exercise7() throws IOException {
        System.out.println("7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        System.out.println("Привет, " + name + "!");
    }

    public static void exercise8() throws IOException {
        System.out.println("8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. \nКаждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());

        if ((year %4 == 0) && ((year %100 != 0) || (year %400 == 0))){
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}