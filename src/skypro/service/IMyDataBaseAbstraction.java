package skypro.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map.Entry;


import skypro.data.Task;

public abstract interface IMyDataBaseAbstraction {
    public void add(Task task);

    public Task remove(int id);

    public List<Task> getAllByData(LocalDate localDate);


}

