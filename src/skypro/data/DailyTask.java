//package skypro.data;
package skypro.data;

import java.time.LocalDate;
import java.time.LocalDateTime;

import skypro.RepeatableFactory;
import skypro.Type;


public class DailyTask extends Task {

    public DailyTask(String title, String description, Type type) {
        super(title, description, type);
        System.out.println("DailyTask created!!!");
        this.repeater = RepeatableFactory.getRepeater(this);
    }


    @Override
    public boolean appearsln(LocalDate localDate) {
            return true;
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

