package sem_01.task_2;

// Задание №2
// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
// Необходимо посчитать и вернуть сумму элементов этого массива.
// При этом накладываем на метод 2 ограничения: метод может работать только с
// квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
// только значение 0 или 1.
// Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об
// ошибке.

public class Main {
    public static void main(String[] args) {
        //
        System.out.println(prov(new int[][]{{1,1,0},{0,2,1},{1,0,0}}));
        // prov(new int[][]{{1,1,0},{0,1,1},{1,0,0}});

    }

    public static int prov(int[][] arr){
        if (arr.length != arr[0].length){
            throw new RuntimeException("Массив не является квадратной!");

        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1) {
                    // return -2;
                    throw new RuntimeException("Массив содержит отличные от 0 и 1 элементы!");
                }
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
