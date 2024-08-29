package app;

public class DataProcessing implements ChooseDay {

    //Перевантаження методу advise, прописуємо конструкцію switch для отримання
    // даних з конкретного дня
    @Override
    public void advise(Day day) {
        switch (day){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
                 FRIDAY, SATURDAY, SUNDAY:
                System.out.println(day.getDayWeek());
                break;
        }
    }
}
