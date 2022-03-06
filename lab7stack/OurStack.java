package csc209.lab7stack;

public class OurStack {
  private int[] info;
  private int top;

  public OurStack(int capacity){
    info = new int[capacity];
    top = 0;
  }
  public void push(int newInfo){
    if(!isFull()){
      info[top] = newInfo;
      top++;
    }else{
      System.out.println("Stack is full. You can't push a new member.");
    }
  }
  public boolean isFull(){
    return top >= info.length;
  }
  public int pop(){
    int x;
    if(!isEmpty()){
      top--;
      x = info[top];
    }else{
      x = -999;
      System.out.println("Stack is empty. There is nothing to pop.");
    }
    return x;
  }
  public int topElement(){
    if(top==0){ //spealcase don't have element 
      return -1;
    }
    //want to know top
    return info[top-1];
  }
  public void clear(){
    top = 0;
  }
  public boolean isEmpty(){
    return top == 0;
  }
}
