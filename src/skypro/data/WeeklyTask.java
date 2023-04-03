package skypro.data;

import java.time.LocalDate;

import skypro.RepeatableFactory;
import skypro.Type;

public class WeeklyTask extends Task {

    public WeeklyTask(String title, String description, Type type) {
        super(title, description, type);
        System.out.println("WeeklyTask  created!!!");
        this.repeater = RepeatableFactory.getRepeater(this);
    }

    public LocalDate getNextDate() {
        LocalDate nextDate = LocalDate.now().plusDays(7);
        return nextDate;
    }

    @Override
    public boolean appearsln(LocalDate localDate) {
        if (getNextDate().equals(localDate)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
