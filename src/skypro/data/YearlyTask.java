package skypro.data;

import java.time.LocalDate;

import skypro.RepeatableFactory;
import skypro.Type;

public class YearlyTask extends Task {

    public YearlyTask(String title, String description, Type type) {
        super(title, description, type);
        System.out.println("YearlyTask  created!!!");
        this.repeater = RepeatableFactory.getRepeater(this);
    }


    @Override
    public boolean appearsln(LocalDate localDate) {
        return getDateTime().getMonth()== localDate.getMonth()&&
                getDateTime().getDayOfMonth()==getDateTime().getDayOfMonth();
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
