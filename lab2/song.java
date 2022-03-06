package csc209.lab2;

public class song {
  private int id; // 4 bytes
  private String title; // 20 bytes
  private String genre; //6 bytes
  private String artist; // 20 bytes
  private double duration;// 20 bytes
  //a single record of song is 4+20+10+6+20 = 60btes

  public song(int id, String title, String genre, double duration, String artist){
    this.id = id;
    this.title= title;
    this.genre =genre;
    this.duration = duration;
    this.artist =artist;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getGenre() {
    return genre;
  }
  public void setGenre(String genre) {
    this.genre = genre;
  }
  public double getDuration() {
    return duration;
  }
  public void setDuration(double duration) {
    this.duration = duration;
  }
  public String getArtist() {
    return artist;
  }
  public void setArtist(String artist) {
    this.artist = artist;
  }
}
