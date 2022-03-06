package csc209.Hw1;
public class FractionString{

  private int a;
  private int b;
 

  public int getA() {
    return a;
  }
  public void setA(int a) {
    this.a = a;
  }
  public int getB() {
    return b;
  }
  public void setB(int b) {
    this.b = b;
  }
  
  
  public FractionString(int a, int b){
    this.a = a;
    this.b = b;
  }
  
  
  public static void main(String[] args) {
    System.out.println("Assigment1 Phurichaya Khemvaraporn StudentId : 64130500227");
    FractionString num1 = new FractionString(5, 3);
    FractionString num2 = new FractionString(10, 20);
    FractionString num3 = new FractionString(10, 25);
    System.out.println("------Add Method----------");
    System.out.println(num1.getA()+num1.getB()+num1.Add(5, 5));
    System.out.println(num1.Add(6, 8));
    System.out.println("------subtract Method-----");
    System.out.println(num1.getA()- num1.getB()+num1.Subtract(9, 9));
    System.out.println(num1.Subtract(6, 8));
    System.out.println("------Multiply Method-----");
    System.out.println(num1.Multiply(6, 8));
    System.out.println("------Devide Method-------");
    System.out.println(num1.Divide(6, 8));
    System.out.println("------Reduce Method-------");
    System.out.println(num2.Reduce());
    System.out.println(num3.Reduce());
    
  }
  
  public String Add( int c, int d){
    if(c == d){
      return  "/" + d ; 
    }
    else{
      int denominator = c * d;
      int numerator = (a*d) + (b*c);
     return numerator +"/"+denominator;
    }
}
  public String Subtract(int c , int d){
    if(c == d){
      return  "/" + d ; 
    }
     else{
      int denominator = c * d;
      int numerator = (a*d) - (b*c);
     return numerator +"/"+denominator;
    }
  }
  public String Multiply(int c , int d){
    return a*b + "/" + c*d;
  }
  public String Divide(int d, int c){
    return a*c +"/" +b*d;
  }
  public String Reduce(){ 
  int GCD =1;
  for (int i = 1; i <= a; i++) {
    if(a%i==0 && b%i==0){
      GCD = i;
    }
  }
  return a/GCD +"/" +b/GCD;
  
  }
}




