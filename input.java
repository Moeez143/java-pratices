import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("TAking the input form user!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = sc.nextInt();
//        System.out.println("Enter the second value");
//        int b = sc.nextInt();
//        int sum  = a+b;
//        System.out.println("The sum of these two number is :" +" "+ sum);
//        System.out.println(sum);
        String str = sc.nextLine();
        System.out.println(str);
    }
}
