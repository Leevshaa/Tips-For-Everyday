package app;

public class DataProcessing implements ChooseDay {

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
