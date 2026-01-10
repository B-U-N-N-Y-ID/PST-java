import java.util.*;
import java.util.stream.*;

public class PersonStream {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            persons.add(new Person(in.next(), in.nextInt()));
        }

        int ageLimit = in.nextInt();
        persons.stream()
                .map(p -> p.name)
                .sorted(String::compareTo)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        persons.stream()
                .filter(p -> Person.isOlderThan(p, ageLimit))
                .map(p -> p.name)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();


        persons.stream()
                .map(p -> p.name)
                .map(String::toUpperCase)
                .forEach(name -> System.out.print(name + " "));
    }
}