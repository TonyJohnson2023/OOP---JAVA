class AreaShape {
void area(int x){
    System.out.println("Area of square is="+(x*x));
}
void area(int x, int y){
    System.out.println("Area. of rectangle is ="+(x*y));
}
void area(int x,int y, int z){
    double s=(x+y+z)/2;
    double triArea;
    triArea = Math.sqrt(s*(s-x)*(s-y)*(s-z));
    System.out.println("Area of triangle is ="+triArea);
 }
}
public class AreaOverload{
    
    public static void main(String[] args) {
    AreaShape obj = new AreaShape();
obj.area(10);
obj.area(5,6);
obj.area(4,5,6);
 }
}

    
