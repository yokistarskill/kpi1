import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    System.out.println("hello world");

    Scanner scanner = new Scanner(System.in);

    System.out.print("\nenter number of pairs: ");
    int n = Integer.parseInt(scanner.nextLine());

    Map<String, Integer> map = new Random()
      .ints(16, 256)
      .distinct()
      .limit(n)
      .boxed()
      .collect(Collectors.toMap(
        Integer::toHexString, Function.identity()));

    System.out.println("\nmap:");
    System.out.println(map.entrySet().stream()
      .map(entry -> String.format("hex(\"%s\") = %d",
        entry.getKey(), entry.getValue()))
      .collect(Collectors.joining("\n")));

    System.out.println("\nthree highest values: " +
      map.values().stream()
        .sorted(Comparator.reverseOrder())
        .limit(3)
        .map(Object::toString)
        .collect(Collectors.joining(", ")));
  }
}
