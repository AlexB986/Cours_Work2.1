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



    @Override
    public boolean appearsln(LocalDate localDate) {
        return getDateTime().getDayOfWeek().equals(localDate.getDayOfWeek());
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
