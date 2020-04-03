import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    System.out.println("hello world");

    Scanner scanner = new Scanner(System.in);

    System.out.print("\nenter number of integers: ");
    int n = Integer.parseInt(scanner.nextLine());

    List<Integer> list = new Random()
      .ints(-150, 150)
      .distinct()
      .limit(n)
      .boxed()
      .collect(Collectors.toList());

    System.out.println("\nlist:");
    list.forEach(System.out::println);

    System.out.println("\nresult:");
    list.stream()
      .filter(x -> x > 0)
      .filter(x -> x >= 10 && x <= 99)
      .sorted()
      .forEach(System.out::println);
  }
}
