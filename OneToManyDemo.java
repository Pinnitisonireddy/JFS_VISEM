//ONE TO MANY
//ONE DEPARTMENT---> MANY EMPLOYEE

import java.util.*;
class Employee{
int id;
String name;
Employee(int id,String name){
this.id = id;
this.name = name;
}
}
  class Department{
    int deptId;
    String deptName;
    List<Employee>emplist;
    Department(int did, String name, List<Employee>emplst){
    this.deptId = did;
   this.deptName = dname;
   this.emplst = emplst;
   }
}
public class OneToManyDemo{
public static void main(String [] args){
Employee e1 = new Employee(1,"ravi");
Employee e2 = new Employee(2,"Anita");
List<Employee>empList = new ArrayList<Employee>();
empList.add(e1);
empList.add(e2);
Department dept = new Department (101, "CSE", emplst);
System.out.println("Dep:" + dept.deptName);
for(Employee e:dept.emplst)
{
System.out.println(e.id+" "+e.name);
}
}
}


