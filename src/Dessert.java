import java.util.Scanner;

public class Dessert {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      char[] ch = new char[N * 2 - 1];
      for (int i = 1; i <= N; i++) {
          ch[2 * N - 1] = (char) i;
      }
      System.out.println(ch.toString());
      //dessert(ch, N);
      sc.close();
  }

  private static void dessert(char[] ch) {

  }
}
