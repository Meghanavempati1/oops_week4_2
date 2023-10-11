import java.util.*;
import java.lang.*;
import java.io.*;

 class person{
    String name;
    String address;
    
    person(String nm,String ads){
     
    name=nm;
    address=ads;
    }
  void getName(){
     System.out.println(name);
     
    }
   void getAddress(){
    
   System.out.println(address);
   }
   
   void setAddress(String ads){
   this.address=ads;
     
   }
 }
 
 class Student extends person{
 
   int numCourses=0;
   String[] courses=new String[30];
   int[] grades=new int[30];
   
   Student(String name,String address,int numCrse,String[] nCourse,int[] grd){
    super(name,address);
    numCourses=numCrse;
    courses=nCourse;
    grades=grd;
   }
   void addCourseGrade(String course,int grade){
     for(int i=0;i<numCourses;i++){
     if(course==courses[i]){
      System.out.println("course already existed");
      return;
      }
      }courses[numCourses]=course;
       grades[numCourses]=grade;
       numCourses++;
       
   }
   void printGrades(){
    for(int i=0;i<numCourses;i++){
    System.out.println(grades[i]);
   }
  }
  }
  class Teacher extends person{
     int numCourses=0;
     String[] courses=new String[30];
     
   Teacher(String name,String address,int numCrse,String[] nCourse){
    super(name,address);
    numCourses=numCrse;
    courses=nCourse;
   
   }
   
   boolean addCourse(String Course){
    for(int i=0;i<numCourses;i++)
     if(Course==courses[i]){
      
      return true;
 
     }
       return false;
   }
   
  boolean removeCourse(String Course){
    for(int i=0;i<numCourses;i++){
     if(Course==courses[i])
      return false;
     } 
      return true ;
   
     }
     
  }
   
  public class test{
   public static void main(String args[]){
   String[] course=new String[30];
   course[0]="dbms";
   course[1]="oops";
   course[2]="mefa";
   int[] grades=new int[10];
   grades[0]=9;
   grades[1]=10;
   grades[2]=8;
   Student s=new Student("meghana","suryapet",3,course,grades);
  s.addCourseGrade("dbms",9);
  s.printGrades();
  Teacher t=new Teacher("meghana","suryapet",3,course);
  System.out.println(t.addCourse("oops"));
  System.out.println(t.removeCourse("pom"));
 }
 }
