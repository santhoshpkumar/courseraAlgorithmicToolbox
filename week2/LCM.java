import java.util.*;

public class LCM {
  private static long calculateGCD(int a, int b) {
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
  
  private static long calculateLCM(int a, int b) {
      long gcd = calculateGCD(a,b);
      long product = (long)a*b;
      return product/gcd;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(calculateLCM(a, b));
  }
}
