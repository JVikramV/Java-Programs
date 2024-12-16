abstract class Shape
{
    int dim1,dim2;
    public abstract void printArea();
    Shape(int dim1,int dim2)
    {
        this.dim1=dim1;
        this.dim2=dim2;
    }

}
class Rectangle extends Shape{

    Rectangle(int length,int breadth)
    {
        super(length,breadth);
    }
    public void printArea()
    {
        double area=dim1*dim2;
        System.out.println("The area of the rectangle="+area);

    }

}
class Triangle extends Shape
{
    int base,height;
    Triangle(int base,int height)
    {
        
        super(base,height);
    }
    public void printArea()
    {
        double area=(0.5*dim1*dim2);
        System.out.println("The area of the Triangle="+ area);
    }
}
class Circle extends Shape{
    int radius;
    Circle(int radius)
    {
       
        super(radius,0);
    }
    public void printArea()
    {
        double area=(3.14*dim1*dim1);
        System.out.println("The area of the circle="+area);
    }
}
public class Shapemain{
    public static void main(String[] args)
    {
        Shape R=new Rectangle(10,20);
        Shape T=new Triangle(10,30);
        Shape C=new Circle(10);
        R.printArea();
        T.printArea();
        C.printArea();
    }
}
