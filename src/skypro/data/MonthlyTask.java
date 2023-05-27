package skypro.data;

import java.time.LocalDate;

import skypro.RepeatableFactory;
import skypro.Type;

public class MonthlyTask extends Task {

    public MonthlyTask(String title, String description, Type type) {
        super(title, description, type);
        System.out.println("MonthlyTask  created!!!");
        this.repeater = RepeatableFactory.getRepeater(this);
    }


    @Override
    public boolean appearsln(LocalDate localDate) {
        return getDateTime().getDayOfMonth()==localDate.getDayOfMonth();
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
