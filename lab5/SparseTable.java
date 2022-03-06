package csc209.lab5;

public class SparseTable {
  RegisterNode[] students; // list of student pointers to nodes
  RegisterNode[] classes; // list of classes pointers to nodes

  public SparseTable(int amountOfStudent, int amountOfClass){
    students = new RegisterNode[amountOfStudent];
    classes = new RegisterNode[amountOfClass];
  }
  public void addRegistration(int studentID, int classID){
    RegisterNode newRegis = new RegisterNode(studentID,classID,-1,null,null);
    //student dimension -> add new course to student
    if(students[studentID] == null || classID < students[studentID].classid){ // new class will be first class in the list of student
      newRegis.nextClass = students[studentID];
      students[studentID] = newRegis;
    }else{
      //have a lot of node
      RegisterNode c; //pointer
      for (c = students[studentID]; c.nextClass != null && c.nextClass.classid < classID ;c = c.nextClass); //move to next class
        //1 student go to next class
        newRegis.nextClass =  c.nextClass;
        c.nextClass = newRegis;
    }

    //course dimention -> add new student to the class
    if(classes[classID] == null || studentID < classes[classID].studentid){
      newRegis.nextStudent = classes[classID];
      classes[classID] = newRegis;
    }else{
      //have a lot of student
      RegisterNode s;
      for(s = classes[classID]; s.nextStudent != null && s.nextStudent.studentid < studentID; s= s.nextStudent);
        newRegis.nextStudent = s.nextStudent;
        s.nextStudent = newRegis;
      
    }
    
  }
  public void listAllClasses(int studentID){
    for(RegisterNode c = students[studentID];c != null ; c = c.nextClass){
      System.out.print(c.classid + " ");
    }
    System.out.println("");
  }
}
