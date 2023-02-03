class goodMorning extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}
class welcome extends Thread{
    public void run(){
        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Welcome............!");
        }
    }
}
class example extends Thread{
    public void run(){
        System.out.println(getState());

    }
}
abstract class telePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smartTelephone extends telePhone{
    void transferRate(){
        System.out.println("Transferring bits...");
    }
    public void ring(){
        System.out.println("Telephone Ringing...");
    }
    public void lift(){
        System.out.println("Call Attended Lift...");
    }
    public void disconnect(){
        System.out.println("Telephone Is Disconnect...");
    }
}
class monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicAnimal{
    void speak(){
        System.out.println("Speaking...");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("sleeping...");
    }
}
abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainPen extends pen{
    void write(){
        System.out.println("Writing");
    }
    void refill(){
        System.out.println("Refilling");
    }
    void changeNib(){
        System.out.println("Change Nib require");
    }
}

public class execrices {
    public static void main(String[] args) {
//        human person = new human();
//        person.jump();
//        person.bite();
//        person.sleep();
//        person.eat();
//        person.speak();


//         smartTelephone phone1 = new smartTelephone();
//         phone1.ring();
//        phone1.lift();
//        phone1.disconnect();

/*
        // Polymorphism expalin here
        telePhone p1 = new smartTelephone();
        p1.disconnect(); // these lines 75,76,77 are not throw any error because these method define in these own class
        p1.lift();
        p1.ring();
//        p1.transferRate();  // these line throw error because object(p1) not in access transferRate method beacuse this method define in different class
*/
/*
        goodMorning goodMorningObj = new goodMorning();
        welcome welcomeObj = new welcome();

//        goodMorningObj.start();
//        welcomeObj.start();

        example obj = new example();
        System.out.println(obj.getState());
        obj.start();
        System.out.println(obj.getState());
*/

        try{
            int a =5 ,b=0;
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println("HAHAHA");
        }



    }
}
