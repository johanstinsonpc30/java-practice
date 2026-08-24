import java.util.Scanner;

class Basics
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something: ");
        String str = sc.nextLine();
        System.out.println("U entered :I "+ str);
    }
}