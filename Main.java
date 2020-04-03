import java.util.*;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    System.out.println("hello world");

    Scanner scanner = new Scanner(System.in);

    System.out.print("\nenter number of elements: ");
    int n = Integer.parseInt(scanner.nextLine());

    List<Integer> list = new Random()
      .ints(n, 10, 100)
      .boxed()
      .collect(Collectors.toList());

    System.out.println("\nbefore:");
    System.out.println(list.stream()
      .map(Object::toString)
      .collect(Collectors.joining("\n")));

    System.out.print("\nenter k: ");
    int k = Integer.parseInt(scanner.nextLine());

    System.out.print("enter C: ");
    int C = Integer.parseInt(scanner.nextLine());

    list.add(k, C);

    System.out.println("\nafter:");
    System.out.println(list.stream()
      .map(Object::toString)
      .collect(Collectors.joining("\n")));
  }
}
