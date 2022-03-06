package csc209.lab3;
import java.io.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;
import java.util.logging.*;

import csc209.Hw2.vector;

//find population of havana city in city.dat
public class CityRandomAccressFile {
  public static void main(String[] args) {
    try {
      //before use randomAccress we must know size of data
      //"city_ascii"
      //latitude: double
      //longitude: double
      //country: 50 bytes
      //Iso2: 2 bytes
      //Iso3: 3 bytes
      //admin_name: 150 bytes
      //capital: 10 bytes
      //population: int
      //id: ???
      //150+8+8+50+2+3+150+10+4 = 385
      //popluation is at 381th bytes form the begining of the record
      RandomAccessFile fPointer = new RandomAccessFile("csc209/lab3/city.dat", "r");
      byte[] x = new byte[150];
      fPointer.read(x, 0, 140);
      System.out.println(new String(x));
      fPointer.seek(381);
      System.out.println(fPointer.readInt()); 
      boolean notfound = true;
      int record = 0;
     
      while(notfound){
        fPointer.seek(record * 385);
        fPointer.read(x,0,150);
        // System.out.println(new String(x));
        // if(record==10){ 
        //   notfound = false;
        // }
        String cityName = new String(x);
        cityName  = cityName.trim();
        if(cityName.equalsIgnoreCase("Hanawa")){//Hanawa
          System.out.println("Hanawa is at the record number "+record+".");
          fPointer.seek(record*385+381);
          System.out.println("The population of Hanawa is " + fPointer.readInt()+".");
          notfound = false;

          //what is the world population?
          //Show two city cities that have the same name
          //How many pairs of cities have the same name?       
        }
       
        record++;
      }
       Vector cityList = new Vector();
       record =0;
      while(record*385 < fPointer.length()){
        fPointer.seek(record*385);
        fPointer.read(x,0,150); 
        String city = new String(x);
        city = city.trim();
        cityList.add(city);
        record++;
      }
      for (int i = 0; i < 10; i++) { // testing the vector
        System.out.print(cityList.get(i)+" ");
      }
      System.out.println();
      Collections.sort(cityList);
      //SORT name of city
      for (int i = 0; i < 10; i++) {
        System.out.print(cityList.get(i)+" "); 
      }

      //To find two indentical city name
      for (int i = 0; i < cityList.size()-1; i++) {
        if(cityList.get(i).equals(cityList.get(i+1))){
          System.out.println(cityList.get(i) +" = "+cityList.get(i+1));
        }
      }

      fPointer.close();
    } catch (FileNotFoundException ex) {
Logger.getLogger(RandomAccessFile.class.getName()).log(Level.SEVERE, null, ex);

    } catch (IOException e) {
      //add catch cluase for read find
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
