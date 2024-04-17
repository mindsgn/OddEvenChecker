import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input three numbers
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        // Calculate the sum
        int sum = num1 + num2 + num3;
        
        // Check if the sum is odd or even
        if (sum % 2 == 0) {
            System.out.println("The sum of the numbers is even.");
        } else {
            System.out.println("The sum of the numbers is odd.");
        }
        
        scanner.close();
    }
}
