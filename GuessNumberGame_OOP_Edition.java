import java.util.Scanner;

public class GuessNumberGame_OOP_Edition {
    static class Game {
        public int computerNumber;
        public int guesses = 1;
        public int input;

        public Game() {
            computerNumber = (int) Math.floor(Math.random() * 100);
        }
        public void setInput(){
            System.out.print("Enter the Number You Guess : ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();
            isCorrect();
        }
        public void isCorrect() {
            if (input==computerNumber) {
                System.out.println("Congratulation....!");
//                System.out.println("Your Guess is : " + input);
//                System.out.println("Hidden Number is : " + computerNumber);
                System.out.println("You Guess in " + guesses + " attempts");
            } else if (input<computerNumber){
                System.out.println("Your Guess Number is less than Hidden Number...! Guess AGAIN");
                guesses++;
                setInput();
            } else {
                System.out.println("Your Guess Number is Greater than Hidden Number.....! TRY AGAIN");
                guesses++;
                setInput();
            }
        }
    }
    public static void main(String[] args) {
        Game Player = new Game();
        Player.setInput();
    }
}