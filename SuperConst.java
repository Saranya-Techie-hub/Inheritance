package Inheritance;

class Parent 
{
    public Parent()
    {
        System.out.println("Non-Param of Parent");
    }
    public Parent(int x)
    {
        System.out.println("Param of Parent "+x);
    }
}
class Child extends Parent
{
    public Child()
    {
        System.out.println("Non-param of CHild");
    }
    public Child(int x)
    {
        System.out.println("Param of child");
      
    }
    public Child (int x, int y)
    {
        super(x);   //call parent constructor
        System.out.println("Two param of child "+y);
    }
}

public class SuperConst {

    public static void main(String[] args) {
        Child c = new Child(10, 20);
    }
    
}
