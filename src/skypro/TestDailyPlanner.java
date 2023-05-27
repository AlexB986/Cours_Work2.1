package skypro;

import skypro.data.*;
import skypro.repeaterType.OneTimeRepeater;
import skypro.service.TaskService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * at this class you need to define only menu for user
 * you can use - switch(choice) {case ...} structure
 */
public class TestDailyPlanner {
    private static TaskService taskService = new TaskService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=====Ежедневник. Записывайте свои планы на будущeе=====");

        while (true) {
            try {
                printMenu();
                int i = scanner.nextInt();
                if (i == 1) {
                    // здесь будет логика команды заносить задачи
                    Task task = createNewTask(scanner);
                    if (task != null) {
                        System.out.println(task.toString());
                        TestDailyPlanner.taskService.add(task);
                    }
                } else if (i == 2) {
                    System.out.println("удалить задачу");
                    Task task = removeChoiceTask();// здесь будет логика команды удалять задачи

                } else if (i == 3) {
                    System.out.println("получать список всех задач на предстаящии день");
                    List<Task> taskList = getTasksToNextDay();// здесь будет логика команды получать список задач на предстоящий день
                    for (Task task : taskList) {
                        System.out.println(task.toString());
                    }
                } else {
                    System.out.println("Такой команды нет");
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("ВВОД НЕ КОРРЕКТЕН");
                scanner.nextLine();
            }
        }
    }

    private static List<Task> getTasksToNextDay() {
        List taskList = taskService.getTaskForNextDay();
        return taskList;
    }

    private static Task createNewTask(Scanner scanner) {
        // menu info
        System.out.println("Выберите тип события: \n" +
                "1.Однократная \n" +
                "2.Ежедневная \n" +
                "3.Еженедельная \n" +
                "4.Ежемесячная \n" +
                "5.Ежегодная \n");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Название: \n");
        String title = scanner.nextLine();

        System.out.println("Oписание: \n");
        String description = scanner.nextLine();

        System.out.println("Выберите тип из существующих: \n");
        int i = 1;
        for (Type element : Type.values()) {
            System.out.println(i + " " + element.getValue() + " \n");
            i++;
        }

        Type type = Type.valueOf(Integer.valueOf(scanner.nextLine()));

        System.out.println("result: choice: " + choice + " title: " + title + " description: " + description + " type: " + type);

        //create task
        Task task = null;
        switch (choice) {
            case 1:
                task = new OneTimeTask(title, description, type);
                break;
            case 2:
                task = new DailyTask(title, description, type);
                break;
            case 3:
                task = new WeeklyTask(title, description, type);
                break;
            case 4:
                task = new MonthlyTask(title, description, type);
                break;
            case 5:
                task = new YearlyTask(title, description, type);
                break;
        }
        // return task or null
        return task;
    }


    private static Task removeChoiceTask() {
        Integer id = scanner.nextInt();
        return taskService.remove(id);
    }


    static void printMenu() {
        System.out.println("Введите команду");
        System.out.println("1-Занесьти новую задачу");
        System.out.println("2-Удалить задачу");
        System.out.println("3-Получать список всех задач на предстоящий день ");
    }

}


