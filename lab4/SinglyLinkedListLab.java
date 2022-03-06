package csc209.lab4;

public class SinglyLinkedListLab {
  public static void main(String[] args) {
    
    SinglyLinkedList list1 = new SinglyLinkedList();
    list1.addToHead("Scott",100,10,"Pink");
    //Scoot Pink
    list1.addToHead("Scott",300,37,"Blue");
    //Scoot Blue -> Scoot Pink
    System.out.println(list1.head.getColor());
    System.out.println(list1.tail.getColor());
    list1.addToHead("Gucci", 50000, 3, "Gold");
    // "Gucci Gold" -> "Scott Blue" -> "coot Pink"
    System.out.println(list1.head.getColor()+" " + list1.tail.getColor());
    System.out.println(list1.head.next.getColor());
    list1.addToHead("Festa", 200, 12, "Orenge");
    list1.addToHead("Festa", 210, 15, "Red");
    //Red -> Oreange -> "Gucci Gold" -> "Scott Bule" ->"sScott Pink"
    System.out.println(list1.head.getColor()+" "+list1.tail.getColor());
    System.out.println(list1.head.next.next.getColor()+" "+list1.head.next.next.next.getColor());
    //gold blue


    list1.addToTail("Supreme", 1000, 5, "Silver");
    //Red -> Orange -> "Gucci Gold" -> "Scott Blue" ->"Scott Pink" -> Silver
    System.out.println(list1.tail.getColor());
    list1.deleteFromHead();
    //Orenge -> "Gucci Gold" -> "Scott Blue" ->"Scott Pink" -> Silver
    System.out.println(list1.head.getColor());

    list1.deleteFromTail();
    //Orenge -> "Gucci Gold" -> "Scott Blue" ->"Scott Pink" -> Silver
    System.out.println(list1.tail.getColor());

    //print all color 
    list1.printAllTolitePaperColor();

    list1.addToHead("Gucci", 10000, 20, "Blue");
    //Gucci Blue -> Orange -> "Gucci Gold" -> "Scoot Blue" -> "Scoot Pink"

    System.out.println("\n"+list1.findToiletPaperColor("Blue"));

    list1.insertAtIth("Scott", 100, 20, "Pink", 100);
    list1.printAllTolitePaperColor();
  }

}
