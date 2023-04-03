package skypro;

import skypro.data.DailyTask;
import skypro.data.MonthlyTask;
import skypro.data.OneTimeTask;
import skypro.data.Task;
import skypro.data.WeeklyTask;
import skypro.data.YearlyTask;
import skypro.repeaterType.DailyRepeater;
import skypro.repeaterType.MonthlyRepeater;
import skypro.repeaterType.OneTimeRepeater;
import skypro.repeaterType.Repeater;
import skypro.repeaterType.WeeklyRepeater;
import skypro.repeaterType.YearlyRepeater;

public abstract class RepeatableFactory {



    /**
     * Init differents types of repeaters depends on instance of class witch HAS-a repeater
     * every kind of class has its own repeater
     * @param task
     * @return
     */
    public static Repeater getRepeater(Task task) {
        if(task instanceof OneTimeTask){
            System.out.println("OneTimeRepeater created");
            return new OneTimeRepeater(task.getDateTime());
        } else if(task instanceof DailyTask) {
            System.out.println("DailyRepeater created");
            return new DailyRepeater(task.getDateTime());
        } else if(task instanceof WeeklyTask) {
            System.out.println("WeeklyRepeater created");
            return new WeeklyRepeater(task.getDateTime());
        } else if(task instanceof MonthlyTask) {
            System.out.println("MonthlyRepeater created");
            return new MonthlyRepeater(task.getDateTime());
        } else if(task instanceof YearlyTask) {
            System.out.println("Init YearlyRepeater created");
            return new YearlyRepeater(task.getDateTime());
        }
        return null; // null return if you add a new kind of task but fogget to add a repeater for it (its a problem fo this kind of abstract factory method solution )
    }


}
