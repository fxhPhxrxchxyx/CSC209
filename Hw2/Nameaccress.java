package csc209.Hw2;
import java.io.RandomAccessFile;
import java.util.Vector;

public class Nameaccress{
  public static void main(String[] args) {
    try {
      RandomAccessFile nameR1 = new RandomAccessFile("csc209/Hw2/name.txt", "r");
      Vector<String> vec  = new Vector<>();
      while(nameR1.getFilePointer()<nameR1.length()){
        if(vec.size()==0){
          vec.addElement(nameR1.readLine());
          continue;
        }
        String textname = nameR1.readLine();
        boolean add = false;
        for (int i = 0; i < vec.size(); i++) {
          if(vec.get(i).compareTo(textname)>0){
            vec.insertElementAt(textname, i);
            add = true;
            break;
          }
        }
        if(!add){
          vec.addElement(textname);
        }
      }
      System.out.println(vec);
      nameR1.close();
     } catch (Exception e){
      System.out.println("error");
     }
  }
}