package sem_03.hw;

public class DateException extends Exception {
    public DateException() {
    }

    public void dataException(String i) {
        System.out.println("Ошибка: Дата рождения введена неправильно!");
        System.out.printf("Неправильный формат даты: %s", i);
        System.out.println();
    }
}