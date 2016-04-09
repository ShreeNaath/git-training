import java.util.Scanner;
public class calc extends add
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int option,a,b;
        System.out.println("Menu:\n1.Add\t3.Exit");
        System.out.println("Enter the option :");
        option=s.nextInt();
        System.out.println("Enter the two numbers :");
        a=s.nestInt();
        b=s.nextInt();
        do
        {
            switch(option)
            {
                case 1:add(a,b);break;
                case 2:return;
                default:System.out.println("Enter 1, 2 or 3:");
            }
        }while(option<4);
    }
}