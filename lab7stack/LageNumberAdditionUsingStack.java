package csc209.lab7stack;

public class LageNumberAdditionUsingStack {
  public static void main(String[] args) {
    OurStack st1 = new OurStack(4);
    st1.push(50); st1.push(93);
    System.out.println((st1.topElement()));
    st1.push(34);
    System.out.println(st1.isEmpty()+" "+st1.isFull());
    st1.push(55);
    System.out.println(st1.isEmpty()+" "+st1.isFull());
    st1.push(97);
    System.out.println(st1.pop());
    System.out.println(st1.topElement());
    BigNumber n1 = new BigNumber("523");
    BigNumber n2 = n1.add(new BigNumber("7312"));
    System.out.println(n2.toString());
    String a ="333333333333333333333333333333333333333"+"333333333333333333333333333333333333333"+"333333333333333333333333333333333333333"+"333333333333333333333333333333333333333"+"333333333333333333333333333333333333333"+"333333333333333333333333333333333333333";
 BigNumber n3 = new BigNumber(a);
 BigNumber n4 = n3.add(new BigNumber(a));
 System.out.println(n4.toString());

 BigNumber n5 = n4.add(new BigNumber(n4.toString()));
 System.out.println(n5.toString());
 String b = "7".repeat(400);
 String c ="8".repeat(500);
 BigNumber n6 = new BigNumber(b);
 BigNumber n7 = n6.add(new BigNumber(c));
 System.out.println(n7.toString());
 BigNumber n8 = new BigNumber("999");
 BigNumber n9 = n8.add(new BigNumber("1"));
 System.out.println(n9.toString());

  }
}
