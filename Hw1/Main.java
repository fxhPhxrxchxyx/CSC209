package csc209.Hw1;

public class Main {
  public static void main(String[] args) {
    System.out.println("Assigment1 Phurichaya Khemvaraporn StudentId : 64130500227");
    Fraction f1 = new Fraction(5, 6);
    Fraction f2 = new Fraction(3, 8);
    Fraction f3 = new Fraction(10, 20);
    Fraction f4 = new Fraction(10, 25);
    Fraction f5 = new Fraction(4, 7);
    Fraction f6 = new Fraction(2, 7);
    System.out.println("add: " + f1.add(f2) +"\n     "+f5.add(f6));
    System.out.println("subtract: " + f1.subtract(f2));
    System.out.println("multiply: " + f1.multiply(f2));
    System.out.println("devide: " + f1.devide(f2));
    System.out.println("reduce:" + f3.reduce() +"\n       " +f4.reduce());  
  }

}

class Fraction{
  int numerator;
  int denominator;

  public Fraction(int numerator,int denominator){
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public String toString(){
    return numerator + "/" + denominator;
  }

  public Fraction add(Fraction f){
    return (new Fraction(this.numerator * f.denominator + f.numerator * this.denominator, this.denominator * f.denominator).reduce());
  }

  public Fraction subtract(Fraction f){
    return (new Fraction(this.numerator * f.denominator - f.numerator * this.denominator, this.denominator * f.denominator).reduce());
  }
  
  public Fraction multiply(Fraction f){
    return (new Fraction(this.numerator * f.numerator, this.denominator * f.denominator).reduce());
  }

  public Fraction devide(Fraction f){
    return (new Fraction(this.numerator * f.denominator, this.denominator * f.numerator).reduce());
  }
  public Fraction reduce(){
    int min = 1;
    if(numerator<denominator){
      min = numerator;
    }else{
      min = denominator;
    }

    int gcd =1;
    for (int i = 2; i <=min; i++) {
      if(numerator%i==0 && denominator %i==0){
        gcd = i;
      }
    }

    return new Fraction(this.numerator/gcd, this.denominator/gcd);
  }
}

