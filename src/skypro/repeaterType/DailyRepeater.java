package skypro.repeaterType;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyRepeater implements Repeater {

    private final LocalDateTime dateTime;
    private  int day =0 ;
    public DailyRepeater(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
    @Override
    public LocalDate getNextDateAndTime() {
//         TODO Auto-generated method stub
        LocalDate nextDay = LocalDate.now().plusDays(1);
        return nextDay;
    }

}
