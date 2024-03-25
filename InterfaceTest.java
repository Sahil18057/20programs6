interface Calculate{
    int display(int a, int b);
}
class A implements Calculate{
    public int display(int a, int b){
        return a * b;
    }
}
class B implements Calculate{
    public int display(int a, int b){
        return a + b;
    }
}
class InterfaceTest{
    public static void main(String args[]){
        Calculate Multiplication = new A();
        Calculate Addition = new B();
        int multiplication = Multiplication.display(a:6,b:5);
        int addition = Addition.display(a : 6,b : 5);
        System.out.println("Multiplication"+multiplication);
        System.out.println("Addition"+addition);
    }
}