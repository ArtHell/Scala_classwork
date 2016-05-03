import scala.Tuple2;

public class Main {
  public static void main(String[] args) {
    Algorithm algorithm = new Algorithm();
    int[] mas1 = {4, 2, 0, 2};
    int[] mas2 = {1, 3, -1, -12, 4, 2, -5};
    mas1 = algorithm.mulTwo(mas1);
    mas2 = algorithm.positives(mas2);
    for (Tuple2<Object, Object> x : algorithm.unite(mas1, mas2)) {
      System.out.println(x);
    }
    System.out.println(algorithm.sumAll(mas1));
    System.out.println(algorithm.mulAll(mas2));
    System.out.println("Class task completed");

    System.out.println(algorithm.factorial(6));
    System.out.println(algorithm.fibonacci(4));
  }
}
