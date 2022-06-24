import java.util.Arrays;
import java.util.Scanner;

public class Numbers {

    //Напишите программу, которая выводит на консоль нечетные числа от 1 до 99. Каждое число печатается с новой строки.
    public void notEvenShow() {
        for (int i = 0; i <= 99; i++) {
            if (i % 2 == 1) {
                System.out.println("Нечетное: " + i);
            } else if (i % 2 == 0) {
            }
        }
    }

    //    Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5). Пример вывода:
    public void selectThreeFive() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 & i % 5 != 0) {
                System.out.println("Делится только на 3 без остатка: " + i);
            } else if (i % 3 == 0 & i % 5 == 0) {
                System.out.println("Делится и на 3 и на 5: " + i);
            } else if (i % 3 != 0 & i % 5 == 0) {
                System.out.println("Делится только на 5 без остатка: " + i);
            }
        }
    }

    //Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу. Пример вывода:
    public Boolean typeThreeValue() {
        System.out.println("Введите три числа!");
        Boolean result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Первое число - ");
        int a = scanner.nextInt();
        System.out.print("Второе число - ");
        int b = scanner.nextInt();
        System.out.print("Третье число - ");
        int summ = scanner.nextInt();

        if ((a + b) == summ) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    //    Напишите программу, которая принимает от пользователя три целых числа
//    и возвращает true, если второе число больше первого числа, а третье число больше второго числа.
    public Boolean typeThreeValueTwo() {
        System.out.println("Введите три числа!");
        Boolean result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Первое число - ");
        int a = scanner.nextInt();
        System.out.print("Второе число - ");
        int b = scanner.nextInt();
        System.out.print("Третье число - ");
        int summ = scanner.nextInt();

        if (b > a & summ > b) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
//    Напишите программу, чтобы проверить, появляется ли число 3 как первый
//    или последний элемент массива целых чисел. Длина массива должна быть
//    больше или равна двум. Пример вывода:
//    array = 3, -3, 7, 4, 5, 4, 3
//            true

    public boolean checkArray(Integer[] arr) {
        boolean result = false;
        //Проверка массива на длину>2
        if (arr.length <= 1) {
            System.out.println("Массив меньше положенного");
        } else {
            //System.out.println("допустимо");
            if (arr[0] == 3 || arr[arr.length - 1] == 3) {
                //System.out.println(arr[0]+" "+arr[arr.length-1]);
                result = true;
            }
        }
        System.out.println("Массив " + Arrays.toString(arr));
        return result;
    }

    //    Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
    public boolean checkArrayTwo(Integer[] arr) {
        boolean result = false;
        int tmpValue;
        //Проверка массива на длину>2
        if (arr.length <= 1) {
            System.out.println("Массив меньше положенного");
        } else {
            //System.out.println("допустимо");

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1 || arr[i] == 3) {
                    result = true;
                }
            }

        }
        System.out.println("Массив " + Arrays.toString(arr));
        return result;
    }


}
