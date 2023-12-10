package sem_01.task_4;

// Задание №4
// Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
// целочисленный одномерный массив.
// Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику:
// 1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
// пользователя
// 2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
// “подсветить”
public class Main {
    public static void main(String[] args) {
        //
        checkArray(new Integer[]{1,4,null,2,null,5});
    }

    public static void checkArray(Integer[] arr){
        String sum = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                if (sum =="") {
                    sum += "[" + i + "]";
                } else {
                    sum += ",[" + i + "]";
                }
            }
        }
        if (sum != "") {
            throw new RuntimeException("Элементы " + sum + " равны null");

        }
    }
}
