package csc209.lab2;
import java.util.logging.*;
import java.io.*;
// import java.io.FileNotFoundException;
public class RandomAccess {
  public static void main(String[] args) {
    try {
      RandomAccessFile raf = new RandomAccessFile("song.dat", "rw");
      song s1 = new song(101, "Last Friday Night", "Pop", 3.20, "Katy Perry");
      System.out.println(s1.getTitle()+ " "+ s1.getArtist());
      song s2 = new song(102, "The Black Hawk War", "Rap", 4.52, "Sufjan Stevens");
      System.out.println(s2.getTitle()+ " "+ s2.getArtist());

      //song1
      raf.writeInt(s1.getId());
      byte[] title = new byte[20];
      title = s1.getTitle().concat("                   ").getBytes();
      raf.write(title, 0 ,20);

      byte[] genre = new byte[10];
      genre = s1.getGenre().concat("          ").getBytes();
      raf.write(genre, 0 ,10);

      raf.writeDouble(s1.getDuration());
      byte[] artist = new byte[20];
      artist = s1.getArtist().concat("                   ").getBytes();
      raf.write(artist,0,20);


      //song2
      raf.writeInt(s2.getId());
      title = new byte[20];
      title = s1.getTitle().concat("                   ").getBytes();
      raf.write(title, 0 ,20);

      genre = new byte[10];
      genre = s2.getGenre().concat("          ").getBytes();
      raf.write(genre, 0 ,10);

      raf.writeDouble(s2.getDuration());
      artist = new byte[20];
      artist = s2.getArtist().concat("                   ").getBytes();
      raf.write(artist,0,20);

      //pointer
      System.out.println(raf.getFilePointer());
      raf.seek(4);
      raf.read(title, 0, 20);
      System.out.println(new String (title));

      //duration of the first song is at 4+2+10 = 34th byte
      raf.seek(34);
      double songDuration = raf.readDouble();
      System.out.println(songDuration); 

      //duration of the second song is at 62+34 = 96th byte
      raf.seek(96);
      songDuration = raf.readDouble();
      System.out.println(songDuration); 

    } catch (FileNotFoundException ex) {
Logger.getLogger(RandomAccessFile.class.getName()).log(Level.SEVERE, null, ex);
} catch (IOException ex) {
Logger.getLogger(RandomAccessFile.class.getName()).log(Level.SEVERE, null, ex);
}
  }
}
