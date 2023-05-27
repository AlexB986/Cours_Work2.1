package skypro.repeaterType;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class YearlyRepeater implements Repeater {
    private final LocalDateTime dateTime;

    private int year = 0;

    public YearlyRepeater(LocalDateTime dateTime) {
        this.dateTime = dateTime;

    }

    @Override
    public LocalDate getNextDateAndTime() {
        // TODO Auto-generated method stub
        year = year + 365;
        return this.dateTime.toLocalDate().plusDays(year);
    }

}
