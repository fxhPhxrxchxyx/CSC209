package csc209.lab4;

public class SinglyLinkedList {
  TolitePaper head , tail;

  public SinglyLinkedList(){
    head = tail = null;
    // no node head tail poin to null
  }
    public void addToHead(String b, double p, int l , String c){
      head = new TolitePaper(b, p, l, c, head); //next of new node is the current head
      if(tail == null){
        tail = head;

      }
    }
    public void addToTail(String b,double p,int l ,String c){
      if(head == null){ //list was empty -> creat new node
        head = tail = new TolitePaper(b,p, l, c, null);
      }else{
        tail.next = new TolitePaper(b,p, l, c, null);
        tail = tail.next;
      }

    }
    public TolitePaper deleteFromHead(){
      TolitePaper deletedNode = head;
      if(head == tail){//no more l node
        head = tail = null;
      }
      head = head.next;

      return deletedNode;
    }
    public String deleteFromTail(){
      String deleteNode ;
      //search for the node front of the last node
      if(head ==tail){
        head = tail = null; deleteNode = "";
      }else{
        deleteNode =  tail.toString();
        TolitePaper temp;
        for (temp = head;temp.next != tail ; temp = temp.next ) {
          //keep moving for the searching  
        }
        tail = temp;
        tail.next = null;
      }
      return deleteNode;
    }

    public void printAllTolitePaperColor(){
      //print color of all toilte paper
      for(TolitePaper toilet = head; toilet != null; toilet = toilet.next ){
        System.out.print(toilet.getColor()+" ");
      }
    }
    public String findToiletPaperColor(String color){
      //print all brand of toilet paper that use
      // the given color
      String answer= "";
      for(TolitePaper temp = head; temp != null; temp = temp.next){
        if(temp.getColor().equalsIgnoreCase(color)){
          answer += temp.getBrand() + ", ";
        }
      }
      return answer;
    }

    public void insertAtIth(String b, double p, int l, String c, int positionIth){
      //The first item is at 0th
      if(positionIth<=0){
        addToHead(b, p, l, c);
      }else{
        TolitePaper temp = head;
        for(int i =0;  temp != null && i< positionIth-1; i++){
          temp = temp.next;
        }
        if(temp != null){
          temp.next = new TolitePaper(b, p, l, c, temp.next);
        }
        else{
          addToTail(b, p, l, c);
        }
      }
    }
  }

