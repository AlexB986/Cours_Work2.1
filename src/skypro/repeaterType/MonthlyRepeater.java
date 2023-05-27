package skypro.repeaterType;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MonthlyRepeater implements Repeater {
    private final LocalDateTime dateTime;
    private int month = 0;

    public MonthlyRepeater(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public LocalDate getNextDateAndTime() {
        // TODO Auto-generated method stub
        month = month + 30;
        return this.dateTime.toLocalDate().plusDays(month);
    }

}
