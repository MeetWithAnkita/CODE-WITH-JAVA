class A 
{   
    int a; String b ;//instance variable 
    //An instance variable in Java is a variable declared within a class but outside any method, constructor, or block.
    //  Each object (instance) of the class has its own separate copy of instance variables.
    //  These variables represent the state of an object and are stored in the heap memory. 
    A()  //default constructor  // if i comment out this A() constructor then also we 
    // get out put 0 null because in java every class has a default constructor .
    {
        a=1 ; 
        b="Ankita";
    }
    void show()
    {
        System.out.println(a+" "+b);
    }
}
class study_constructor
{
    public static void main(String [] args)
    {
        A a = new A();
        a.show();
    }
}