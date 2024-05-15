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



    }
}