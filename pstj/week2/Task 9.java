import java.util.*;
import java.time.*;

class Event {
    String name;
    LocalDate date;

    Event(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }
}

public class EventProcessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Event> events = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            events.add(new Event(
                in.next(),
                LocalDate.parse(in.next())
            ));
        }

        int month = in.nextInt();


        events.stream()
                .sorted(Comparator.comparing(e -> e.date))
                .forEach(e -> System.out.print(e.name + " "));
        System.out.println();


        events.stream()
                .min(Comparator.comparing(e -> e.date))
                .ifPresent(e -> System.out.println(e.name));


        events.stream()
                .max(Comparator.comparing(e -> e.date))
                .ifPresent(e -> System.out.println(e.name));

        events.stream()
                .filter(e -> e.date.getMonthValue() == month)
                .forEach(e -> System.out.print(e.name + " "));

        in.close();
    }
}
