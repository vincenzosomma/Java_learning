import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner (System.in);
        
        String vName;
        Double vOne, vTwo, vRes;
        char vOperator;


        System.out.println("\n This is a Powerfull Calculator \n Please insert you name");
        
        vName = input.next();
        System.out.println("\n Hello " + vName);
        
        System.out.println(" Insert N1");
        vOne = input.nextDouble();

        System.out.println(" Insert Operator");
        vOperator = input.next().charAt(0);
        if (vOperator != '+' || vOperator != '-' ||
            vOperator != '*' || vOperator != '/')
            {
                System.out.println(" Insert a Correct Operator");
            }

        System.out.println(" Insert N2");
        vTwo = input.nextDouble();

        if (vOperator == '+')
        {
            vRes = vOne + vTwo;
            System.out.println("Result");
            System.out.println(vRes);

        } 
        else if (vOperator == '-')
        {
            vRes = vOne - vTwo;
            System.out.println("Result");
            System.out.println(vRes);

        }
        else if (vOperator == '*')
        {
            vRes = vOne * vTwo;
            System.out.println("Result");
            System.out.println(vRes);
        }
        else if (vOperator == '/'){
            vRes = vOne / vTwo;
            System.out.println("Result");
            System.out.println(vRes);

        }else{
            System.out.println("Someting wrong try again");
        }


    }
}