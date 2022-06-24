import java.util.Arrays;

import static java.lang.System.arraycopy;

public class Task4 {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        // 1.1.нечетные числа от 1 до 99, каждое печатается с новой строки
        numbers.notEvenShow();

        //1.2. Число делится на 3 или 5
        numbers.selectThreeFive();

        //1.3. Три значения - сумма двух чисел
        System.out.println("Результат:" + numbers.typeThreeValue());

        //1.4. Три значения - b>a & c>b
        System.out.println("Результат:" + numbers.typeThreeValueTwo());

        //1.5. Проверка массива на 3 по первому и последнему элементу
        Integer[] arr = {1, 5, 5, 9, 10};
        System.out.println("Результат проверки: " + numbers.checkArray(arr));
        //1.6. Содержит ли массив число 1 или 3
        System.out.println("Результат проверки: " + numbers.checkArrayTwo(arr));

        myArrays myArrays = new myArrays();
//        //2.1.  Проверка сортировки массива на возрастание
        myArrays.checkSort(arr);
//        //2.2. Задание длины массиву и его вывод
        myArrays.generateArray();
//        //2.3. Поменять значения местами
        myArrays.switchValues(arr);
        //2.4. Найти уникальное число в массиве
        Integer[] arr2 = {1, 2, 2, 3, 2, 4, 1};
        myArrays.checkunique(arr2);

    }

}
