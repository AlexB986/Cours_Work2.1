package skypro.repeaterType;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OneTimeRepeater implements Repeater {

    private final LocalDateTime dateTime;

    public OneTimeRepeater(LocalDateTime dateTime) {
        this.dateTime=dateTime;
    }

    @Override
    public LocalDate getNextDateAndTime() {
        return this.dateTime.toLocalDate();
    }

}
