package   lab7recursion;

public class PrintOdd {
  public static void printOdd(int n) {

        if (n > 0) {

            printOdd(n - 1);

            if (n % 2 != 0)

                System.out.print(n+" ");

        }

    }   
    public static void main(String[] args) {
      printOdd(5);
    }
}
