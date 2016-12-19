import java.util.*;

public class GCD {
  private static int gcd_naive(int a, int b) {
    int temp;
    if ( b > a){
        temp = a;
        a = b;
        b = temp;
    }
    while (b != 0) {
        temp = b;    
        b = a%b;
        a =  temp;
        
        if(b == 1){
            return 1;
        }
    }

    return a;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd_naive(a, b));
  }
}
