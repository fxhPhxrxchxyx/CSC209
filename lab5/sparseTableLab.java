package csc209.lab5;

public class sparseTableLab {
  public static void main(String[] args) {
    SparseTable resgisterTable = new SparseTable(8000, 300);
    resgisterTable.addRegistration(405, 35);
     System.out.println(resgisterTable.students[405].classid);
     resgisterTable.addRegistration(405, 30);
     System.out.println(resgisterTable.students[405].classid);
      resgisterTable.addRegistration(405, 60);
     System.out.println(resgisterTable.students[405].classid);
     System.out.println(resgisterTable.classes[35].studentid);
     resgisterTable.listAllClasses(405);
  }
}