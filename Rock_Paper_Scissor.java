import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 : Rock , 2 : Paper , 3 : Scissor");
        System.out.println("Choose Your Input");
        int user = sc.nextInt();
        int max = 3;
        int min = 1;
        int computer = (int) Math.floor(Math.random() * (max - min + 1) + min);
        if (computer == user) {
            System.out.println("Computer : " + computer);
            System.out.println("You : " + user);
            System.out.println("Draw Try Again...");
        } else if (computer == 1 && user == 2) {
            System.out.println("Computer : " + computer);
            System.out.println("You : " + user);
            System.out.println("Winner is You");
        } else if (computer == 1 && user == 3) {
            System.out.println("Computer : " + computer);
            System.out.println("You : " + user);
            System.out.println("Winner is Computer");
        } else if (computer == 2 && user == 1) {
            System.out.println("Computer : " + computer);
            System.out.println("You : "+ user);
            System.out.println("Winner is Computer");
        } else if (computer == 2 && user == 3) {
            System.out.println("Computer : " + computer);
            System.out.println("You : "+ user);
            System.out.println("Winner is You");
        } else if (computer == 3 && user == 1){
            System.out.println("Computer : " + computer);
            System.out.println("You : "+ user);
            System.out.println("Winner is You");
        } else if (computer == 3 && user == 2) {
            System.out.println("Computer : " + computer);
            System.out.println("You : "+ user);
            System.out.println("Winner is Computer");
        } else {
            System.out.println("Invalid Choose");
            System.out.println("1 : Rock , 2 : Paper , 3 : Scissor");
            System.out.println("Choose Again...");
        }
    }
}
