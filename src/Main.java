import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args)
    {

        // Get the LocalDateTime instance
        LocalDateTime dt = LocalDateTime.now();

        // Get the LocalDate representation of this LocalDateTime
        // using toLocalDate() method
        System.out.println(dt.toLocalDate());
    }
}
//public class Main {
//    public static void main(String[] args) {
//      List<String> input = Arrays.asList( "yourapp the quick brown fox jumps over the lazy dog");
//        Map<Integer,String>count = input.stream()
//                .map(inputs->{
//                    Map<Integer,>
//                })

//    }
//}
//
//    public static void main(String[] args) {
//        List<Person> persons = new ArrayList<>();
//
//        Set<Item> itemsBoughtVasia = new HashSet<>();
//        itemsBoughtVasia.add(new Item("Кефир"));
//        itemsBoughtVasia.add(new Item("Батон"));
//        itemsBoughtVasia.add(new Item("Сок"));
//        persons.add(new Person("Василий", itemsBoughtVasia));
//
//        Set<Item> itemsBoughtIvan = new HashSet<>();
//        itemsBoughtIvan.add(new Item("Кефир"));
//        itemsBoughtIvan.add(new Item("Батон"));
//        persons.add(new Person("Иван", itemsBoughtIvan));
//
//
//        Map<Item, Long> count = persons.stream()
//                .map(person -> {
//                    Map<Item, Person> itemPersonMap = new HashMap<>();
//                    person.getItems()
//                            .forEach(item -> itemPersonMap.put(item, person));
//                    return itemPersonMap;
//                })
//                .flatMap(map -> map.entrySet().stream())
//                .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.counting()));
//
//        System.out.println(count);
//    }
//}