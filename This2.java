   import java.util.*;
   
 class Student{  
    int rollno;  
    String name;  
    float fee;  
    Student(int rollno,String name,float fee){  
    this.rollno=rollno;  
    this.name=name;  
    this.fee=fee;  
    }  
    void display(){
    System.out.println(rollno+" "+name+" "+fee);}  
 }  
      
  class This2{  
    public static void main(String args[]){  
    Student s1=new Student(9,"megh",40000f);  
    Student s2=new Student(10,"sesh",36000f);  
    s1.display();  
    s2.display();  
    }
  }  
