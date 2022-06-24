// https://www.youtube.com/watch?v=bD9YEH3z3c4

public class arrSort {
    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 4, 8, 1, 6, 22, 11, 44, 66, 88, 99, 23, 36, 47, 48, 25};
        mergeSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSort(int[] arr) {
        //Вспомогательная переменная, равна длине первоначального массива
        int n = arr.length;
        //Если длина 1 - Ничего не делаем
        if (n == 1) return;

        //Делим длину пополам
        int mid = n / 2;
        //Создаем левый массив, равный первой половине
        int[] l = new int[mid];
        //Создаем правый массив, длина которого равна остатку (длина первоначального массива-половина)
        int[] r = new int[n - mid];

        //Заполняем левый массив, элементами первичного массива, пока не достигнем первой половины
        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }

        //Заполняем правый массив, элементами первичного массива, начало - с половины, пока не достигнем конца первичного массива от 5-10
        //отчет номера правого массива начинается с 0 и до 5; номерация будет идти пока не достигнем конца первичного массива
        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }
        //Рекурсивно дробим левый массив
        mergeSort(l);
        //Рекурсивно дробим правый массив
        mergeSort(r);
        //Производим слияние наших двух массивов в один
        merge(arr, l, r);
    }


    private static void merge(int[] arr, int[] l, int[] r) {
        //Вспомогательные переменные
        //Нужны длины правого и левого массива, индексы
        int left = l.length;
        int right = r.length;
        //Создаем счетчики, зависимых от длин
        int i = 0;
        int j = 0;
        int idx = 0;
        while (i < left && j < right) {

            if (l[i] < r[j]) {
                arr[idx] = l[i];
                i++;
                idx++;
            } else {
                arr[idx] = r[j];
                j++;
                idx++;
            }
        }

        for (int ll = i; ll < left; ll++) {
            arr[idx++] = l[ll];
        }

        for (int rr = j; rr < right; rr++) {
            arr[idx++] = r[rr];
        }
    }


}
