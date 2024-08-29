package app;

public enum Day {

    //Створюємо enum та константи
    MONDAY("Плануйте день."),
    TUESDAY("Організуйте собі робоче місце."),
    WEDNESDAY("Почніть себе хвалити :)"),
    THURSDAY("Навчіться радіти маленьким перемогам!"),
    FRIDAY("Happy Friday!"),
    SATURDAY("Відвідайте ресторан, про який давно говорять всі ваші друзі ;)"),
    SUNDAY("Сходіть в кіно");

    //Створюємо поле для збереження інформації за кожною константою
    private final String dayWeek;

    //Генеруємо конструктор для ініціалізації поля dayWeek
    Day(String dayWeek) {
        this.dayWeek = dayWeek;
    }

    //Генеруємо геттер для доступу до констант
    public String getDayWeek() {
        return dayWeek;
    }
}
