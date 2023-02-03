import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;

public class CWH_Pratices {
    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
//        int a = 100;
//        int b = 0;
//        int c ;
//        without try catch
//        c = a/b;
//        System.out.println("c : "+ c);
        //with Try Catch handling
//        try {
//            c = a/b;
//            System.out.println("c : "+ c);
//        }
//        catch (Exception e){
//            System.out.println("Program Fail...!");
//            System.out.println("Reason : "+e);
//        }
//        System.out.println("End of Program");

/*
        boolean flag = true;
        int [] array = new int[3];
        array[0] = 50;
        array[1] = 55;
        array[2] = 60;
        Scanner scanner = new Scanner(System.in);
        while (flag){
        System.out.print("Enter the Index Value of Array : ");
        int index = scanner.nextInt();
        System.out.print("Enter the divider value : ");
        int num = scanner.nextInt();
            try {
                System.out.println("The Value on that Index is : " + array[index]);
                System.out.println("The value after divided is : " + array[index] / num);
                flag = false;
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException Found...!");
                System.out.println(e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException Found...!");
                System.out.println(e);
            } catch (Exception e) {
                System.out.println("Some other Exception Found...!");
                System.out.println(e);
            }
        }
        System.out.println("End of program");
*/
/*
        try{
            int c = divide(6,0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("end here");
*/
        /*
        int a = 9, b = 5;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("The value of b = " + b);
            }
            b--;
        }
*/
        /*
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.addLast(34);
        l1.addFirst(23);
        for (int i =0 ; i < l1.size();i++){
            System.out.print(l1.get(i)+"->");
        }
*/
        /*
        HashSet myHash = new HashSet(5,1.5f);
        myHash.add(5);
        myHash.add(4);
        myHash.add(3);
        myHash.add(2);
        myHash.add(1);
        System.out.println(myHash);
*/
        /*
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        Date d = new Date();
        System.out.println(d.getTime());
        System.out.println(d.getDate()  );
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
*/












    }
}