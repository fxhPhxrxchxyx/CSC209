package csc209.Hw2;
import java.util.Vector;
import java.util.logging.*;
import java.io.*;
public class vector {
  public static void main(String[] args) {
     try {
       RandomAccessFile nameRf = new RandomAccessFile("csc209/Hw2/Name.dat", "rw");
           Namevectoe n1 = new Namevectoe("Jack      ",10);
    Namevectoe n2 = new  Namevectoe("Jim       ",30);
    Namevectoe n3 = new  Namevectoe("John      ",20);
    Namevectoe n4 = new  Namevectoe("Sack      ",50);
    Namevectoe n5 = new  Namevectoe("Tom       ",0);
    Namevectoe n6 = new  Namevectoe("Tony      ",40);
    Namevectoe n7 = new  Namevectoe("Ann       ", 60);
    Namevectoe n8 = new  Namevectoe("Daneal    ",70);

     Vector nameVec = new Vector();
       nameVec.add(n1);
       nameVec.add(n2);
       nameVec.add(n3);
       nameVec.add(n4);
       nameVec.add(n5);
       nameVec.add(n6);
       nameVec.add(n7);
       nameVec.add(n8);

    byte x[] = new byte[10];
       for (int i = 0; i < 8; i++) {
         int location = ((Namevectoe) nameVec.elementAt(i)).getPosition();
         x = (((Namevectoe) nameVec.elementAt(i)).getName()).getBytes();
         nameRf.seek(location);
         nameRf.write(x);
        // System.out.println(location);
       }

     }
      catch (FileNotFoundException ex) {
Logger.getLogger(RandomAccessFile.class.getName()).log(Level.SEVERE, null, ex);
} catch (IOException ex) {
Logger.getLogger(RandomAccessFile.class.getName()).log(Level.SEVERE, null, ex);
}


  }
}
