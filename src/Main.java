import java.util.Scanner;

public class Main {
    public  static void main(String[] args){

        for(int i=1; i<=20; i++)
        {
            System.out.print("=");
        }

        System.out.print("|Basic Calculator|");


        for(int i=1; i<=20; i++)
        {
            System.out.print("=");
        }


        System.out.print("\n");

        System.out.println("Do you want to perform which one of following");
        System.out.println("1) For addition");
        System.out.println("2) For subtraction");
        System.out.println("3) For Multiplication");
        System.out.println("4) For division");
        System.out.println("5) For Average");

        System.out.println("Enter number which are mentioned above");
        Scanner ne=new Scanner(System.in);
        char op=ne.next().charAt(0);


        if(op=='+')
        {
            add();
        }
        else if(op=='-')
        {
//            sub();
        }
        else if(op=='*')
        {
//            mult();
        }
        else if(op=='/')
        {
//            div();
        }
        else if(op=='a')
        {
//            avg();
        }

        else
        {
            System.out.print("you entered invalid operation");
        }




    }
    static void add()
    {


        Scanner ne=new Scanner(System.in);

        System.out.println("Enter first number");
        int  a=ne.nextInt();

        System.out.println("Enter second number");
        int  b=ne.nextInt();


        System.out.print("sum of numbers is = "+(a+b));

    }

}