package skypro.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.Map.Entry;

import skypro.data.OneTimeTask;
import skypro.data.Task;

/**
 * In fact its an abstraction of database implementation
 * you must look at this class as a database source realization
 */
public class TaskService implements IMyDataBaseAbstraction {

    private HashMap<Integer, Task> taskMap = new HashMap<>(); // it is a store volume you need to think about data structure to use
    private Collection<Task> removedTasks; //

    /**
     * you didnt able to use constructor with arguments at this task case
     * cause any constructor with arguments its a dependency from arguments
     * if it is a local database so you need init it as empty source
     * so default constructor is ok at this case
     */



    @Override
    public void add(Task task) {
        //TODO add new task to your collection
        taskMap.put(task.getId(), task);
        System.out.println("implement your own ADD method for a new task");
    }

    @Override
    public Task remove(int id) {
        //TODO add new task to your collection
        taskMap.remove(id);
        System.out.println("implements your own REMOVE method for a new task");
        return taskMap.remove(id);
    }
    @Override
    /**
     * you can change your own data structure to return
     */
    public List<Task> getAllByData(LocalDate localDate) {
        // TODO return your collection by filtering using
        List<Task>list = new ArrayList<>();
        for (Map.Entry<Integer,Task> element : this.taskMap.entrySet()) {
            if(element.getValue().getDateTime().toLocalDate().compareTo(localDate)==0) {
                list.add(element.getValue());
            }
        }
        System.out.println("RETURN all by date method for a new task");
        return list;
    }
//    element.getValue().getDateTime().toLocalDate().compareTo(localDate)==element.getValue().appearsln()
//    @Override
//    /**
//     * you can change your own data structure to return
//     */
//    public List<Task> getAllByData(LocalDate localDate) {
//        // TODO return your collection by filtering using
//        List<Task>list = new ArrayList<>();
//        for (Map.Entry<Integer,Task> element : this.taskMap.entrySet()) {
//            if(element.getValue().getDateTime().toLocalDate().compareTo(localDate)==0) {
//                list.add(element.getValue());
//            }
//        }
//        System.out.println("RETURN all by date method for a new task");
////        return this.taskMap.entrySet().stream().collect(Collectors.toList());
//        return list;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskService that = (TaskService) o;
        return Objects.equals(taskMap, that.taskMap) && Objects.equals(removedTasks, that.removedTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskMap, removedTasks);
    }

    @Override
    public String toString() {
        return "TaskService{" +
                "taskMap=" + taskMap +
                ", removedTasks=" + removedTasks +
                '}';

    }

    public List<Task> getTaskForNextDay() {
        List<Task>list = new ArrayList<>();
        for (Map.Entry<Integer,Task> element : this.taskMap.entrySet() ) {
            if(element.getValue().getRepeatr().getNextDateAndTime().compareTo(LocalDate.now().plusDays(1))==0)
                list.add(element.getValue());

        }
        return list;
    }
}
