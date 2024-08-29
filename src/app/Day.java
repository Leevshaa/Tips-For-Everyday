package app;

public enum Day {

    //Створюємо enum та константи з
    MONDAY("Плануйте день."),
    TUESDAY("Організуйте собі робоче місце."),
    WEDNESDAY("Почніть себе хвалити :)"),
    THURSDAY("Навчіться радіти маленьким перемогам!"),
    FRIDAY("Happy Friday!"),
    SATURDAY("Відвідайте ресторан, про який давно говорять всі ваші друзі ;)"),
    SUNDAY("Сходіть в кіно");

    private final String dayWeek;

    Day(String dayWeek) {
        this.dayWeek = dayWeek;
    }

    public String getDayWeek() {
        return dayWeek;
    }
}
