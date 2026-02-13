import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();
        System.out.println("Before swapping: First = " + firstNum + ", Second = " + secondNum);
        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;
        System.out.println("After swapping: First = " + firstNum + ", Second = " + secondNum);
    }
}