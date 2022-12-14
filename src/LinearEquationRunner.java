import java.util.Scanner;

public class LinearEquationRunner
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------------------- \nWelcome!"); //welcomes the user
        System.out.print("Please enter your coordinate 1 (integers): "); // user inputs coordinate 1
        String c1 = input.nextLine();
        System.out.print("Please enter your coordinate 2 (integer): "); // user inputs coordinae 2
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

        if (x1 == x2) // if same x value then it prints out the equation for a vertical linea and stops the program
        {
            System.out.println("\nYou have entered coordinates that result in a vertical line in the form of x= "+ x1 + "\n-----------------------------");
        } else { // else it continues with the program
            LinearEquation points = new LinearEquation(x1, y1, x2, y2);
            System.out.println(points.getInfo());
            System.out.print("Enter a value for x: ");
            int newX = input.nextInt();
            System.out.println("\nThe point on the line is: "+ points.getCoordinates(newX)+ "\n-----------------------------");

        }



    }

}
