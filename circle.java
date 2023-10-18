import java.util.*;

class circle{
      double area; 
      double perimeter;
  
   double circleArea(double radius){
        area=3.14*radius*radius;
        return area;
       }
       
       double circlePerimeter(double radius){
        perimeter=2*3.14*radius;
        return perimeter;
        }
     public static void main(String args[]){
          circle c=new circle();
        
        Scanner scan=new Scanner(System.in);
        double rad=scan.nextDouble();
       
         double a;
         double p;
         a=c.circleArea(rad);
         p=c.circlePerimeter(rad);
         System.out.println(a);
         System.out.println(p);
     }
}
         
