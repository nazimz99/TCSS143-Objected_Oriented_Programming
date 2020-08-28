/*
   Programmer: Nazim Zerrouki
   Program: Lab6b.java
   Date: 2/20/18
*/
import java.util.*;
public class Project {
   protected int linesOfCode;
   protected int linesWritten;
   protected int linesTested;
   protected int duration;
   protected ArrayList<Employee> employees = new ArrayList<Employee>();
   
   public Project (int linesOfCode, int duration) {
      this.linesOfCode = linesOfCode;
      this.linesWritten = 0;
      this.linesTested = 0;
      this.duration = duration;
   }
   
   public int getDuration() {
      return this.duration;
   }
   
   public void addEmployee(Employee e) {
      employees.add(e);
            
   }
   
   public ArrayList<Employee> getEmployees() {
      return employees;
   }
   
  public int doProject(ArrayList<Employee> employees) {
      int days = 0;
      while (this.linesWritten < this.linesOfCode && this.linesTested < this.linesOfCode) {
         for (Employee e : employees) {
            if (e instanceof Programmer) {
               this.linesWritten += ((Programmer) e).work();
            }
            if (e instanceof Tester) {
               this.linesTested += ((Tester) e).work();
            }
         }
         days++;
      } 
      return days - this.getDuration();   
   } 
}

class TestProject {
   public static void main(String[] args) {
      Employee p1 = new Programmer("Nazim", "137533", 108);
      Employee t1 = new Tester("John", "537822", 125);
      Employee p2 = new Programmer("Chuck", "932871B", 115);
      Employee t2 = new Tester("Robbie", "2935A23", 105);
      Project pro = new Project(1200, 5);
      pro.addEmployee(p1);
      pro.addEmployee(t1);
      pro.addEmployee(p2);
      pro.addEmployee(t2);
      System.out.println(pro.doProject(pro.getEmployees()) +  " days from the allotted days");  
   }
}