package sem_01.task_1;

//Задание №1
//        Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
//        значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
//        например:
//        1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в
//        качестве кода ошибки.
//        2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//        3. если вместо массива пришел null, метод вернет -3
//        4. придумайте свои варианты исключительных ситуаций и верните соответствующие
//        коды ошибок.
//        Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот
//        метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное
//        значение и покажет читаемый результат пользователю. Например, если вернулся -2,
//        пользователю выведется сообщение: “Искомый элемент не найден”.
public class Main {
    public static void main(String[] args) {
        // System.out.println(prov(new int[]{1,2,3,4,5,6}, 4, 9));
        // arrMessage(new int[]{1,2,3,4,5}, 5, 9);
        arrMessage(null, 5, 9);
    }

    public static int prov(int[] arr, int minLength, int elem){
        if (arr == null) {
            return -3;
        } else if (arr.length < minLength) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                return i;
            }
        }
        return -2;
    }

    public static void arrMessage(int[] arr, int minLength, int elem){
        int result = prov(arr, minLength, elem);
        switch (result) {
            case -1:
                System.out.println("Длина массива меньше заданного минимума " + minLength);
                break;
            case -2:
                System.out.println("Искомый элемент в массиве не найден");
                break;
            case -3:
                System.out.println("Вместо массива пришел null");
                break;
            default:
                System.out.println("Индекс элемента -> " + result);
        }
    }
}
