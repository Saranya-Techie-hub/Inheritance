package Inheritance;

class Rectangle 
{
    int length, breadth;
    public Rectangle()
    {
        length = breadth =1;
    }
    public Rectangle(int l, int b)
    {
        length = l ;
        breadth = b;
    }
}
class Cuboid extends Rectangle
{
    int height;
    public Cuboid()
    {
        height = 1;
    }
    public Cuboid(int h)
    {
      height = h;   
    }
    public Cuboid(int l, int b, int h)
    {
        super(l, b);
        height = h;
    }
    public int volume()
    {
        return length*breadth*height;
    }
    
}

public class SuperConst1 {

    public static void main(String[] args) {
        Cuboid c = new Cuboid(5, 3, 10);
        System.out.println(c.volume());
    }
    
}
