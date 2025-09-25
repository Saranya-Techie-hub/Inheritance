package Inheritance;

class Parent
{
    public Parent()
    {
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent
{
    public Child()
    {
        System.out.println("Child Constructor");
    }
}

public class InheritConstructor {

    public static void main(String[] args) {
        Child c = new Child();
    }
    
}