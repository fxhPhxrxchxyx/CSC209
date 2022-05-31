package   lab7recursion;
public class recursion{

  public static int factorial(int n){
    if(n==0){
      return 1;
    }
    return n*factorial(n-1);
  }

  public static int exponential(int a,int b){
    if(b==0) return 1;
    return a* exponential(a,b-1);
  }

  public static int division(int diviend, int divisor){

    // 20/6 => 20-6 =>14-6 =>8-6 => 2 answer=>3  20/6 = 3 2/6
    int count =0;
    for(count =0; diviend>=divisor; count++){
      diviend -= divisor;
    }
    return count;
  }

  public static int recursiveDivision(int diviend,int divisor){
    // 3/6 =>0
    // 15/6 => (15-6)/6 +1 = (9-6)/6 +1 +1 = (3-6)/6 +1 +1
    if(diviend<divisor){
      return 0;
    }
     return recursiveDivision(diviend-divisor, divisor)+1;
  }

  public static void PrintNto1(int n){
    if(n>0){
      System.out.print(n + " ");
      PrintNto1(n-1);
    }
  }
  public static void Print1toN(int n){
    //Print1toN(10);                                    10
        //=> Print1toN(9);                            8
            //=> Print1toN(8);                      7
                //=> Print1toN(7); ...            3 4 5 6
                  //=> Print1toN(2)              2
                    //=>Print1toN(1);           1
                        //=> Print1toN(0); 
    if(n>0){
      Print1toN(n-1);
      System.out.print(n+" ");
    }
  }
  public static void main(String[] args) {
    System.out.println(factorial(5));
    System.out.println(exponential(2, 10));
    System.out.println(division(24, 6));
    System.out.println(recursiveDivision(25, 6));
    PrintNto1(10);
    System.out.println();
    Print1toN(10);
  }
}