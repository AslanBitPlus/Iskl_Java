package sem_03.hw;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Ошибка: пол введен неправильно!");
        System.out.printf("Некорректный ввод: %s", i);
        System.out.println();
    }
}
