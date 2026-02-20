import java.util.Scanner;
public class OddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();
        System.out.println((num%2==0 ? "even" : "odd"));
    
        
    }
    
}
