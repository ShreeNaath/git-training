public class Calc_func
{
    static void add(int a,int b)
    {
        System.out.println(a+b);

    }
    static void sub(int a,int b)
    {
        System.out.println(a-b);
    }
    static void mul(int a,int b)
    {
        System.out.println(a*b);
    }
    static void div(int a,int b)
    {
        if(b!=0)
            System.out.println(a/b);
        else
            System.out.println("Denominator cannot be zero");
    }

    static void mod(int a,int b)
    {
        System.out.println(a%b);
    
    }

}
