//LAB4 //AREA & PERIMETER
import java.util.*;
import java.lang.*;
class Shape {
    /*  Shape(){
     System.out.println("hey");
          } */
  

     void getArea(){
 
      System.out.println("help you in calc area");
     }  

     void getPerimeter(){
  
         System.out.println("help you in calc perimeter");
     }
 
}


class rectangle extends Shape {

    int len,breadth;
    
      rectangle(int l,int b)  {
            len=l;
            breadth=b;     
      }
      void getArea() {     
             //super.getArea();
            System.out.println("area of rectangle is "+len*breadth);
      }
      void getPerimeter() {
            // super.getPerimeter();
       System.out.println("area of rectangle is "+2*(len+breadth));
       
       }
}
       
   
       
 class square extends Shape{
   
    int side;
   
   square(int s)  {        
         side=s; 
   }
     
   void getArea()  {
          // super.getArea();
       System.out.println("area of square is "+ side*side);
   }
   
   void getPerimeter()  {
         //super.getPerimeter();
          System.out.println("area of square is "+ 4*side);
   }
}



class  circle extends Shape{    
      double radius;
      
    circle( double r){
        radius=r;
    }
    void getArea(){
         //super.getArea();
         System.out.println("area of circle is "+ 3.14*radius*radius);
    }
    void getPerimeter(){
      //super.getPerimeter();
          System.out.println("area of circle is "+2*3.14*radius);
    }

}  
     
 class area__perimeter{
       public static void main(String args[]){
           rectangle rect=new rectangle(4,5);
           square sq=new square(5);
           circle cr=new circle(7.0);
        
              rect.getArea();
              rect.getPerimeter();
              sq.getArea();
              sq.getPerimeter();
              cr.getArea();
              cr.getPerimeter();
       }  
}
   
