abstract class A{
    abstract void disp();
    void display()
    {
        System.out.println("hello class A");
    }
}
class B extends A{
    void disp(){
        System.out.println("hello class B");
    }
}
class Abstract{
    public static void main(String args[]){
        B b = new B();
        b.disp();
        b.display();
    }
}
