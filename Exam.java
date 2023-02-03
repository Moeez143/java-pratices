import java.lang.Thread;
import java.util.Scanner;
class thread_2021 extends Thread{
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Positive Integer :");
        int x = sc.nextInt();
        while(x<0){
            System.out.print("Please Enter the Positive Integer :");
            x = sc.nextInt();
        }
        int result = 1;
        if(x==0 || x==1){
            System.out.print("Factorial of number is :" +result);
        } else {
            for (int z = x ; z >=1 ; z--){
                result = result*z;
            }
            System.out.print("Factorial of number is :" +result);
        }
    }
}
class thread_2019 extends Thread {
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Positive number :");
        int x = sc.nextInt();
        while(x<0){
            System.out.print("Please Enter the Positive number :");
            x = sc.nextInt();
        }
        System.out.println("Printing the Odd number form 1 to that input number....");
        for(int z =1 ; z <=x ; z = z+2){
            System.out.print(z+" , ");
        }

    }
}
class thread_2018 extends Thread{
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Positive number :");
        int x = sc.nextInt();
        while(x<0){
            System.out.print("Please Enter the Positive number :");
            x = sc.nextInt();
        }
        System.out.println("Printing number form 0 to that input number....");
        for(int z =0 ; z <=x ; z++){
            System.out.println(z + " ");
        }

    }
}
class thread_2020 extends Thread{
    //2020
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int x = sc.nextInt();
        while(x<0){
            System.out.print("Please Enter the Positive number :");
            x = sc.nextInt();
        }
        System.out.print("Enter the second number :");
        int y = sc.nextInt();
        while(y<0){
            System.out.print("Please Enter the Positive number :");
            y= sc.nextInt();
        }
        int c = x+y;
        System.out.println("Thread is Running...");
        System.out.println("Sum of "+x+" and "+y+" Numbers is : "+c);

    }
}
public class Exam {
    public static void main(String[] args) {
      //2020
        System.out.println("2020");
        thread_2020 thread2020 = new thread_2020();
//        thread2020.start();

        //2018
        System.out.println("2018");
        thread_2018 thread2018 = new thread_2018();
//        thread2018.start();

        //2019
        System.out.println("2019");
        thread_2019 thread2019 = new thread_2019();
//        thread2019.start();

        //2021
        System.out.println("2021");
        thread_2021 thread2021 = new thread_2021();
//        thread2021.start();
/*
        int count =0;
        String str1 = "Hello";
        String str2 = "Hello World";
        int len1 = str1.length();
        int len2 = str2.length();
        System.out.println("length str2 = " +len2);
        for(int i = 0; i < str2.length(); i++) {
            if(str2.charAt(i) != ' ')
                count++;
        }
        System.out.println("for count : "+count);
*/
        String initial = "ABCDEFG",after = "";
        after=initial=initial.replace('A','Z');
        System.out.println(initial+","+after);

    }
}
