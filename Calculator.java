import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        double n1 = sc.nextDouble();
        System.out.println("Enter num2");
        double n2 = sc.nextDouble();
        double sum = n1 + n2;
        double diff = n1 - n2;
        double multi = n1 * n2;
        System.out.println("Sum: "+sum);
        System.out.println("Diff: "+diff);
        System.out.println("Multiplication: "+multi);
        if(n2==0)
        {
            System.out.println("Cannot be divided by zero");
        }
        else{
            System.out.println("Quotient: "+ n1/n2);
        }
        sc.close();
    }
}
