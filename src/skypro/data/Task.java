package skypro.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import skypro.Type;
import skypro.repeaterType.Repeater;

/**
 * Task.calass is ABSTRACTION cause you cant to create object of Task.class
 * this abstaract class can be usefull to modify programm in future if you want
 * to add new type of task
 */
public abstract class Task {
    private static int idGenerator = 0; // ???? its not a good idea to make id in this class generation of unique values
    // poperties of enteties is a task of data storage layer(in this case) or some
    // different abstraction
    private int id;
    private String title;
    private String description;
    private Type type;
    protected LocalDateTime dateTime;
    /**
     * this variable better need to be here
     * do it protected to use from extended classes
     */
    // protected boolean appearssl;
    protected Repeater repeater;

    public Task(String title, String description, Type type) {
        this.title = title;
        this.description = description;
        this.type = type;
        id = idGenerator++;
        this.dateTime = LocalDateTime.now();
    }

    /**
     * this method is abstract it must be overriden at concreate class
     * @param localDate
     * @return
     */
    public abstract boolean appearsln(LocalDate localDate);

    public int getId() {
        return this.id;
    }

    public Type getType() {
        return this.type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    public Repeater getRepeatr() {
        return this.repeater;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, type, dateTime);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", dateTime=" + dateTime +
                '}';
    }
}
