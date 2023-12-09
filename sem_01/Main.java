package sem_01;

//        Задание №0
//        Реализуйте метод, принимающий в качестве аргумента
//        целочисленный массив.
//        Если длина массива меньше некоторого заданного минимума,
//        метод возвращает -1, в качестве кода ошибки, иначе - длину
//        массива.

public class Main {
    public static void main(String[] args) {
        System.out.println(prov(new int[]{1,2,3,4,5}, 6));

    }
    public static int prov(int[] arr, int minLength){
        if (arr.length < minLength) {
            return -1;
        }
        return arr.length;
    }
}
