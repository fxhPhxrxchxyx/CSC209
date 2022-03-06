package csc209.lab4;

public class TolitePaper {
  String brand;
  double price;
  int length;
  String color;
  TolitePaper next;

  TolitePaper(String brand,double price,int length,String color, TolitePaper n  ){
    this.brand = brand;
    this.price = price;
    this.length = length;
    this.color = color;
    next = n;
  }
  public String getBrand() {
    return brand;
  }
  public String getColor() {
    return color;
  }public int getLength() {
    return length;
  }
  public double getPrice() {
    return price;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public void setLength(int length) {
    this.length = length;
  }
  public void setPrice(double price) {
    this.price = price;
  }
}
