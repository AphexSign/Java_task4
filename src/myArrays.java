import java.util.Arrays;
import java.util.Scanner;

public class myArrays {

    //    Напишите программу, которая проверяет отсортирован ли массив
//    по возрастанию. Если он отсортирован по возрастанию то
//    выводится “OK”, если нет, то будет выводиться текст
//    “Please, try again”
    public void checkSort(Integer[] arr) {
        //проходим по каждому элементу и сравниваем по-элементно, если какой-то элемент будет меньше предыдущего
        int tmpValue = arr[0];
        boolean status = true;

        for (int i = 1; i < arr.length; i++) {

            if (tmpValue > arr[i]) {
                //System.out.println("Неверно");
                status = false;
                break;
            } else {
                //  System.out.println("Ок");
                tmpValue = arr[i];
            }
        }
        System.out.println("Сортирован ли по возрастанию:" + status);
    }

//    Напишите программу, которая считывает с клавиатуры
//    длину массива (например, пользователь вводит цифру 4),
//    затем пользователь вводит 4 числа и на новой строке
//    выводится массив из 4 элементов. Пример вывода:
//
//    Array length: 4
//    Numbers of array:
//            5
//            6
//            7
//            2
//    Result: [5, 6, 7, 2]


    public void generateArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length - ");
        int a = scanner.nextInt();
        int arr[] = new int[a];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Number of array - ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(arr));
    }

//    Напишите метод, который меняет местами первый и последний элемент массива. Пример вывода:
//
//    Array 1: [5, 6, 7, 2]
//    Array 2: [2, 6, 7, 5]

    public void switchValues(Integer[] arr) {
        System.out.println("Array before: " + Arrays.toString(arr));
        int tmpValue = arr[0];

        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = tmpValue;
        System.out.println("Array after: " + Arrays.toString(arr));
    }

//    Дан массив чисел. Найдите первое уникальное в этом массиве число.
//            Например, для массива [1, 2, 3, 1, 2, 4] это число 3.

    public void checkunique(Integer[] arr) {

        //Создадим массив в котором есть частота повторений на каждый элемент
        //Длина его будет равна первоначальному массиву
        int[] repeatArr = new int[arr.length];
        int tmpValue;
        int counter;
        //Будем проходить по массиву, берем элемент и сверяем его с каждым элементом, если есть counter++
        for (int j = 0; j < arr.length; j++) {
            tmpValue = arr[j];
            counter = 0;
            for (int i = 0; i < arr.length; i++) {
                if (tmpValue == arr[i]) {
                    counter++;
                }

            }
            repeatArr[j] = counter;
        }

        //System.out.println("Counter array: "+ Arrays.toString(repeatArr));
        //Пройдемся по всему массиву counterRepeat, если будет иметься первый с числом повторений 1 - то он и есть, и его позиция нужна!

        for (int a = 0; a < repeatArr.length; a++) {
            if (repeatArr[a] == 1) {
                System.out.println("Уникальное число: " + arr[a]);
                System.out.println("Позиция этого числа: " + (a + 1));
                break;
            }

        }

//        Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием.


    }


}
