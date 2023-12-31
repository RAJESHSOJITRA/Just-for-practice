class Shape{
   public  void area(){
        System.out.println("display the area");

    }
}
class Triangle extends Shape{                //singlelevel inheritance
                                                   // shape->triangle
    public void area(int l,int h){
        System.out.println(1/2*l*h);

    }
}
//Equilateral triangle have equal sides in a triangle 
                                                                    // multilevel inheritance 
class EquilateralTriangle extends Triangle{                   // shape->triangle->equiltriangle
     public void area( int l,int h){
                                                                 
    
        System.out.println(1/2*l*h);
        }
    }
class Cricle{
    public void area(int r)
    system.out.println((3.14*r*r));         //hirerchial inheritance
}                                            //shape->triangle            
                                             //       ->cricle



public class Inheritance {
   public static void main (String args[]){
    Shape shape=new Shape();
    shape.area();

    Triangle triangle=new Triangle();
    triangle.area(2,3);

     EquilateralTriangle equiltriangle =new EquilateralTriangle();
    equiltriangle.area(5,5);
    
   



   }



}
