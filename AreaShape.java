/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaoverload;

/**
 *
 * @author sjcet
 */
public class AreaShape {
 void area(int x) {
      System.out.println(“Area of square is = “ + (x*x));
   }
   void area(int x,int y) {
       System.out.println(“Area. of rectangle is = “ + (x*y))
   }
   void area(int x,int y,int z) {
double s=(x+y+z)/2;
double triArea;
triArea = Math.sqrt(s*(s–x)*(s–y)*(s–z));
      System.out.println(“Area of triangle is = “ + triArea);
   }
}
public class AreaOverload {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      AreaShape obj = new AreaShape();
obj.area(10); //Call area(int x)
obj.area(5,6); //Call area(int x,int y)
obj.area(4,5,6);  // TODO code application logic here
    }
    
}
