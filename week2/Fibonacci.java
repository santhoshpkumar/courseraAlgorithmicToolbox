import java.util.Scanner;

public class Fibonacci {
  private static long calculateFib(int n) {
    if (n <= 1)
      return n;
  
    long current = 1;
    long previous = 0; 
    long temp;
  
    for (int i = 2; i <= n; i++){
        temp = current;
        current = current + previous;
        previous = temp;
    }

    return current;
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calculateFib(n));
  }
}
