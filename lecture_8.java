import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class lecture_8 {
    public static void main(String[] args) {
//        Date now = new Date();
//        System.out.println(now);
//        int x= 1;
//        int y =x;
//        x =2;
//        System.out.println(y);
//        this is primitive type thing done


//        Point point1 = new Point(1,2);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);
//        System.out.println(point1);
//        this is references type thing we done


//        String message = "        HELLO message"+"..!";
//        String NewMessage = message.replace("!","here the new string by replace");
//        System.out.println(message.trim());
//        System.out.println(NewMessage.toUpperCase());
//        this is give the true and false value on both function =>  endwith() & startswith()
//        length() => fuction give lenght of string
//        indexOf() => fuction give the index of that charater in string & if value return -1 than that charater not avalible in string
//replace() => function repalce the string of whole string or part of string , it have 2 arguments this is old string and second repacment string ,one more thing is that its not change the original string
//trim() => function remove the spaces on starting  and ending of string


//       String str = "c:\nWindow\t\tWorld\n.......";
//        System.out.println(str);
// \" => uesd to add Double Qouates in string
//  \\ => uesd to add / in string
//    \n => uesd to add new line

//        float [] flo = {1.1f,2.3f};
//        System.out.println(Arrays.toString(flo));
//        int [] numbers = {1,2,3,4,5};
//        int [][] Multi = {{1,2,3},{4,5,6}};
//        System.out.println(Arrays.deepToString(Multi));
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));
// array in JAVA => int[] varible_name = new int[size] are initialize the array , or we can add values directly in brakets {}
//to Print Array values => Arrays.toString(Array name)  this is uesd to print arrays
//Arrays.lenght mathod => uesd to get the lenght of array
        //In Multi Array uesd to barket => {{},{}}
        // TO print the multi array we uesd deeptoString method


//        final float pi = 3.14f;
//        System.out.println(pi);
        //to delacare the contant in JAVA we uesd  => final KEYWORD


//        int x =1;
//        int  y = (int)x+1;
//        System.out.println(y);
//        String str ="1.1";
//        double y = Double.parseDouble(str) + 2;
//        System.out.println(y);
// this is impicit casting or we say it is automating casting
// BYTE < SHORTS < INY < LONG > FLOAT > DOUBLE
// IN Expicit casting we type int with varible => int y = (int)x + 1
// With String we uesd parseInt() function uesd


//        int result = (int) Math.ceil(1.1f);
//        System.out.println(result);
// round method => gives the lower number & ceil method => give the higher number

//        int result = Math.min(1,2);
//        System.out.println(result);
// max method => give the max number in agrument
// min method => give the min number in agrument

//        int rand = (int)(Math.random()*100 );
//        System.out.println(rand);
// this is generate the random number within range 100


//        String result =NumberFormat.getPercentInstance().format(0.1);
//        System.out.println(result);
// NumberFormat => uesd for deal with number
        //getCurrencyInstance => deals with currency
        //getParcentIntances => deals with percent of that number


//for (int i =1 ; i <=10 ;i++){
//    System.out.println("i : " + i +" Squares " + i*i);
//}

//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")){
//            System.out.print("Input : ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }


//        String[] Fruits = {"Apple" ,"Mango" ,"Grapes"};
//        for (String key : Fruits) {
//            System.out.println(key);
//        }

//        for (int i = 4; i >= 1; i--) {
//            for (int y = 1 ; y<=i ; y++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Table : ");
//        int input = scanner.nextInt();
//        int n =10;
//        while (n >=1){
//            System.out.println(input + " X " + n + " = " + input*n);
//            n--;
//        }


//        float[] exp = {1.2f, 2.3f, 3.5f, 4.6f};
//        float sum = 0;
//        for (float key : exp) {
//            sum = sum + key;
//        }
//        System.out.println("sum : " + sum);

//        float[] exp = {1.2f, 2.3f, 3.5f, 4.6f};
//        float num = 3.5f;
//        boolean IsArrayFound = false;
//        for (float key : exp) {
//            if(num == key){
//                IsArrayFound = true;
//            }
//        }
//        System.out.println(IsArrayFound);

        /*
        int [] arr = {1,2,3,4,5,6};
        int lenOfArray = arr.length;
        int point = Math.floorDiv(lenOfArray , 2);
        int temp;
        for (int i = 0 ; i <point ; i++){
            temp = arr[i];
            arr[i] = arr[lenOfArray - 1 -i];
            arr[lenOfArray - 1 -i] = temp;
        }
        System.out.println("Array is now Reverse");
        System.out.println(Arrays.toString(arr));
    */


        int [] example = {12,23,3,3,65,65};
        int max =0 ;
        for (int key : example) {
            if (key > max){
                max =key;
            }
        }
        System.out.print("max : " + max );

        System.out.println();
        int min = example[0];
        for (int key : example) {
            if (key < min){
                min =key;
            }
        }
        System.out.print("min : " + min );

    }
}
