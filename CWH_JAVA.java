import javax.xml.namespace.QName;
import java.util.Scanner;
class myThr1 extends Thread{
    public void run(){
        System.out.println("Thread of Class 1 ID : "+getId());

    }
}
class myThr2 extends Thread {
    public void run(){
        System.out.println("Thread of Class 2 ID: "+getId());

    }
}
class myThrP extends Thread{
    myThrP(String name){
        super(name);
    }
    myThrP(Runnable r){
        super(r);
    }
    public void run( ){
        while (true){
            System.out.println(getName());
//            System.out.println("Thread 1 is Running");
        }
//        System.out.println("Priority : "+getPriority());
      //        System.out.println("ID: "+ getId());
//        System.out.println("Name: "+ getName());
    }
}
class myThr extends Thread{
    myThr(String name){
        super(name);
    }
    myThr(Runnable r){
        super(r);
    }
    public void run( ){
        System.out.println("Thread");
        System.out.println("ID: "+ getId());
        System.out.println("Name: "+ getName());

    }
}
class runnableThread1 implements Runnable{
    public void run(){
        while (true){
            System.out.println("Thread 1 is Running");
        }
    }
}
class runnableThread2 implements Runnable{
    public void run(){
        while (true){
            System.out.println("Thread 2 is Running");
        }
    }
}
class myThread1 extends Thread{
    public void run(){
        while (true){
            System.out.println("Thread 1 is Running");
        }
    }
}
class myThread2 extends Thread{
    public void run(){
        while (true){
            System.out.println("Thread 2 is Running");
        }
    }
}
interface sampleInterface{
    void method1();
    void method2();

}
interface childInterface extends sampleInterface{
    void method3();
    void method4();
}
class sampleClass implements childInterface{
    public void method1(){
        System.out.println("Method1");
    }
    public void method2(){
        System.out.println("Method2");
    }
    public  void method3(){
        System.out.println("Method3");
    }
    public void method4(){
        System.out.println("Method4");
    }
}
interface myCamera{
    void snapTaking();
    void videoRecording();
    default void caughtIn4k(){
        System.out.println("Caught In 4K...");
    }
}
interface myWifi{
    String[] getNetworks();
    void connectToNetworks(String networks);
}
class myCellPhone{
    void callingNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void answeringCall(){
        System.out.println("Connecting to Call...");
    }
}
class mySmartPhone extends myCellPhone implements myWifi, myCamera{
    public void snapTaking() {
        System.out.println("Snap Taking Form Camera");
    }
    public void videoRecording(){
        System.out.println("Video Recording..");
    }
    public void caughtIn4k(){
        System.out.println("OverRide of Caught In 4K...");
    }
    public String[] getNetworks(){
        String [] networksList = {"PTCL","Storm Fiber","Cable Net"};
        System.out.println("Getting List Networks");
        return networksList;
    }
    public void connectToNetworks(String networks) {
        System.out.println("Connecting to "+ networks);
    }
}
interface bicycle{
    static void printing(){
        System.out.println("Pirnting");
    }
    void applyBrake();
    void speedUp();
}
interface horn{
    void horn1();
    void horn2();
}
class augCycle implements bicycle , horn{
    public void applyBrake(){
        System.out.println("Applying Brakes");
    }
    public void speedUp(){
        System.out.println("Speeding Up");
    }
//    void blowHorn(){
//        System.out.println("Blowing Horn...");
//    }
    public void horn1(){
        System.out.println("Horn 1 is Blowing by Interface Method");
    }
    public void horn2(){
        System.out.println("Horn 2 is blowing by Interface Method");
    }
}
abstract class parent {
    abstract void print();
}
class child1 extends parent {
    void print() {
         System.out.println("Printing in Child 1");
    }
}
class child2 extends parent{
    public void print(){
        System.out.println("Printing in Child 2");
    }
    void newPrint(){
        System.out.println("New Printing in Function 2 of child 2");
    }
}
class one {
    public void greet(){
        System.out.println("Good Morning In Class One....!");
    }
    public void name(){
        System.out.println("This is JAVA in CLass One...!");
    }
}
class two extends one{
    public void welcome(){
        System.out.println("Welcome in Class Two....!");
    }
    public void name(){
        System.out.println("This is JAVA in Class Two...!");
    }
}
class a{
    public int method1(){
        return 1;
    }
    public void method2(){
        System.out.println("this is Method 2 of class A");
    }
}
class b extends a{
    public void method2(){
        System.out.println("this is Method 2 of class B");
    }
    public void method3(){
        System.out.println("this is method 3 of class B");
    }
}
class baseCLass{
    public int x;
    baseCLass() {
        System.out.println("Constructor running of BASE_Class");
    }
    baseCLass(int a){
        System.out.println("Overloading Constructor with a = " + a);
    }
    baseCLass(int x,int y){
        System.out.print("BASE_CLASS Constructor x : ");
        System.out.println(x);
//        System.out.println(y);
    }
}
class driveClass extends baseCLass{
    public int y;

    driveClass(){
//        super(5);
        System.out.println("Constructor running of DRIVE_CLASS");
    }
    driveClass(int x ,int y){
        super(x,y);
//        System.out.println("Overloading Constructor of DRIVE_CLASS with x : "+ x);
        System.out.println("Overloading Constructor of DRIVE_CLASS with y : "+ y);
    }
}
class childOfDrived extends driveClass{
    childOfDrived(){
        System.out.println("Child of Drive Contructor running");
    }
    childOfDrived(int x, int y ,int z){
        super(x,y);
        System.out.println("Child of Drive Constructor with z : ");
    }
}

class  Emp{
    int id;
    int salary;
    String name;
    public Emp(){
        id =18;
        name = "Default_Name";
    }
    public Emp(String myNAme , int myID){
        id =myID;
        name = myNAme;
    }
    public void print(){
        System.out.println("Name : " + name +" , ID : " + id + " and Salary : " + salary);
    }
    public int getSalary(){
        return salary;
    }
}
class sumClass{
    int a ,b ;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int sumInCLass(){
        System.out.println("sum of 2 number in class sum");
        return a+b;
    }
}
class allClass extends sumClass{
    int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public int sumInAllClass(){
        System.out.println("sum of 3 numbers in class sxtanded of all class");
        return a+b+z;
    }
}
public class CWH_JAVA {
    static void tellJoke() {
        System.out.println("this is joke mehtod calling...!");
    }

    int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = x - y;
        }
        return z;
    }

    static void change(int[] arr) {
        arr[0] = 10;
    }

    static void morning() {
        System.out.println("Good Morning Nigga wihtout ...!");
    }

    static void morning(int x) {
        System.out.println("Good Morning " + x + " with ONE Argument Nigga...! ");
    }

    static void morning(int x, int b) {
        System.out.println("Good Morning " + x + " with TWO Argument Nigga...!");
        System.out.println("Good Morning " + b + " with TWO Argument Nigga...!");

    }

    static int sum(int a , int b){
            return a+b;
        }
        static int sum(int a , int b,int c){
            return a+b+c;
        }
        static int sum(int a , int b,int c,int d){
            return a+b+c+d;
        }

    static int sum(int... arr) {
        int result = 0;
        for (int key : arr) {
            result =result+ key;
        }
        return result;
    }

    static int factorial (int n){
        int a;
        if(n==0 || n==1){
            return 1;
        }
        else {
             a= n * factorial(n-1);
        }
        return a;
    }

    static void table(int num){
        for (int i =1; i <=10 ; i++){
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
    static void star (){
        for (int i = 5 ; i>=1 ;i--){
            for (int j =1 ; j <=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static double sumOfNumber(double number){
        if(number == 1){
            return 1;
        }
        else {
            return number + (sumOfNumber(number-1));
        }
    }
    static int fib(int n){
        if(n == 1) {
            return 0;
        }
        else if(n == 2){
            return 1;
        }
//        0 1 1 2 3 5 8 13 21 34
        else {
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
/*
        int a = 6 ,b = 5;
        CWH_JAVA obj1 = new CWH_JAVA();
        int c = obj1.logic(a,b);
        int a1 = 10 , b1 =20 , c1 = obj1.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
*/
/*        tellJoke();
        int[] marks = {20,230,30,44};
        change(marks);
        System.out.println("The change method calling : " + Arrays.toString(marks));
        int x =200 , y = 300;
        morning();
        morning(x);
        morning(x,y);
*/
//        System.out.println("The sum of 2, 3 => sum : "+ sum(2,3));
//        System.out.println("The sum of 2, 3, 4 => sum : "+ sum(2,3,4));
//        System.out.println("The sum of 2, 3, 4, 5 => sum : "+ sum(2,3,4,5));

//        System.out.println("The sum of Nothing => sum : "+ sum());

//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number for factorical : ");
//        int input = sc.nextInt();
//        System.out.print("Factoriacl of "+input+" is : "+ factorial(input));

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the Table you want : ");
//        int tableNumber = scanner.nextInt();
//        table(tableNumber);

//        star();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("How many first number you want to sum : ");
//        double num = scanner.nextDouble();
//        System.out.println("Sum of first " + num + " number is : " + sumOfNumber(num) );

//        int result = fib(4);
//        System.out.println(result);

//        Emp obito = new Emp();
//        Emp minato = new Emp();

//        minato.name = "MrMinatoPlays";
//        minato.id = 17;
//        minato.salary = 20000;
//        minato.print();

//        obito.id =12;
//        obito.name = "MrObitoPlays";
//        obito.salary = 30000;
//        obito.print();

//        int sal = obito.getSalary();
//        System.out.println(sal);

//        System.out.println("here value assign printed");
//        Emp person1 = new Emp("MrObitoPlays" , 30);
//        System.out.println(person1.id);
//        System.out.println(person1.name);
//
//        System.out.println("here default value");
//        Emp person2 = new Emp();
//        System.out.println(person2.id);
//        System.out.println(person2.name);

//        int computerNumber = (int) Math.floor(Math.random() * 100);
//        System.out.println(computerNumber);/

//        allClass var1 = new allClass();
//        var1.setA(4);
//        var1.setB(4);
//        var1.setZ(2);
//
//        System.out.println(var1.sumInCLass());
//        System.out.println(var1.sumInAllClass());

//        baseCLass bc = new baseCLass();
//        driveClass dc = new driveClass(5,6);
//        childOfDrived cod = new childOfDrived();
//        childOfDrived cod = new childOfDrived(12,13,14);
/*
        a a = new a();
        a.method2();
        b b = new b();
        b.method2();
*/

//        one obj1 = new two();
//        obj1.greet();
//        obj1.name();
/*        child1 objChild1 = new child1();
        objChild1.print();
        child2 objChild2 = new child2();
        objChild2.print();
        objChild2.newPrint();
*/

//        augCycle cycle1 = new augCycle();
//        cycle1.applyBrake();
//        cycle1.speedUp();
//        cycle1.horn1();
//        cycle1.horn2();

//        mySmartPhone ms = new mySmartPhone();
//        String[] arr = ms.getNetworks();
//        for (String key: arr){
//            System.out.println(key);
//        }
//        ms.snapTaking();
//        ms.caughtIn4k();
//         myCamera.caughtIn4k(); //for to rum this line you need to add static in method
//        ms.callingNumber(1122);
//        ms.answeringCall();

//        sampleClass obj1 = new sampleClass();
//        obj1.method1();
//        obj1.method2();
//        obj1.method3();
//        obj1.method4();

/*
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
*/
/*
        runnableThread1 inner1 = new runnableThread1();
        Thread outer1 = new Thread(inner1);
        outer1.start();

        runnableThread2 inner2 = new runnableThread2();
        Thread outer2 = new Thread(inner2);
        outer2.start();
*/
/*
        myThr t1 = new myThr("MrObitoPlays");
        Thread outerT1 = new Thread(t1);

        myThr t2 = new myThr("MrBannyPlays");
        Thread outerT2 = new Thread(t2);

        outerT1.start();
        outerT2.start();
*/
/*
        myThrP t1 = new myThrP("Thread_1");
        myThrP t2 = new myThrP("Thread_2");
        myThrP t3 = new myThrP("Thread_3");
        myThrP t4 = new myThrP("Thread_4");
        myThrP t5 = new myThrP("Thread_5");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
*/
/*
        myThr1 class1_Obj1 = new myThr1();
        myThr1 class1_Obj2 = new myThr1();
        myThr2 class2_Obj = new myThr2();
        class1_Obj1.start();
        try{
            class1_Obj1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        class1_Obj2.start();
        class2_Obj.start();
*/













    }
}
