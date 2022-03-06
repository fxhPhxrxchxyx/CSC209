package csc209.lab5;

public class RegisterNode {
  int studentid;
  int classid;
  double grade; //A:4.0, B+:3.5, b:3.0, ...
  RegisterNode nextStudent;
  RegisterNode nextClass;

  public RegisterNode(int studentid, int classid,double grade,RegisterNode nextStudent,RegisterNode nextClass){
  this.studentid = studentid;
  this.classid = classid;
  this.grade = grade;
  this.nextStudent = nextStudent;
  this.nextClass = nextClass;
  }
  public RegisterNode(){
    this(0,0,4.0,null,null);
  }
  public void setGrade(double grade) {
    if(grade >= 0 && grade <= 4.0){
      this.grade = grade;
    }
  }
  public double getGrade() {
    return grade;
  }
}
