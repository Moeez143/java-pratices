import java.util.Scanner;

public class FizzBuzz_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int number = sc.nextInt();

        if(number % 5 == 0 && number % 3 == 0){
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else if (number % 5 == 0){
            System.out.println("Fizz");
        } else {
            System.out.println("REJECTED : " + number);
        }
    }
}
