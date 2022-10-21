import java.util.Scanner;

public class LinearEquationRunner
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------- \nWelcome!");
        System.out.print("Please enter your coordinate 1 (integers): ");
        String c1 = input.nextLine();
        System.out.print("Please enter your coordinate 2 (integer): ");
        String c2 = input.nextLine();

        int comma1 = c1.indexOf(",");
        String x1String = c1.substring(1, comma1); //takes x1  out as string
        String y1String = c1.substring(comma1+2, (c1.length()-1)); //takes y1 out as string
        int x1 = Integer.parseInt(x1String); //converts x1 string to int
        int y1 = Integer.parseInt(y1String); // converts y1 string to int

        int comma2 = c2.indexOf(",");
        String x2String = c2.substring(1, comma2); // takes x2 out as string
        String y2String = c2.substring(comma2+2, (c2.length()-1)); // takes y2 out as string
        int x2 = Integer.parseInt(x2String); // converts x2 string to int
        int y2 = Integer.parseInt(y2String); // converts y2 string to int

        if (x1 == x2)
        {


        }

        LinearEquation points = new LinearEquation(x1, y1, x2, y2);









    }

}
