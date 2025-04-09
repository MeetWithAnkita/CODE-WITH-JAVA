class a
{   
    int x,y ,m; String n; 
    a(int a, int b)
    {
        x = a ; y = b ;
    }
    a(int a, String b)
    {
        m = a ; n = b ;
        System.out.println(m+" "+n);

    }
    void disp()
    {
        System.out.println(x+" "+y);
    }
}
class study_parameterized_constructor
{
    public static void main(String args [])
    {
        a ref = new a(100, 200);
        a r = new a(6,"May");
        ref.disp();
    }
}