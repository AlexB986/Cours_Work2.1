package skypro.repeaterType;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class
WeeklyRepeater implements Repeater {
    private final LocalDateTime dateTime;

    private int weekly = 0;

    public WeeklyRepeater(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public LocalDate getNextDateAndTime() {
        // TODO Auto-generated method stub
//        LocalDate nextDay = LocalDate.now().plusDays(7);
//        dateTime.compareTo()
        weekly = weekly + 7;
        return this.dateTime.toLocalDate().plusDays(weekly);

    }

}
