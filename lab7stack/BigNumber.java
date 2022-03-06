package csc209.lab7stack;

public class BigNumber {
  private String number; //if number =123
  public BigNumber (String number){
    this.number = number;
  }
  public BigNumber (int number){
    this.number = number +"";
  }
  public BigNumber add(BigNumber number2){ //if add 555
    //"123" + "555" = "678"(BigNumber)
    //"523" + "6789" = "7312" (BigNumber)
    //"7523" + "6789" = "14312"
    //number + number2 = answer
    //operand1 + operand2
    String answer="";
    OurStack operand1 = new OurStack(number.length());
    OurStack operand2 = new OurStack(number2.toString().length());
   for (int i = 0; i < number.length(); i++) {
     operand1.push(number.charAt(i)-48); //convert ascii of int to int
    //  System.out.print(operand1.topElement()+" ");
   }
   for (int i = 0; i < number2.toString().length(); i++) {
     operand2.push(number2.toString().charAt(i)-48);
   }
   int size;
  //have to soln
  //  if(number.length()>number2.toString().length()){
    // size = number.length()+1;
    //  }else{
      //   size = number2.toString().length()+1; 
    //}
   size = Math.max(number.length(), number2.toString().length())+1;
   OurStack answerStack = new OurStack(size);
   int carry = 0;
   while(!operand1.isEmpty() || !operand2.isEmpty()){
     int a = (operand1.isEmpty() ? 0:operand1.pop()) + (operand2.isEmpty() ? 0 : operand2.pop()) + carry;
     answerStack.push(a%10); //have 2 digit wiil pick back digit ex 17 => 17%10 = 7
     carry = a/10;           //                  pick fornt digit         17/10 = 1
   }
   if(carry > 0){
     answerStack.push(carry);
   }
   while(!answerStack.isEmpty()){
     answer += answerStack.pop();
   }
   return new BigNumber(answer);
  }
  //or
  // public add(int number2){
  // }
  public String  toString(){
    return number;
  }
}
